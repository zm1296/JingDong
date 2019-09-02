package com.jd.service;

import com.jd.enity.User_Info;

import java.util.List;

public interface UserService {
    public User_Info checkUser(User_Info user);
    public User_Info getUserInfo(int id);
    public List<User_Info> getAllUser();
    public boolean del_user(int del);
    public boolean add_user(User_Info add);

    public int insertUser(User_Info user);

}
