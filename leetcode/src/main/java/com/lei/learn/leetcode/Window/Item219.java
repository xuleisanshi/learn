package com.lei.learn.leetcode.Window;

import java.util.HashMap;
import java.util.Map;

public class Item219 {
  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    boolean result = false;
    if (nums.length <= 1) {
      return result;
    }
    for (int i = 0; i < nums.length; i++) {
      int index = i + 1;
      while (index <= i + k && index < nums.length) {
        if (nums[i] == nums[index]) {
          result = true;
          return result;
        }
        index++;
      }
    }
    return result;
  }

  public static boolean containsNearbyDuplicateHashMap(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        map.put(nums[i], i);
      } else {
        if ((i - map.get(nums[i])) <= k) {
          return true;
        } else {
          map.put(nums[i], i);
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    //{1,2,3,1},3
    int[] nums = new int[]{1, 2, 3, 1, 2, 3};
    int k = 2;
    System.out.println(containsNearbyDuplicate(nums, k));
  }
}
