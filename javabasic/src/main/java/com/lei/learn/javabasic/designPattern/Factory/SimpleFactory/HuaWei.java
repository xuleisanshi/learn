package com.lei.learn.javabasic.designPattern.Factory.SimpleFactory;

public class HuaWei implements Phone {
    @Override
    public void getPhoneName() {
        System.out.println("HuaWei produced!");
    }
}
