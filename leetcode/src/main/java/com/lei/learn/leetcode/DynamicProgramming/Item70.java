package com.lei.learn.leetcode.DynamicProgramming;

public class Item70 {


    public static int climbStairs(int n) {
        assert n > 0;
        if (n <= 2) return n;

        int[] mem = new int[n];
        mem[0] = 1;
        mem[1] = 2;
        for (int i = 2; i < n; i++) {
            mem[i] = mem[i - 2] + mem[i - 1];
        }
        return mem[n-1];

    }


    public static void main(String[] args) {


        int n = 3;

        System.out.println(climbStairs(n));
    }
}
