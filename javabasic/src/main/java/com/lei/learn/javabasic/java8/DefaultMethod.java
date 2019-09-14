package com.lei.learn.javabasic.java8;

public interface DefaultMethod {

    int plus(int a);

    default int calculate(int a) {
        return a * a;
    }

}
