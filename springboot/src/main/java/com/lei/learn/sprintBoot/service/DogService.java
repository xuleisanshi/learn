package com.lei.learn.sprintBoot.service;

import com.lei.learn.sprintBoot.bean.Dog;

import java.util.List;

public interface DogService {

    Dog save(Dog dog);

    List<Dog> getAllDogs();
}
