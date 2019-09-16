package com.lei.learn.javabasic.designPattern.Factory.SimpleFactory;

public class FactoryDemo {

    public static void main(String[] args) {
        Phone apple = PhoneFactory.makePhone("Apple");
        Phone huaWei = PhoneFactory.makePhone("HuaWei");
        apple.getPhoneName();
        huaWei.getPhoneName();

        Apple apple1 = (Apple) PhoneFactory.makePhone2(Apple.class);
        HuaWei huaWei1 = (HuaWei) PhoneFactory.makePhone2(HuaWei.class);
        apple1.getPhoneName();
        huaWei1.getPhoneName();
    }
}
