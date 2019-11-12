package com.team.scs.scsdemo.mapper;

import com.team.scs.scsdemo.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface userMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);

    //用户登录
    user userlogin(@Param("name") String name, @Param("pass") String pass);

    //注册新用户(方式1)
    int adduser(@Param("name") String name, @Param("pass") String passw, @Param("age") int age);

    //注册新用户（方式2）
    int adduser1(@Param("name") String name, @Param("pass") String pass, @Param("age") int age);

}