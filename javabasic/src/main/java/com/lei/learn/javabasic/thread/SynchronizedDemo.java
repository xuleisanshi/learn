package com.lei.learn.javabasic.thread;

public class SynchronizedDemo {
  public void method() {
    synchronized (this) {
      System.out.println("Sync代码块");
    }
  }
}
