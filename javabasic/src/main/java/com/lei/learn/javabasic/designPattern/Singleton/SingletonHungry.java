package com.lei.learn.javabasic.designPattern.Singleton;

public class SingletonHungry {

  public static SingletonHungry uniqueInstance = new SingletonHungry();

  private SingletonHungry() {
  }

  public static SingletonHungry getUniqueInstance() {
    return uniqueInstance;
  }
}
