package com.zhangpy.springLearn.controller;

// get/post请求， 已完成 ，使用python模拟post请求

import com.zhangpy.springLearn.bean.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mvc")
public class MVCTest {
    @RequestMapping("/user/{id}/{username}")
    public String getUser(@PathVariable("id") long id,@PathVariable("username") String username){
        return "id:"+id+" username:"+username;
    }

    @RequestMapping("/user2")
    public String getUser2(@RequestParam(value = "id",required = false) long id,@RequestParam(value = "username",required = false) String username){
        return "id:"+id+" username:"+username;
    }

    @RequestMapping(value = "/form1",produces = "application/json;charset=UTF-8",method = RequestMethod.POST)
    public String getForm(@RequestParam(value = "username",required = false) String username,@RequestParam(value = "password",required = false) String password){
        System.out.println("username:"+username+" password:"+password);
        return "username:"+username+" password:"+password;
    }

    @RequestMapping(value = "/form2",produces = "application/json;charset=UTF-8",method = RequestMethod.POST)
    public String getForm2(@RequestBody User user){
        System.out.println("username:"+user.getUsername()+" password:"+user.getPassword());
        return "username:"+user.getUsername()+" password:"+user.getPassword();
    }
}
