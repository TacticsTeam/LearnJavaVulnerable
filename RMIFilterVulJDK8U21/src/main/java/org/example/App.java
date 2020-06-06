package org.example;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws RemoteException, AlreadyBoundException, MalformedURLException {
        HelloService helloService = new HelloServiceImpl();
        //注册服务
        LocateRegistry.createRegistry(12306);
        Naming.bind("rmi://localhost:12306/helloService", helloService);
        System.out.println("Servermain provide RPC Run now ");

        //sun.rmi.registry.RegistryImpl registry;
        //
    }
}
