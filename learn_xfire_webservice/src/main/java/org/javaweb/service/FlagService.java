package org.javaweb.service;

/**
 * Created by huigou on 2018/3/21.
 */
public interface FlagService {
    public String showAll(String flagname);
    public String getFlag(String password);
    public String oauth(String token);
}
