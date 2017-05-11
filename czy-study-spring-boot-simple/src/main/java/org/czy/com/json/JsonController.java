package org.czy.com.json;

import org.czy.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @auther 陈郑游
 * @时间 2017/5/10 0010
 * @功能
 * @问题
 * @博客地址：http://blog.csdn.net/javawebrookie
 * @GitHub地址：https://github.com/AndyCZY
 * @GitBook地址：https://www.gitbook.com/@chenzhengyou
 */

@RestController
public class JsonController {


    // 当我们运行 Application.java肯定报错，因为没有找到Bean；
    // 这时，需要我们编写注入文件；
    @Autowired
    private User user;

    /**
     * 1、Jackson-json案例   spring boot 包含这个依赖，所以不用添加。
     *
     * 2、Fastson-json案例   自己动手添加依赖，需要extends WebMvcConfigurerAdapter。
     */


    // http://localhost:8080/czy/getJson
    @RequestMapping(value = {"/getJson"}, method = RequestMethod.GET)
    //@ResponseBody   有@RestController就可以了，具体上一节说的属性配置。
    public User getJson() {
        // User user = new User();
        // 我们先用这个，往后讲注入方法
        user.setId(2018);
        user.setUsername("陈郑游");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("三亚市");
        return user;
    }


}
