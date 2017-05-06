package org.czy.com.controller;

import org.czy.com.pojo.User;
import org.czy.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther 陈郑游
 * @create 2017/5/6 0006
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> getUser(){
        return userService.getUser();
    }
}
