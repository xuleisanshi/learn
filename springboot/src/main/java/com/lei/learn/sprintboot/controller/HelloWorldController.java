package com.lei.learn.sprintboot.controller;

import com.lei.learn.sprintboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${person.name}")
    private  String name;

    @RequestMapping("/hello")
    public String hello() {
        return name;
    }


}
