package org.czy.com;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @auther 陈郑游
 * @时间 2017/5/11 0011
 * @功能
 * @问题
 * @博客地址：http://blog.csdn.net/javawebrookie
 * @GitHub地址：https://github.com/AndyCZY
 * @GitBook地址：https://www.gitbook.com/@chenzhengyou
 */
public class ServletInitializer extends SpringBootServletInitializer {

    /**
     * 这样就能生成WAR文件了。但如果WAR文件里没有启用Spring MVC DispatcherServlet的web.xml文件
     或者Servlet初始化类，这个WAR文件就一无是处。此时就该Spring Boot出马了。它提供的SpringBootServletInitializer
     是一个支持Spring Boot的Spring WebApplicationInitializer实现。除了配置Spring的DispatcherServlet，
     SpringBootServletInitializer还会在Spring应用程序上下文里查找Filter、Servlet或ServletContextInitializer类型
     的Bean，把它们绑定到Servlet容器里。
     *
     */
    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        // 期间它调用 sources() 方法注册了一个 Spring 配置类
        return builder.sources(Application.class);
    }
}
