package com.lei.learn.leetcode.Linked;

public class TestLinked {


    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<>(1);
        head.append(new ListNode(2));
        head.append(new ListNode(3));
        head.append(new ListNode(4));
        head.append(new ListNode(5));
        head.append(new ListNode(6));
        head.append(new ListNode(7));

        head.printNode();
        ListNode<Integer> v1 = new ListNode<>(0);
        ListNode<Integer> v2 = v1;

        System.out.println(head);
//        v1.setNext(head);
        v1.printNode();
        v2.printNode();
        v1.setNext(v2);
        v1.printNode();
    }
}
