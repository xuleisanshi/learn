package com.lei.learn.leetcode.Window;

public class Item220 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        boolean result = false;
        if (nums.length <= 1) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = i + 1;
            while (index <= i + k && index < nums.length) {
                long v1 = (int) nums[i];
                long v2 = (int) nums[index];
                long gap = v1 - v2;
                gap = gap < 0 ? -gap : gap;
                if (gap <= t) {
                    result = true;
                    return result;
                }
                index++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2147483647, -2147483647};
        int k = 1, t = 2147483647;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));
    }

}


