package com.lei.learn.leetcode.CollectionLearn;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Item350 {

  // O(m+n)
  public static int[] intersect(int[] nums1, int[] nums2) {

    Map<Integer, Integer> map1 = new HashMap<>();
    for (int i = 0; i < nums1.length; i++) {
      map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
    }

    Map<Integer, Integer> map2 = new HashMap<>();

    for (int i = 0; i < nums2.length; i++) {
      if (map1.containsKey(nums2[i]) && map1.get(nums2[i]) >= 1) {
        map2.put(i, nums2[i]);
        map1.put(nums2[i], map1.get(nums2[i]) - 1);
      }
    }

    int[] result = new int[map2.size()];
    int j = 0;

    for (Integer i : map2.values()) {
      result[j++] = i;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 2, 1, 2};
    int[] nums2 = new int[]{2, 2, 1, 3};
    System.out.println(Arrays.toString(intersect(nums1, nums2)));
  }
}
