package org.czy.com.mybatis.xml.service;


import org.czy.com.mybatis.xml.mapper.UserMapper;
import org.czy.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther 陈郑游
 * @create 2017/5/5 0005
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */

@Service
public class UserService {


    @Autowired
    public UserMapper userMapper;

    public User findUserById(Integer id){
        return userMapper.findUserById(id);
    }
}
