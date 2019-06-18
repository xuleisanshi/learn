package com.lei.learn.leetcode.Linked;

import java.util.List;

public class Item206 {

    public static ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode current = head;
        ListNode next = current.getNext();


        while (next != null) {
            current.setNext(pre);
            pre = current;
            current = next;
            if (next.getNext() == null) {
                current.setNext(pre);
                return current;
            } else {
                next = next.getNext();
            }
        }
        return head;
    }


    public static void main(String[] args) {

//        ListNode<Integer> head = new ListNode<>(0);
//        head.append(new ListNode(1));
//        head.append(new ListNode(2));
//        head.append(new ListNode(3));
//        head.append(new ListNode(4));
//        head.append(new ListNode(5));
//        head.append(new ListNode(6));

        ListNode<Integer> head = new ListNode<>(0);
        head.printNode();
        head = reverseList(head);
        head.printNode();


    }
}


