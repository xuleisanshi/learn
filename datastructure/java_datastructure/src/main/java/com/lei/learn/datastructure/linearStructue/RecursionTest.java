package com.lei.learn.datastructure.linearStructue;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(factorial(4));

    }

    //todo get a result of A!
    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
    
}
