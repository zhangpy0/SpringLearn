package com.zhangpy.springLearn.service;

import com.zhangpy.springLearn.bean.User;
import com.zhangpy.springLearn.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserByName(String username){
        return userMapper.getUserByName(username);
    }

    public User getUserByNameAndPassword(String username,String password){
        return userMapper.getUserByNameAndPassword(username,password);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public void addUser(String username,String password){
        userMapper.addUser(username,password);
    }
}
