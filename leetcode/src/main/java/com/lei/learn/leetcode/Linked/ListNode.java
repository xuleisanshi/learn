package com.lei.learn.leetcode.Linked;

public class ListNode<E> {

    private E data;
    private ListNode next;

    public ListNode(E data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(E data) {
        this.data = data;
    }

    public ListNode(ListNode next) {
        this.next = next;
    }

    public ListNode() {
    }


    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode append(ListNode node) {
        ListNode currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return currentNode.next;
    }

    public ListNode after(ListNode newNode) {
        ListNode currentNext = this.getNext();
        newNode.setNext(currentNext);
        this.setNext(newNode);
        return this.getNext();
    }

    public int getLength() {
        int length = 0;
        ListNode currentNode = this;
        while (currentNode.getNext() != null) {
            length = length + 1;
            currentNode = currentNode.getNext();
        }
        length = length + 1;
        return length;
    }

    public ListNode removeNext() {
        ListNode currentNext = this.getNext();
        if (currentNext != null) {
            this.setNext(currentNext.getNext());
            return currentNext;
        } else {
            throw new RuntimeException("this is last node.");
        }

    }


    public boolean isLast() {
        return next == null;
    }


    public void printNode() {
        ListNode currentNode = this;
        while (currentNode.getNext() != null) {
            System.out.print(currentNode.getData());
            System.out.print("-->");
            currentNode = currentNode.getNext();
        }
        System.out.println(currentNode.getData());
    }
}
