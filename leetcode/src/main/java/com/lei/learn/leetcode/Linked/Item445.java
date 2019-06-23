package com.lei.learn.leetcode.Linked;

import java.util.Stack;

public class Item445 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();

        while (l1 != null) {
            s1.push((int) l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push((int) l2.val);
            l2 = l2.next;
        }

        int sum = 0;

        ListNode result = new ListNode(0);
        ListNode current = result;
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += (int) s1.pop();
            if (!s2.empty()) sum += (int) s2.pop();


            ListNode head = new ListNode(sum % 10);
            head.next = result.next;
            result.next = head;
            sum = sum / 10;
        }

        if (sum != 0) {
            ListNode head = new ListNode(1);
            head.next = result.next;
            result.next = head;
        }

        return (int) result.val == 0 ? result.next : result;

    }


    public static void main(String[] args) {
        ListNode<Integer> l1 = new ListNode<>(7);
        l1.append(new ListNode(2));
        l1.append(new ListNode(4));
        l1.append(new ListNode(3));

        ListNode<Integer> l2 = new ListNode<>(5);

        l2.append(new ListNode(6));
        l2.append(new ListNode(4));

        addTwoNumbers(l1, l2).printNode();

    }


}
