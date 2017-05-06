package org.czy.com.mybatis.annotation.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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


/**
 * @ MapperScan 和interface UserMapper clashong这两个注解是同一个意思
 * 扫描：该包下相应的class,主要是MyBatis的持久化类。
 *
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findUserById(@Param("id") Integer id);

}
