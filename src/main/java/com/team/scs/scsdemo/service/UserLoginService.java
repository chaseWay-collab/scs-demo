package com.team.scs.scsdemo.service;

import com.team.scs.scsdemo.entity.user;
import com.team.scs.scsdemo.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {
    /**
     * 注入dao
     */
    @Autowired
    private userMapper usermapper;

    //用户登录
    public user userLogin(String username, String password){
        user user = usermapper.userlogin(username,password);
        return user;
    }

    //注册新用户
    public int adduser(String username,String password,int age){
        return usermapper.adduser(username,password,age);
        //return usermapper.adduser1(username,password,age);     //对应sql语句中的第二种注册方式
    }

}
