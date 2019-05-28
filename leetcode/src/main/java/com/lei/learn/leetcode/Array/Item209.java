package com.lei.learn.leetcode.Array;

//two pointers

/**
 * O(n^3),O(n),O(nlogn)
 */
public class Item209 {

    public static int minSubArrayLen(int s, int[] nums) {
        int low, high;
        int gap = 0;

        while (gap < nums.length) {
        }

        return 0;
    }


    private static int solveNLogN(int s, int[] nums) {
        int[] sums = new int[nums.length + 1];
        for (int i = 1; i < sums.length; i++) sums[i] = sums[i - 1] + nums[i - 1];
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < sums.length; i++) {
            int end = binarySearch(i + 1, sums.length - 1, sums[i] + s, sums);
            if (end == sums.length) break;
            if (end - i < minLen) minLen = end - i;
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
