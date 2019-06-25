package com.lei.learn.leetcode.Linked;

public class Item19 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            pre = pre.next;
            slow = slow.next;
            fast = fast.next;
        }

        pre.next = slow.next;
        return fakeHead.next;
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

        removeNthFromEnd(head, 7).printNode();

    }
}
