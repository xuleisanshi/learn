package com.lei.learn.leetcode.DynamicProgramming;

public class Item279 {

    public static int numSquares(int n) {

        assert n > 0;
        int[] memo = new int[n];
        memo[0] = 1;
        for (int i = 2; i <= n; i++) {
            int result = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) result = 0;
                else {
                    result = Math.min(result, memo[i - j * j-1]);
                }
            }
            memo[i - 1] = result + 1;
        }


        return memo[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }

}
