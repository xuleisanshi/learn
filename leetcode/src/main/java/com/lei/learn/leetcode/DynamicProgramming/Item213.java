package com.lei.learn.leetcode.DynamicProgramming;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Item213 {


    public static int rob(int[] nums) {
        int result = 0;

        if (nums.length == 0) return result;
        if (nums.length==1) return nums[0];
        int[] n1 = new int[nums.length - 1];
        int[] n2 = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            n1[i] = nums[i];
            n2[i] = nums[i + 1];
        }

        return Math.max(getMax(n1), getMax(n2));
    }


    public static int getMax(int[] nums) {
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
        int[] nums = new int[]{1,2};
        System.out.println(rob(nums));
    }
}
