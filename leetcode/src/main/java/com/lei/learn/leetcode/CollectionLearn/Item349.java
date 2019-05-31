package com.lei.learn.leetcode.CollectionLearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Item349 {
    //O(n)
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++)
            set.add(nums1[i]);

        for (int i : nums2) {
            if (set.contains(i)) {
                set1.add(i);
            }
        }
        int[] result = new int[set1.size()];
        int j = 0;
        for (int i : set1) {
            result[j++] = i;
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2, 1, 3};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
}
