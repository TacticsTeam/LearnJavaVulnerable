package org.javaweb.service;

/**
 * Created by huigou on 2018/3/21.
 */
public class UserServiceImpl implements UserService {
    public String login(String username, String password) {
        return "登录成功";
    }

    public String modfiyPassword(String username, String RePassword) {
        return "密码修改成功";
    }

    public String deleteUser(String username) {
        return "删除成功";
    }

    public String deleteUserByid(String userid) {
        return "删除成功";
    }
}
