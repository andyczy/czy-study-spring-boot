# description：microservice-spring-boot-study
##### 博客地址：http://blog.csdn.net/javawebrookie
##### 作者：陈郑游(郑宇)
##### Take the dream life!



## 更新目录
##### spring-boot 学习记录
    
#### 第一章 基础知识
    mian方法：@SpringBootApplication注解
    观看源码可知是相当于
              @Target
              @Retention
              @Documented
              @Inherited
              @SpringBootConfiguration
              @EnableAutoConfiguration
              @ComponentScan
    这个几个注解，其中@Configuration、@ComponentScan是spring框架的语法，在spring 3.x就有了，用于代码
    方式创建配置信息和扫描包。



##### 配置说明
Spring Boot默认提供静态资源目录位置需置于classpath下，目录名需符合如下规则：    

    1、/static
    2、/public
    3、/resources
    4、/META-INF/resources



##### 自定义属性与加载
    1、我们在配置文件里写 messageValue.message ，可以通过@Value("${属性名}")注解来加载对应的配置属性。
    2、随机数 messageValue.value: ${random.value} 就可以获取了。
    
    
    
##### 新增注解说明
    1、@RestController：Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，
    如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式。
    
    
    








## 参考文献
https://github.com/spring-projects/spring-boot  
https://github.com/mybatis/spring-boot-starter      
    

## 更多问题
1、Mixing thymeleaf and jsp files in Spring Boot？
[[stackoverflow]](https://stackoverflow.com/questions/31985798/mixing-thymeleaf-and-jsp-files-in-spring-boot/43818962#43818962)         











