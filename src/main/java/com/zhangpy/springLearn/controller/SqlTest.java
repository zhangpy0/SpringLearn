package com.zhangpy.springLearn.controller;

import com.zhangpy.springLearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sql")
public class SqlTest {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String getUser(){

        String res = userService.getUserByName("zpc").toString();
        System.out.println(res);
        return res;
    }

    @RequestMapping("/user2")
    public String getUser2(){

        String res = userService.getUserByNameAndPassword("6","6").toString();
        System.out.println(res);
        return res;
    }

    @RequestMapping("/list")
    public String getUserList(){
        String res = userService.findAll().toString();
        System.out.println(res);
        return res;
    }

    @RequestMapping("/add")
    public String addUser(){
        userService.addUser("spring","spring");
        return "success";
    }
}
