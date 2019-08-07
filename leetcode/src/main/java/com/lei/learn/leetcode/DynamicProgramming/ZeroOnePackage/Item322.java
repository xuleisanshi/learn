package com.lei.learn.leetcode.DynamicProgramming.ZeroOnePackage;

import java.util.Arrays;

public class Item322 {
    public static int coinChange(int[] coins, int amount) {

        if (coins.length == 0 && amount == 0) return -1;
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (memo[i - coin] != Integer.MAX_VALUE) {
                    memo[i] = Math.min(memo[i], memo[i - coin] + 1);
                }
            }

        }
        return memo[amount] == Integer.MAX_VALUE ? -1 : memo[amount];
    }


    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        System.out.println(coinChange(coins, 11));
    }
}
