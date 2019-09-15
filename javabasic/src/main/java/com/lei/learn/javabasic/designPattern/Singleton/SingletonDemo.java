package com.lei.learn.javabasic.designPattern.Singleton;

public class SingletonDemo {

    public static SingletonDemo uniqueInstance = new SingletonDemo();

    private SingletonDemo() {
    }

    public static SingletonDemo getUniqueInstance() {
        return uniqueInstance;
    }
}
