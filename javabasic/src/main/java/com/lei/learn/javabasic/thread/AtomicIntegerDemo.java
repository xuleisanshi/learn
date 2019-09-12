package com.lei.learn.javabasic.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
  private AtomicInteger atomicInteger = new AtomicInteger();

  public void increment() {
    atomicInteger.incrementAndGet();
  }

  public int getCount() {
    return atomicInteger.get();
  }

}
