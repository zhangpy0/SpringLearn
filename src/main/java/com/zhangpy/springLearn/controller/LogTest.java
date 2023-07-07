package com.zhangpy.springLearn.controller;

// 自定义日志设置

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @RequestMapping("/test")
    public String test() {
        logger.trace("this is trace");
        logger.debug("this is debug");
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");
        return "test";
    }
}
