package com.lei.learn.leetcode.KSum;

import java.util.*;

public class Item15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length <= 2) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i == 0 || nums[i] != nums[i - 1]) {
                while (left < right) {
                    if ((nums[right] + nums[left] + nums[i]) == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        right--;
                    } else if ((nums[right] + nums[left] + nums[i]) > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0, 0, 0};
        System.out.println(threeSum(nums));
    }
}
