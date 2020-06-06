package com.sgcc;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import java.io.IOException;
import java.net.URL;

/**
 * Created by huigou on 2019/6/23.
 */
public class DemoController {
    private static final int PROT = 8087;

    public static void main(String args[]) throws Exception {
        if(isInJar()){
            startInJar();
        }else{
            startInIDE();
        }
    }

    // 通过java -jar xxx.jar 启动
    public static void startInJar() throws Exception {
        System.out.println("jar ---- Running Jetty server on port :" + PROT);
        Server server = new Server(PROT);
        WebAppContext root = new WebAppContext();
        // 获取jar包里面的webapp路径
        final URL webappUrl = DemoController.class.getClassLoader().getResource("webapp");
        final String webappUrlStr = webappUrl.toExternalForm();
        System.out.println(webappUrlStr);
        root.setContextPath("/");
        // 关键步骤 : 设置webapp的目录路径:  jar:file:/path_to_jar!/webapp
        root.setWar(webappUrlStr);
        server.setHandler(root);
        server.start();
        server.join();
    }


    // ide 里面启动
    public static void startInIDE() throws Exception {
        System.out.println("ide -- Running Jetty server on port " + PROT);
        Server server = new Server(PROT);
        WebAppContext root = new WebAppContext();
        root.setContextPath("/");

        // 设置源码的配置文件。
        root.setDescriptor("src/main/webapp/WEB-INF/web.xml");
        root.setResourceBase("src/main/webapp/");
        server.setHandler(root);
        server.start();
        server.join();
    }


    private static Boolean isInJar() throws IOException {
        String classPath = DemoController.class.getProtectionDomain().getCodeSource().getLocation().toExternalForm();
        if(classPath.indexOf(".jar") != -1){
            return true;
        }
        return false;
    }
}
