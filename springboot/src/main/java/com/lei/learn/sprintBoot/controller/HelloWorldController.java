package com.lei.learn.sprintBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "https://www.baidu.com/");
        return "index";
    }

    @RequestMapping("/admin")
    public String admin(ModelMap map) {
        return "admin";
    }

    @RequestMapping("/user")
    public String user(ModelMap map) {
        return "user";
    }

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello", "world");
        return "user";
    }
}
