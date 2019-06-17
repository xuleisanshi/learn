package com.lei.learn.leetcode.Window;

import java.util.HashSet;
import java.util.Set;

public class Item217 {
    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        if (nums.length <= 1) {
            return result;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() != i+1) {
                return true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1};
        System.out.println(containsDuplicate(nums));

    }
}
