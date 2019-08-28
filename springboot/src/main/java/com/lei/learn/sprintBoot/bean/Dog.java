package com.lei.learn.sprintBoot.bean;

import javax.persistence.*;

@Entity
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
    private String name;
    private Integer age;

    @OneToOne(mappedBy = "dog")
    private DogInfo dogInfo;

    public Dog() {
    }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DogInfo getDogInfo() {
    return dogInfo;
  }

  public void setDogInfo(DogInfo dogInfo) {
    this.dogInfo = dogInfo;
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
