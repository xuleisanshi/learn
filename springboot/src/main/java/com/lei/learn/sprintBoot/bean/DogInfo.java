package com.lei.learn.sprintBoot.bean;

import javax.persistence.*;

@Entity
public class DogInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Category;

    @OneToOne
    @JoinColumn(name = "dogId")
    private Dog dog;


    public DogInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
