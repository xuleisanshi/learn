package com.lei.learn.javabasic.designPattern.Creatational.Singleton;

public enum SingletonEnum {
  INSTANCE;
  private SingletonResource instance;

  private void doSomething() {
    instance = new SingletonResource();
  }

  public SingletonResource getInstance() {
    return instance;
  }
}
