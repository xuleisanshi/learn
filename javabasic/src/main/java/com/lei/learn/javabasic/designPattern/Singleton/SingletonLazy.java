package com.lei.learn.javabasic.designPattern.Singleton;

public class SingletonLazy {
  //  private  static SingletonLazy instance = null;
  private volatile static SingletonLazy instance = null;//双重校验锁，是禁止指令重排序优化

  private SingletonLazy() {

  }

  //  public static synchronized SingletonLazy getInstance() {//线程安全
  //    if (instance == null) {
  //      instance = new SingletonLazy();
  //    }
  //    return instance;
  //  }

  //  public static SingletonLazy getInstance(){//线程不安全
  //    if (instance == null){
  //      instance = new SingletonLazy();
  //    }
  //    return instance;
  //  }

  public static SingletonLazy getInstance() {
    if (instance == null) {
      synchronized (SingletonLazy.class) {
        instance = new SingletonLazy();
      }
    }
    return instance;
  }
}
