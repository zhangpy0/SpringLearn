package com.zhangpy.springLearn.controller;

import com.zhangpy.springLearn.bean.JsonResult;
import com.zhangpy.springLearn.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/json2")
public class JsonTest2 {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/user")
    public JsonResult<User> getUser() {
        User user = new User(1, "test", "test", "test");
        return new JsonResult<>(0, "this is user", user);
    }

    @RequestMapping("/list")
    public JsonResult<User[]> getList() {
        return new JsonResult<>(0, "this is list", new User[] {new User(1, "test", "test", "test"), new User(2, "test2", "test2", "test2")});
    }

    @RequestMapping("/map")
    public JsonResult<Map<String, Object>> getMap() {
        User user = new User(1, "test", "test", "test");
        Map<String,Object> map = new HashMap<>();
        map.put("this user", user);
        return new JsonResult<>(0, "this is map", map);
    }
}
