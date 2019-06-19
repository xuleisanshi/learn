package com.lei.learn.leetcode.Linked;

public class Item86 {

    public static ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode smaller = new ListNode(0);
        ListNode bigger = new ListNode(0);
        ListNode nodeSmaller = smaller, nodeBigger = bigger;

        while (head != null) {
            if ((int) head.val >= x) {
                nodeBigger.next = head;
                nodeBigger = head;
            } else {
                nodeSmaller.next = head;
                nodeSmaller = head;
            }
            head = head.next;
        }

        nodeBigger.next = null;
        nodeSmaller.next = bigger.next;

        return smaller.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.append(new ListNode(4));
        head.append(new ListNode(5));
        head.append(new ListNode(1));
        head.append(new ListNode(2));
        head.append(new ListNode(3));
        head.append(new ListNode(1));
        partition(head, 2).printNode();


    }
}
