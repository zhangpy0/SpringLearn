package com.zhangpy.springLearn.controller;

import com.zhangpy.springLearn.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonTest {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/user")
    public User getUser() {
        return new User(1, "test", "test", "test");
    }

    @RequestMapping("/list")
    public List<User> getList() {
        return List.of(new User(1, "test", "test", "test"), new User(2, "test2", "test2", "test2"));
    }

    @RequestMapping("/array")
    public User[] getArray() {
        return new User[] {new User(1, "test", "test", "test"), new User(2, "test2", "test2", "test2")};
    }

    @RequestMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("username", null);
        map.put("password", "test");
        map.put("email", "test");
        return map;
    }
}
