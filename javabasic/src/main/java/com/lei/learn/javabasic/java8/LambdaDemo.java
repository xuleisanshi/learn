package com.lei.learn.javabasic.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

    public static final String JEFF = "jeff";

    public static void main(String[] args) {
        List<String> list = Arrays.asList(JEFF, "rinda", "linda", "lei", "jim");
        list.forEach(System.out::println);

        list.sort((a, b) -> a.compareTo(b));//匿名函数
        System.out.println("=====");
        list.forEach(System.out::println);
        System.out.println("=====");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        list.forEach(System.out::println);


        int num = 1;


    }

}
