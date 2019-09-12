package com.lei.learn.javabasic.thread;

import java.util.concurrent.locks.ReentrantLock;

public class TestDemo {

  private String name;
  private Integer age;

  public TestDemo() {

  }

  public String getName() {
    ReentrantLock reentrantLock = new ReentrantLock();
    return name;
  }

  public synchronized void setName(String name) throws InterruptedException {
    Thread.sleep(10000);
    System.out.println("Set name: " + name);
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    System.out.println("Set age: " + age);
    this.age = age;
  }
}

