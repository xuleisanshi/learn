package com.lei.learn.leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Item167 {

  //o(n^2)
  public static int[] twoSum(int[] numbers, int target) {

    List<int[]> lists = new ArrayList<>();
    int[] result = new int[2];

    int index1;
    int index2;
    for (index1 = 0; index1 < numbers.length; index1++) {
      for (index2 = index1 + 1; index2 < numbers.length; index2++) {
        if ((numbers[index1] + numbers[index2]) == target) {
          result[0] = index1 + 1;
          result[1] = index2 + 1;
          index2++;
          lists.add(result);
        }
      }
    }
    return lists.get(0);
  }

  //o(n)
  public static int[] method1(int[] numbers, int target) {
    int[] result = new int[2];
    int low = 0;
    int high = numbers.length - 1;
    int tmp = numbers[low] + numbers[high];
    while (tmp != target) {
      if (tmp > target) {
        high--;
      } else {
        low++;
      }
      tmp = numbers[low] + numbers[high];
    }
    result[0] = low + 1;
    result[1] = high + 1;

    return result;
  }

  //O(nlogn)
  public static int[] binaryMethod(int[] numbers, int target) {

    int[] result = new int[2];
    int index1 = 0;
    for (; index1 < numbers.length; index1++) {
      int tmp = target - numbers[index1];
      int low = index1 + 1, high = numbers.length - 1;
      int index2 = (low + high) / 2;
      while (low <= high) {
        if (tmp == numbers[index2]) {
          result[0] = index1 + 1;
          result[1] = index2 + 1;
          break;
        } else if (tmp > numbers[index2]) {
          low = index2 + 1;
          index2 = (low + high) / 2;
        } else {
          high = index2 - 1;
          index2 = (low + high) / 2;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target = 11;

    System.out.println(Arrays.toString(twoSum(numbers, target)));
    System.out.println(Arrays.toString(binaryMethod(numbers, target)));
    System.out.println(Arrays.toString(method1(numbers, target)));
  }
}
