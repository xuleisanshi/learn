package com.lei.learn.leetcode.Linked;

public class Item328 {
    public static ListNode oddEvenList(ListNode head) {

        int index = 1;
        if (head == null) {
            return head;
        }
        ListNode even = head.next;
        ListNode odd = head;
        ListNode evenHead = even;


        while (odd != null && even != null && even.next != null) {
            if (index % 2 != 0) {
                odd.next = even.next;
                odd = even.next;
            } else {
                even.next = odd.next;
                even = odd.next;
            }
            index++;
        }

        odd.next = evenHead;


        return head;
    }

    public static void main(String[] args) {
//        ListNode head = null;

        ListNode<Integer> head = new ListNode<>(1);
//        head.append(new ListNode(2));
//        head.append(new ListNode(3));
//        head.append(new ListNode(4));
//        head.append(new ListNode(5));
//        head.append(new ListNode(6));
//        head.append(new ListNode(7));
//        head.printNode();
        oddEvenList(head);
        head.printNode();

    }
}
