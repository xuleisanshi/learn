package com.lei.learn.leetcode.Linked;

public class Item82 {
    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;

        ListNode pre = fakeHead;
        ListNode current = head;

        while (current != null) {

            while (current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            if (pre.next == current) {
                pre = pre.next;
            } else {
                pre.next = current.next;
            }
            current = current.next;
        }

        return fakeHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.append(new ListNode(1));
        head.append(new ListNode(1));
        head.append(new ListNode(1));
        head.append(new ListNode(2));
        head.append(new ListNode(2));
        head.append(new ListNode(3));
        deleteDuplicates(head).printNode();
    }
}
