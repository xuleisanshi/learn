package com.lei.learn.leetcode.Recursion.BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Item46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        backTrack(res, nums, new ArrayList<Integer>());
        return res;

    }

    public void backTrack(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp) {
        if (nums.length == 0) {
            res.add(new ArrayList<>(tmp));
        }
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            tmp.add(value);
            backTrack(res, remove(nums, i), tmp);
            tmp.remove(tmp.size() - 1);
        }
    }


    public int[] remove(int[] nums, int index) {

        int[] result = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (i < index) {
                result[i] = nums[i];
            } else if (i > index) {
                result[i - 1] = nums[i];
            }
        }
        return result;
    }

}
