package com.zhangpy.springLearn.controller;

import com.zhangpy.springLearn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageTest {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/test500")
    public String test500() {
        int i = 1/0;
        return "index";
    }

    @RequestMapping("user")
    public String user(Model model) {
        User user = new User(4,"张三","123456","test@gmail.com");
        model.addAttribute("user",user);
        return "user";
    }
}
