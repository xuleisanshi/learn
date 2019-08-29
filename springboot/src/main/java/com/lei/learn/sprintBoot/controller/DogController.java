package com.lei.learn.sprintBoot.controller;

import com.lei.learn.sprintBoot.bean.Dog;
import com.lei.learn.sprintBoot.service.Impl.DogServiceImpl;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {

    private DogServiceImpl dogService;

    @Autowired
    public DogController(DogServiceImpl dogService) {
        this.dogService = dogService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Dog saveDog(@RequestBody Dog dog) {
        return dogService.save(dog);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Dog> getAllDogs(){
        return dogService.getAllDogs();
    }
}
