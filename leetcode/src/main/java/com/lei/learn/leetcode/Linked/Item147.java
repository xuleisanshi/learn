package com.lei.learn.leetcode.Linked;

public class Item147 {
    public static ListNode insertionSortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode cur1 = head;

        while (cur1 != null) {
            ListNode cur2 = head;
            ListNode pre = fakeHead;
            while (cur1 != cur2) {
                if ((int) cur1.val < (int) cur2.val) {
                    cur2.next = cur1.next;
                    pre.next = cur1;
                    cur1.next = cur2;

                } else {
                    pre = cur2;
                    cur2 = cur2.next;
                }
                cur1 = cur1.next;
            }
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
