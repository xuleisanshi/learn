package com.lei.learn.javabasic.basic;

import java.util.Objects;

public class EqualDemo {

    public static class Demo {
        private String name;

        public Demo() {
        }
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        System.out.println(Objects.equals(demo, null));
        System.out.println(Objects.equals(null, null));


        Integer a = 128;
        Integer b = 128;
        System.out.println(Objects.equals(a, b));// 
        System.out.println(a==b);//false,缓存区间是[-128,127],这个区间之外，就是重新分配内存空间。


    }
}
