package com.lei.learn.leetcode.DynamicProgramming.ZeroOnePackage;

public class Item416 {

    public boolean canPartition(int[] nums) {
        boolean res = false;
        if (nums.length <= 1) return res;

        int sum = 0;
        for (int i : nums) {
            sum = sum + i;
        }
        if (sum % 2 == 1) return res;

        sum = sum / 2;
        boolean[] memo = new boolean[sum + 1];
        memo[0] = true;
        for (int num : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= num) {
                    memo[i] = memo[i] || memo[i - num];
                }
            }
        }

        return memo[sum];

    }

}
