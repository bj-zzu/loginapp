package com.zhm.dao;

import com.zhm.entity.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/9/2.
 */
public interface UserDao {

    @Insert("insert into user(username,password) values(#{username},#{password})")
    int insert(User user);

    @Select("select id,username,password from user where username=#{username} and password=#{password}")
    User select(@Param("username") String username,@Param("password") String password);
    
    @Delete("delete from user where username=#{username} and password=#{password}")
    boolean delete(User u);
}
