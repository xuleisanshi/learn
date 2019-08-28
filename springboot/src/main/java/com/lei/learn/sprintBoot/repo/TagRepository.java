package com.lei.learn.sprintBoot.repo;

import com.lei.learn.sprintBoot.bean.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
