package com.lei.learn.javabasic.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.getAndSet(2));
    }
}
