package org.czy.com.service;

import org.czy.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @auther 陈郑游
 * @create 2017/5/6 0006
 * @功能    查询用户列表
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
@Service
public class UserService {

    // jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private String sql = "SELECT  id, username, birthday ,sex ,address  FROM user";



    // 查询用户列表
    // 其实开发的时候我都是用mybatis、JdbcTemplate这个很少用
    public List<User> getUser(){

        return (List<User>) jdbcTemplate.query(sql, new RowMapper<User>(){

            // RowMapper内部方法
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setSex(rs.getString("birthday"));
                user.setAddress(rs.getString("sex"));
                user.setBirthday(rs.getString("address"));
                return user;
            }

        });
    }
}
