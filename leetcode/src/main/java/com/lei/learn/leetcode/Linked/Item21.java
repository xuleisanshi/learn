package com.lei.learn.leetcode.Linked;

public class Item21 {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode fakeHead = new ListNode(-1);
        ListNode current = fakeHead;
        while (l1 != null && l2 != null) {
            if ((int) l1.val <= (int) l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l2 != null) {
            current.next = l2;
        }
        if (l1 != null) {
            current.next = l1;
        }

        return fakeHead.next;

    }


    public static void main(String[] args) {

        ListNode<Integer> l1 = new ListNode(3);
        l1.append(new ListNode(6));
        l1.append(new ListNode(10));
        l1.append(new ListNode(16));

        ListNode<Integer> l2 = new ListNode(4);
        l2.append(new ListNode(5));
        l2.append(new ListNode(13));
        l2.append(new ListNode(16));

        mergeTwoLists(l1,l2).printNode();

    }


}
