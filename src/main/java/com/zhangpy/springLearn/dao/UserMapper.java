package com.zhangpy.springLearn.dao;

import com.zhangpy.springLearn.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    User getUserByName(String username);

    User getUserByNameAndPassword(String username,String password);

    void addUser(String username,String password);

    List<User> findAll();
}
