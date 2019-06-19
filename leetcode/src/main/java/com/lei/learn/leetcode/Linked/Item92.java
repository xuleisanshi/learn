package com.lei.learn.leetcode.Linked;

public class Item92 {
    public static ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null) return null;
        ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
        dummy.next = head;
        ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
        for (int i = 0; i < m - 1; i++) pre = pre.next;

        ListNode current = pre.next; // a pointer to the beginning of a sub-list that will be reversed
        ListNode next = current.next; // a pointer to a node that will be reversed


        for (int i = 0; i < n - m; i++) {
            current.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<>(1);
        head.append(new ListNode(2));
        head.append(new ListNode(3));
        head.append(new ListNode(4));
        head.append(new ListNode(5));
        head.append(new ListNode(6));
        head.append(new ListNode(7));

        int m = 2, n = 4;
        head.printNode();
        reverseBetween(head, m, n).printNode();

    }
}

