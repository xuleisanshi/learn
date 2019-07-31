package com.lei.learn.leetcode.DynamicProgramming;

public class Item198 {
    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int[] memo = new int[nums.length];
        if (nums.length <= 1) {
            memo[0] = nums[0];
        } else if (nums.length <= 2) {
            memo[0] = nums[0];
            memo[1] = Math.max(nums[0], nums[1]);
        } else {
            memo[0] = nums[0];
            memo[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                memo[i] = Math.max(memo[i - 2] + nums[i], memo[i - 1]);
            }
        }
        return memo[nums.length - 1];
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }
}
