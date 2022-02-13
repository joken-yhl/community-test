package com.yhl.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    //登录默认页面
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
