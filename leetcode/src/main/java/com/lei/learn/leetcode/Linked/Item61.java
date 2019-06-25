package com.lei.learn.leetcode.Linked;

public class Item61 {

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }


        ListNode current = head;
        int len = 1;

        while (current.next != null) {
            current = current.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }
        ListNode result = head;

        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        result = slow.next;
        slow.next = null;

        return result;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head1 = new ListNode(0);
        head1.append(new ListNode(1));
        head1.append(new ListNode(2));


        rotateRight(head1, 4).printNode();


    }


}
