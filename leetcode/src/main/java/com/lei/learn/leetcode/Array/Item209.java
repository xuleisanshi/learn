package com.lei.learn.leetcode.Array;

//two pointers

/**
 * O(n^3),O(n),O(nlogn)
 */
public class Item209 {

  //  O(n^3)
  public static int minSubArrayLen(int s, int[] nums) {
    int gap = 0;
    for (; gap < nums.length; gap++) {
      for (int i = 0; i < nums.length - gap; i++) {
        int sum = 0;
        for (int j = i; j <= i + gap; j++) {
          sum = sum + nums[j];
        }
        if (sum >= s) {
          return (gap + 1) > Integer.MIN_VALUE ? gap + 1 : Integer.MIN_VALUE;
        }
      }
    }
    return 0;
  }

  //O(N)
  public static int minSubArrayLenOn(int s, int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int result = Integer.MAX_VALUE, left = 0;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      while (sum >= s && left < nums.length) {
        result = result > (i - left) ? i + 1 - left : result;
        sum = sum - nums[left];
        left++;
      }
    }
    return result == Integer.MAX_VALUE ? 0 : result;
  }

  public static void main(String[] args) {

    int s = 0;
    int[] nums = new int[]{1, 2, 3};
    System.out.println(minSubArrayLenOn(s, nums));
  }
}
