package org.czy.com.pojo;

import com.alibaba.fastjson.annotation.JSONField;
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

@ComponentScan
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    public int id;
    public String username;

    // 是fastJson的注解
    @JSONField(format = "yyyy-MM-dd HH:mm")
    public Date birthday;
    public String sex;
    public String address;


    public User(){

    }


    public User(int id, String username, Date birthday, String sex, String address) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
