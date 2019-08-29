package com.lei.learn.sprintBoot.repo;

import com.lei.learn.sprintBoot.bean.DogInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogInfoRepository extends JpaRepository<DogInfo, Long> {
}
