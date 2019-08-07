package com.lei.learn.leetcode.DynamicProgramming.ZeroOnePackage;

public class Item377 {

    //a time limitation version solution
    public static int combinationSum4(int[] nums, int target) {
        if (target == 0) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res = res + combinationSum4(nums, target - nums[i]);
            }
        }
        return res;
    }

    public static int combinationSum(int[] nums, int target) {
        int[] memo = new int[target + 1];
        memo[0] = 1;

        for (int i = 1; i < memo.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] >= 0) {
                    memo[i] = memo[i] + memo[i - nums[j]];
                }
            }
        }
        return memo[target];

    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 3};
        System.out.println(combinationSum(nums, 35));
    }
}
