package com.lei.learn.leetcode.Array;

import java.util.Arrays;

public class Item215 {

  /**
   * Find the kth largest element in an unsorted array. Note that it is the kth largest element
   * in the sorted order, not the kth distinct element.
   * <p>
   * Example 1:
   * <p>
   * Input: [3,2,1,5,6,4] and k = 2
   * Output: 5
   * Example 2:
   * <p>
   * Input: [3,2,3,1,2,4,5,5,6] and k = 4
   * Output: 4
   * Note:
   * You may assume k is always valid, 1 ≤ k ≤ array's length.
   */

  public static int findKthLargest1(int[] nums, int k) {
    for (int i = 0; i < nums.length && i < k; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] < nums[j]) {
          int tmp = nums[i];
          nums[i] = nums[j];
          nums[j] = tmp;
        }
      }
    }
    return nums[k - 1];
  }

  public static int findKthLargest(int[] nums, int k) {

    quickSort(nums, 0, nums.length - 1);

    return nums[nums.length - k];
  }

  private static int[] quickSort(int[] array, int start, int end) {
    int base = array[start];
    int low = start;
    int high = end;
    if (start < end) {
      while (low < high) {
        while (base <= array[high] && high > low) {
          high--;
        }
        array[low] = array[high];
        while (base >= array[low] && low < high) {
          low++;
        }
        array[high] = array[low];
      }

      array[low] = base;
      quickSort(array, start, low);
      quickSort(array, low + 1, high);
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array = new int[]{3, 2, 1, 5, 6, 4};
    int k = 2;
    System.out.println(findKthLargest1(array, k));
    System.out.println(findKthLargest(array, k));
  }
}
