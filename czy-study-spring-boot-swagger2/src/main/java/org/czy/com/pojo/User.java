package org.czy.com.pojo;

import org.springframework.context.annotation.ComponentScan;

import java.io.Serializable;
import java.util.Date;

/**
 * @auther 陈郑游
 * @create 2017/5/4 0004
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
