package com.lei.learn.leetcode.Array;

import java.util.Arrays;

public class Item286 {

  /**
   * Given an array nums, write a function to move all 0's to the end of it while
   * maintaining the relative order of the non-zero elements.
   * 
   * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
   * should be [1, 3, 12, 0, 0].
   * 
   * Note: You must do this in-place without making a copy of the array. Minimize
   * the total number of operations.
   */

  public static int[] moveZero(int[] nums) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int tmp = nums[index];
        nums[index] = nums[i];
        nums[i] = tmp;
        index++;
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] array = new int[] { 2, 1 };
    System.out.println(Arrays.toString(moveZero(array)));

  }
}
