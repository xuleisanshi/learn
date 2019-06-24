package com.lei.learn.leetcode.Linked;

import java.util.List;

public class Item24 {
    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        ListNode current = head;
        ListNode nextNode = current.next;

        while (current != null && nextNode != null) {
            pre.next = nextNode;
            current.next = nextNode.next;
            nextNode.next = current;

            pre = current;
            current = current.next;
            if (current!= null) {

                nextNode = current.next;
            } else {
                break;

            }
        }
        return fakeHead.next;

    }

    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<>(1);
        head.append(new ListNode(2));
        head.append(new ListNode(3));
        head.append(new ListNode(4));
        head.append(new ListNode(5));
//        head.append(new ListNode(6));

        swapPairs(head).printNode();

    }
}
