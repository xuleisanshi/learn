package com.lei.learn.javabasic.thread;

public class ThreadDemo {
  public static void main(String[] args) throws InterruptedException {
    //    ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
    //    ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
    //    for (ThreadInfo a : threadInfos) {
    //      System.out.println("[" + a.getThreadId() + "]: " + a.getThreadName());
    //    }

    TestDemo testDemo1 = new TestDemo();
    TestDemo testDemo2 = new TestDemo();
    testDemo1.setName("hello1");
    testDemo2.setName("hello2");
    testDemo1.setAge(18);
  }
}
