package com.lei.learn.leetcode.Array;

public class Item26 {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each
     * element appear only once and return the new length.
     * <p>
     * Do not allocate extra space for another array, you must do this by modifying
     * the input array in-place with O(1) extra memory.
     */
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index + 1;

    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 2};
        System.out.println(removeDuplicates(array));

    }
}
