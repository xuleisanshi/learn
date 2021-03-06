package com.lei.learn.leetcode.Array;

import java.util.Arrays;

public class Item88 {
  /**
   * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
   * one sorted array.
   * 
   * Note:
   * 
   * The number of elements initialized in nums1 and nums2 are m and n
   * respectively. You may assume that nums1 has enough space (size that is
   * greater or equal to m + n) to hold additional elements from nums2. Example:
   * 
   * Input: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6], n = 3
   * 
   * Output: [1,2,2,3,5,6]
   */

  public static void merge(int[] nums1, int m, int[] nums2, int n) {

    int indexM = m - 1, indexN = n - 1, index = m + n - 1;
    while (indexM > -1 && indexN > -1)
      nums1[index--] = (nums1[indexM] > nums2[indexN]) ? nums1[indexM--] : nums2[indexN--];
    while (indexN > -1)
      nums1[index--] = nums2[indexN--];

  }

  public static void main(String[] args) {

    int[] nums1 = new int[] { 0, 0, 3, 0, 0, 0, 0, 0, 0 };
    int[] nums2 = new int[] { -1, 1, 1, 1, 2, 3 };
    int m = 3, n = 6;
    merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));

  }

}
