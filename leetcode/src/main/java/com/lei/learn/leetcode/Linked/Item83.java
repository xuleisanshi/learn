package com.lei.learn.leetcode.Linked;

public class Item83 {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(0);
        head.append(new ListNode(1));
        head.append(new ListNode(2));
        head.append(new ListNode(3));
        head.append(new ListNode(3));
        head.append(new ListNode(5));
        head.append(new ListNode(6));
        head.printNode();
        deleteDuplicates(head).printNode();
    }
}
