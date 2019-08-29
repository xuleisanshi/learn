package com.lei.learn.leetcode.java;

import java.util.Arrays;

public class lambda {


    public static void main(String[] args) {
        Arrays.asList("1", "2", "3", "4").forEach(a -> {
            print(a);
        });
    }

    public static void print(String a) {
        System.out.println(a);
    }
}
