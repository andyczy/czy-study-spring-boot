package org.czy.com.mybatis.xml.controller;

import org.czy.com.mybatis.xml.service.UserService;
import org.czy.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Auther 陈郑游
 * @Data 2017/10/16 0016
 * @Description:
 * @CSDN:http://blog.csdn.net/javawebrookie
 * @GITHUB:https://github.com/AndyCZY
 */
@Controller
public class UserTmeplates {

    @Autowired
    public UserService userService;

    // http://localhost:8080/czy/findUserTmeplates?id=1
    @RequestMapping(value = "/findUserTmeplates")
    public String findUserTmeplates(Integer id , Map<String,Object> map) {
        User user = userService.findUserById(id);
        String str = user.toString();
        map.put("thymeleaf",str);
        return "index";
    }

}
