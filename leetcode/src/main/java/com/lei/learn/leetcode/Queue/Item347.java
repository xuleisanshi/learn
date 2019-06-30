package com.lei.learn.leetcode.Queue;

import java.util.*;

public class Item347 {
    public static List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> res = new ArrayList<>();
        assert k > 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<Map.Entry<Integer, Integer>>((o1, o2) -> o2.getValue() - o1.getValue());

        priorityQueue.addAll(map.entrySet());
        for (int i = 0; i < k; i++) {
            res.add(priorityQueue.remove().getKey());
        }
        return res;

    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(topKFrequent(nums, k).toString());
    }


}
