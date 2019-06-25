package com.lei.learn.leetcode.Linked;

public class Item147 {
    public static ListNode insertionSortList(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = head;
        ListNode current = pre.next;

        while (current != null) {
            ListNode dummy = fakeHead;
            if ((int) current.val < (int) pre.val) {
                while ((int) dummy.next.val < (int) current.val && dummy.next != pre) {
                    dummy = dummy.next;
                }
                pre.next = current.next;
                current.next = dummy.next;
                dummy.next = current;
            }
            pre=current;
            current=current.next;
        }

        return fakeHead.next;

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.append(new ListNode(5));
        head.append(new ListNode(4));
        head.append(new ListNode(2));
        insertionSortList(head).printNode();


    }
}
