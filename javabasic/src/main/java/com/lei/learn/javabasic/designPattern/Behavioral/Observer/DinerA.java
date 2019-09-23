package com.lei.learn.javabasic.designPattern.Behavioral.Observer;

public class DinerA implements Diners {
    private String name;

    public DinerA(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + ": 吃面咯");

    }
}
