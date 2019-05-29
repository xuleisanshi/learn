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

  //O(nlogn)
  public static int minSubArrayLenOlogn(int s, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int[] sums = new int[nums.length];
    sums[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sums[i] = sums[i - 1] + nums[i];
    }
    if (sums[nums.length - 1] < s) {
      return 0;
    }

    //sum 是一个有序数组

    return 0;
  }

  private static int solveNLogN(int s, int[] nums) {
    int[] sums = new int[nums.length + 1];
    for (int i = 1; i < sums.length; i++) {
      sums[i] = sums[i - 1] + nums[i - 1];
    }
    int minLen = Integer.MAX_VALUE;
    for (int i = 0; i < sums.length; i++) {
      int end = binarySearch(i + 1, sums.length - 1, sums[i] + s, sums);
      if (end == sums.length) {
        break;
      }
      if (end - i < minLen) {
        minLen = end - i;
      }
    }
    return minLen == Integer.MAX_VALUE ? 0 : minLen;
  }

  private static int binarySearch(int lo, int hi, int key, int[] sums) {
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (sums[mid] >= key) {
        hi = mid - 1;
      } else {
        lo = mid + 1;
      }
    }
    return lo;
  }

  public static void main(String[] args) {

    int s = 7;
    int[] nums = new int[]{2, 3, 1, 2, 4, 3};
    System.out.println(solveNLogN(s, nums));
  }
}
