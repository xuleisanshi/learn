package com.lei.learn.sprintBoot.repo;

import com.lei.learn.sprintBoot.bean.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
