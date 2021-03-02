package com.shangqi.fdapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/jsp")
    public String testJsp(){
        // 访问jsp为jsp/xxxx.jsp
        return "jsp/test";
    }
    @GetMapping("/html")
    public String testHtml(){
        // 访问jsp为html文件名
        return "test";
    }

}
