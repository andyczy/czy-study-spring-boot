package org.czy.com;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther 陈郑游
 * @create 2017/5/5 0005
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */


// 第一种方式：extends WebMvcConfigurerAdapter
@SpringBootApplication
public class Application {


    // 第二种FastJsonConverters.java方式：记得注释掉Json_Application,免得报错！
    // mvn spring-boot:run或在IDE中运行main()方法，
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class, args);
    }

}
