package com.lei.learn.sprintBoot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private String id;
  private String name;
  private Integer age;

  @Override
  public String toString() {
    return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
