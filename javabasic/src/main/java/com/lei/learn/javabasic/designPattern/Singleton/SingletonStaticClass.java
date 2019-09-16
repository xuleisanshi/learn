package com.lei.learn.javabasic.designPattern.Singleton;

public class SingletonStaticClass {

  public static class SingletonHelper {
    public static SingletonStaticClass instance = new SingletonStaticClass();
  }

  private SingletonStaticClass() {
  }

  public static SingletonStaticClass getInstance() {
    return SingletonHelper.instance;
  }
}
