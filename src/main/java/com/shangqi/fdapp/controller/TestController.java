package com.shangqi.fdapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/jsp")
    public String testJsp(){
        LOGGER.error("--error--");
        // 访问jsp为jsp/xxxx.jsp
        return "jsp/test";
    }
    @GetMapping("/html")
    public String testHtml(){
        // 访问html为html文件名
        return "test";
    }

}
