package org.czy.com.mybatis.xml.controller;


import org.czy.com.mybatis.annotation.service.UserService;
import org.czy.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther 陈郑游
 * @create 2017/5/4 0004
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@RestController
public class UserController {

    @Autowired
    public UserService userService;



    // http://localhost:8080/czy/findUser?id=1
    @RequestMapping(value = "/findUser")
    @ResponseBody
    public String findUserById(Integer id) {
        User user = userService.findUserById(id);
        return user.toString();
    }
}
