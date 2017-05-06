package org.czy.com.mybatis.annotation;

import org.mybatis.spring.annotation.MapperScan;
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

/**
 * @ MapperScan 和interface UserMapper clashong这两个注解是同一个意思
 * 扫描：该包下相应的class,主要是MyBatis的持久化类。
 *
 */
//@MapperScan("org.czy.spring.boot.mybatis.annotation.mapper")
@SpringBootApplication
public class AnnotationApplication {


    // mvn spring-boot:run或在IDE中运行main()方法，
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(AnnotationApplication.class, args);
    }
}
