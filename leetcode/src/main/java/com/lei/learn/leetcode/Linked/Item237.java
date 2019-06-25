package com.lei.learn.leetcode.Linked;

public class Item237 {

    public static void deleteNode(ListNode node) {

        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        } else node = node.next;


    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        deleteNode(node7);
        head.printNode();


    }
}
