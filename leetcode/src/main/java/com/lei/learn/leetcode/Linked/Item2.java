package com.lei.learn.leetcode.Linked;


public class Item2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        ListNode result = new ListNode(0);
        ListNode current = result;

        int sum = 0;

        while (cur1 != null || cur2 != null) {
            int v1 = cur1 == null ? 0 : (int) cur1.val;
            int v2 = cur2 == null ? 0 : (int) cur2.val;
            sum = v1 + v2 + sum;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (cur1 != null) cur1 = cur1.next;
            if (cur2 != null) cur2 = cur2.next;
            sum = sum / 10;
        }

        if (sum == 1) {
            current.next = new ListNode(1);

        }

        return result.next;
    }


    public static void main(String[] args) {

        ListNode<Integer> l1 = new ListNode<>(1);
        ListNode<Integer> l2 = new ListNode<>(0);
        l1.append(new ListNode(8));

        l1.printNode();
        l2.printNode();
        addTwoNumbers(l1, l2).printNode();

    }
}
