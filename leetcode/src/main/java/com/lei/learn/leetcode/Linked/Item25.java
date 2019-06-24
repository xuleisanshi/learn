package com.lei.learn.leetcode.Linked;

public class Item25 {
    public static ListNode reverseKGroup(ListNode head, int k) {

        ListNode begin;
        if (head == null || head.next == null || k == 1)
            return head;
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        begin = fakeHead;
        int i = 0;
        while (head != null) {
            i++;
            if (i % k == 0) {
                begin = reverse(begin, head.next);
                head = begin.next;
            } else {
                head = head.next;
            }
        }
        return fakeHead.next;
    }


    public static ListNode reverse(ListNode begin, ListNode end) {

        ListNode curr = begin.next;
        ListNode next, first;
        ListNode prev = begin;
        first = curr;
        while (curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        begin.next = prev;
        first.next = curr;
        return first;
    }


    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<>(1);
        head.append(new ListNode(2));
        head.append(new ListNode(3));
        head.append(new ListNode(4));
        head.append(new ListNode(5));
        head.append(new ListNode(6));

        reverseKGroup(head, 3).printNode();


    }
}
