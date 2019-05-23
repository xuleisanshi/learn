package com.lei.learn.leetcode.Array;

//two pointers

/**
 * O(n^3),O(n),O(nlogn)
 */
public class Item209 {

  public static int minSubArrayLen(int s, int[] nums) {
    int low, high;
    for (int i = 0; i < nums.length - 1; i++) {
      low = 0;
      high = low + i;
      int result = 0;
      while (result < s) {

      }
    }
    return result;
  }

  public static void main() {

  }
}
