package com.lei.learn.sprintBoot.controller;

import com.lei.learn.sprintBoot.bean.Book;
import com.lei.learn.sprintBoot.repo.ReadingListReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class ReadingListController {

  private ReadingListReopsitory readingListReopsitory;

  @Autowired
  public ReadingListController(ReadingListReopsitory readingListReopsitory) {
    this.readingListReopsitory = readingListReopsitory;
  }

  @RequestMapping(value = "/readinglist/{reader}", method = RequestMethod.GET)
  public List<Book> readersBooks(@PathVariable("reader") String reader) {
    List<Book> books = readingListReopsitory.findByReader(reader);
    return books;
  }

  @RequestMapping(value = "/readinglist", method = RequestMethod.GET)
  public List<Book> readersBooks() {
    List<Book> books = readingListReopsitory.findAll();
    return books;
  }

  @RequestMapping(value = "/readinglist", method = RequestMethod.POST)
  public Book addReadingList(@RequestBody Book book) {
    return readingListReopsitory.save(book);
  }
}

