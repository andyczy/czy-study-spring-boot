package org.czy.com.mybatis.xml.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.czy.com.pojo.User;


/**
 * @auther 陈郑游
 * @create 2017/5/4 0004
 * @功能
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */

@Mapper
public interface UserMapper {

    User findUserById(@Param("id") Integer id);

}
