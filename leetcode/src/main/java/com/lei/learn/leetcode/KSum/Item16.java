package com.lei.learn.leetcode.KSum;

import java.util.Arrays;

public class Item16 {
    public static int threeSumClosest(int[] nums, int target) {

        int min = Integer.MAX_VALUE;
        int result = 0;
        if (nums.length <= 2) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i == 0 || nums[i] != nums[i - 1]) {
                while (left < right) {
                    int sum = nums[right] + nums[left] + nums[i];
                    if (sum == target) {
                        return sum;
                    } else if (sum > target) {
                        int tmp = Math.min(min, Math.abs(target - sum));
                        if (tmp != min) {
                            result = sum;
                            min = tmp;
                        }
                        right--;
                    } else {
                        int tmp = Math.min(min, Math.abs(target - sum));
                        if (tmp != min) {
                            result = sum;
                            min = tmp;
                        }
                        left++;
                    }
                }
            }
            if (min == 0) {
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));

    }
}
