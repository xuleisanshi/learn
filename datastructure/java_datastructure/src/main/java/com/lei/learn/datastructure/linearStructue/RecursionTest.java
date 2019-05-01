package com.lei.learn.datastructure.linearStructue;

public class RecursionTest {
    public static void main(String[] args) {
//        System.out.println(factorial(4));
//
//
//        System.out.println(fibonacci(1));
//        System.out.println(fibonacci(2));
//        System.out.println(fibonacci(3));
//        System.out.println(fibonacci(4));
//        System.out.println(fibonacci(5));
//        System.out.println(fibonacci(6));

        hanoiTower(3, "a", "b", "c");

    }

    //todo get a result of A!
    public static int factorial(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
    //TODO Fibonacci //2^n

    public static int fibonacci(int index) {
        if (index <= 2) {
            return 1;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }

    //TODO Hanoi TOWER/
    /*

     */
    public static void hanoiTower(int n, String from, String in, String to) {
        if (n == 1) {
            System.out.println("1" + from + to);
        } else {
            hanoiTower(n - 1, from, to, in);
            System.out.println(n + from + to);
            hanoiTower(n - 1, in, from, to);
        }
    }
}
