package com.lei.learn.javabasic.java8;

public class DefaultMethodDemo {


    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod() {
            @Override
            public int plus(int a) {
                return calculate(a) + a;
            }
        };

        System.out.println(defaultMethod.calculate(10));
        System.out.println(defaultMethod.plus(10));


    }
}
