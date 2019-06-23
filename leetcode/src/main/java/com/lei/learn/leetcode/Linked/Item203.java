package com.lei.learn.leetcode.Linked;

public class Item203 {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode preV = preNode;

        while (current != null) {
            if ((int) current.val == val) {
                preV.next = current.next;
            } else {
                preV = preV.next;
            }
            current = current.next;
        }

        return preNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.append(new ListNode(1));
        head.append(new ListNode(2));
        head.append(new ListNode(3));
        head.append(new ListNode(4));
        head.append(new ListNode(3));
        head.append(new ListNode(4));
        head.append(new ListNode(6));
        head.append(new ListNode(3));
        int val = 3;

        removeElements(head, val).printNode();

    }
}
