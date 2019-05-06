package com.lei.learn.sprintBoot.controller;

import com.lei.learn.sprintBoot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    Person person;
    @RequestMapping("/hello")
    public String hello() {
        return person.getName();
    }

}
