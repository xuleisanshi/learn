package com.lei.learn.sprintBoot.repo;

import com.lei.learn.sprintBoot.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
