package com.jd.controller;

import com.jd.enity.User_Info;
import com.jd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public User_Info login(User_Info user){
        //传进来用户填写的登录账户（可name,phone,email)和密码password
        return userService.checkUser(user);
    }

    @RequestMapping("/registered")
    public int registered(User_Info user){

        System.out.println("帅气");
        int a=userService.insertUser(user);

        return a;
    }
}
