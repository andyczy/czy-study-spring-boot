package org.czy.com.freemarker;


import org.czy.com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther 陈郑游
 * @create 2017/5/4 0004
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@Controller
public class FreemarkerController {



    // http://localhost:8080/czy/freemarker
    @RequestMapping(value = "/freemarker", method = RequestMethod.GET)
    public String getFreemarker(Model model) {

        List<User> list = new ArrayList<User>();
        User u1 = new User(11, "郑宇","1994-07","男","深圳");
        User u2 = new User(12, "陈郑游","1994-09","男","深圳");
        list.add(u2);

        model.addAttribute("userList", list.toString());
        model.addAttribute("hello", "Spring Boot 集成 FreeMarker!");

        return "hello";
    }

}
