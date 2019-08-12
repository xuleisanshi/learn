package com.lei.learn.sprintBoot.repo;

import com.lei.learn.sprintBoot.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListReopsitory extends JpaRepository<Book, Long> {
  
  List<Book> findByReader(String reader);
}
