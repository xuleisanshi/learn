package com.lei.learn.leetcode.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(compare());
        priorityQueue.add(10);
        priorityQueue.add(9);
        priorityQueue.add(8);
        priorityQueue.add(7);
        priorityQueue.add(6);
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(11);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }


    private static Comparator<Integer> compare() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1 - o2);
            }

        };
    }
}
