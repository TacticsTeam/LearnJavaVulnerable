package org.javaweb.service;

/**
 * Created by huigou on 2018/3/21.
 */
public interface UserService {
    public String login(String username,String password);
    public String modfiyPassword(String username,String RePassword);
    public String deleteUser(String username);
    public String deleteUserByid(String userid);
}
