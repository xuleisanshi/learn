package com.lei.learn.leetcode.Linked;

import java.util.List;

public class Item143 {
  public static void reorderList(ListNode head) {

    if (head == null || head.next == null) {
      return;
    }
    ListNode secondList = new ListNode(0);
    ListNode fast = head;
    ListNode slow = head;
    secondList.next = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      secondList = secondList.next;
      slow = slow.next;
    }

    slow.next = null;
    secondList = secondList.next;
    secondList = reverseList(secondList);
    head = mergeList(head, secondList);
    head.printNode();
  }

  public static ListNode reverseList(ListNode listNode) {
    if (listNode == null) {
      return null;
    }
    ListNode pre = null;
    ListNode current = listNode;
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
    return listNode;
  }

  public static ListNode mergeList(ListNode listNode1, ListNode listNode2) {

    ListNode cur1 = listNode1;
    ListNode cur1Node = cur1.next;
    ListNode cur2 = listNode2;
    ListNode cur2Node = cur2.next;

    while (cur1.next != null && cur2.next != null) {
      cur1.next = cur2;
      cur1 = cur1Node;
      cur1Node = cur1Node.next;
      cur2.next = cur1Node;
      cur2 = cur2Node;
      cur2Node = cur2Node.next;
    }
    return listNode1;
  }

  public static void main(String[] args) {

    ListNode<Integer> l1 = new ListNode<>(1);
    l1.append(new ListNode(2));
    l1.append(new ListNode(3));
    l1.append(new ListNode(4));
    l1.append(new ListNode(5));
    l1.append(new ListNode(6));
    l1.append(new ListNode(7));
    reorderList(l1);

  }
}
