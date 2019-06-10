package com.lei.learn.leetcode.CollectionLearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Item1 {
  public static int[] twoSum(int[] nums, int target) {

    if (nums.length <= 1) {
      return null;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
        result[0] = i;
        result[1] = map.get(target - nums[i]);
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = new int[]{3, 2, 4};
    int target = 6;
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }
}
