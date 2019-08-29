package com.lei.learn.sprintBoot.service.Impl;

import com.lei.learn.sprintBoot.bean.Dog;
import com.lei.learn.sprintBoot.repo.DogRepository;
import com.lei.learn.sprintBoot.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {


    private DogRepository dogRepository;

    @Autowired
    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Dog save(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public List<Dog> getAllDogs() {
        return dogRepository.findAll()  ;
    }
}
