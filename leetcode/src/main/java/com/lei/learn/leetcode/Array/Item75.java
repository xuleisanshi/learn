package com.lei.learn.leetcode.Array;

import java.util.Arrays;

public class Item75 {
  /**
   * Given an array with n objects colored red, white or blue, sort them in-place
   * so that objects of the same color are adjacent, with the colors in the order
   * red, white and blue.
   *
   * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
   * and blue respectively.
   *
   * Note: You are not suppose to use the library's sort function for this
   * problem.
   *
   * Example:
   *
   * Input: [2,0,2,1,1,0] Output: [0,0,1,1,2,2] Follow up:
   *
   * A rather straight forward solution is a two-pass algorithm using counting
   * sort. First, iterate the array counting number of 0's, 1's, and 2's, then
   * overwrite array with total number of 0's, then 1's and followed by 2's. Could
   * you come up with a one-pass algorithm using only constant space?
   */

  public static int[] sortColors(int[] nums) {

    int redIndex = -1, blueIndex = nums.length;
    for (int i = 0; i < blueIndex; i++) {
      if (nums[i] == 0) {
        int tmp = nums[redIndex + 1];
        nums[redIndex + 1] = nums[i];
        nums[i] = tmp;
        redIndex++;
      }
      if (nums[i] == 2) {
        int tmp = nums[blueIndex - 1];
        nums[blueIndex - 1] = nums[i];
        nums[i] = tmp;
        blueIndex--;
        i--;
      }

    }
    return nums;
  }

  public static int[] sortColors1(int[] nums) {

    int redCount = 0, whiteCount = 0, index = 0;
    while (index < nums.length) {
      if (nums[index] == 0)
        redCount++;
      else if (nums[index] == 1)
        whiteCount++;
      index++;
    }
    for (int i = 0; i < nums.length; i++) {
      if (i < redCount)
        nums[i] = 0;
      else if (i < redCount + whiteCount)
        nums[i] = 1;
      else
        nums[i] = 2;
    }
    return nums;

  }

  public static void main(String[] args) {

    int[] array = new int[] { 2, 0, 2, 1, 1, 0 };
    System.out.println(Arrays.toString(sortColors(array)));

  }
}
