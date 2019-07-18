package com.lei.learn.leetcode.DynamicProgramming;

public class Item343 {
    public static int integerBreak(int n) {
        int[] memo = new int[n];
        assert n > 0;
        memo[0] = 1;
        for (int i = 2; i <= n; i++) {
            int result = -1;
            for (int j = 1; j < i; j++) {
                result = getMax(j * (i - j), j * memo[i - j - 1], result);
            }
            memo[i - 1] = result;
        }
        return memo[n - 1];
    }

    private static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }


    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }


}
