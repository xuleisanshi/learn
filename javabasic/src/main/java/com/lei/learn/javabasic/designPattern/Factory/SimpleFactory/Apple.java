package com.lei.learn.javabasic.designPattern.Factory.SimpleFactory;

public class Apple implements Phone {//具体产品类concrete product
    @Override
    public void getPhoneName() {
        System.out.println("iPhone produced!");
    }
}
