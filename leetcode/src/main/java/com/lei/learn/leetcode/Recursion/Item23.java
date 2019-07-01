package com.lei.learn.leetcode.Recursion;

import java.util.PriorityQueue;

public class Item23 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode tmp = lists[i];
            while (tmp != null) {
                priorityQueue.add(tmp.val);
                tmp = tmp.next;
            }
        }
        ListNode preNode = new ListNode(0);
        ListNode current = preNode;

        while (!priorityQueue.isEmpty()) {
            current.next = new ListNode(priorityQueue.remove());
            current = current.next;
        }
        return preNode.next;
    }

    public static void main(String[] args) {


        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(1);

        node1.next = new ListNode(6);

        ListNode[] lists = new ListNode[]{node1, node2, node3};
        System.out.println(mergeKLists(lists).toString());
    }
}
