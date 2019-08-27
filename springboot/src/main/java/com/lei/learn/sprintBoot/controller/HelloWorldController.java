package com.lei.learn.sprintBoot.controller;

import com.lei.learn.sprintBoot.aop.RequestLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@RequestMapping("/hello")
public class HelloWorldController {

  /*  @RequestMapping("/")
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
    }*/

  @RequestMapping(value = "/world", method = RequestMethod.GET)
  @RequestLog()
  public String helloWorld() {
    return "hello world";
  }
}
