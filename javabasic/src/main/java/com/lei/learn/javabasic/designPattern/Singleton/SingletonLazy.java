package com.lei.learn.javabasic.designPattern.Singleton;

public class SingletonLazy {
  private static SingletonLazy instance = null;

  private SingletonLazy() {

  }

  public static synchronized SingletonLazy getInstance() {//线程安全
    if (instance == null) {
      instance = new SingletonLazy();
    }
    return instance;
  }

  //  public static SingletonLazy getInstance(){//线程不安全
  //    if (instance == null){
  //      instance = new SingletonLazy();
  //    }
  //    return instance;
  //  }
}
