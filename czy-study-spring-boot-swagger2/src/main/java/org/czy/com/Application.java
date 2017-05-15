package org.czy.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auther 陈郑游
 * @create 2017/5/5 0005
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@SpringBootApplication
public class Application {

    // 根据Spring Boot扫描（根包到子包的原则）,这里我就写一个main 方法。
    // 如果需要，某包下有多一个Application.java

    // mvn spring-boot:run或在IDE中运行main()方法，
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class, args);
    }
}
