package com.lei.learn.datastructure.linearStructue;

public class Node extends RuntimeException {

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    //TODO get next node
    public Node getNext() {
        return this.next;
    }

    //todo get the data of the node
    public String getData() {
        return this.data;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setData(String data) {

        this.data = data;
    }

    //todo append node
    public Node append(Node node) {
        Node currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return currentNode.next;
    }

    //todo insert a node next to a specific node
    public Node after(Node newNode) {
        Node currentNext = this.getNext();
        newNode.setNext(currentNext);
        this.setNext(newNode);
        return this.getNext();
    }

    //todo size
    public int getLength() {
        int length = 0;
        Node currentNode = this;
        while (currentNode.getNext() != null) {
            length = length + 1;
            currentNode = currentNode.getNext();
        }
        length = length + 1;
        return length;
    }

    //todo delete a next node
    public Node removeNext() {
        Node currentNext = this.getNext();
        if (currentNext != null) {
            this.setNext(currentNext.getNext());
            return currentNext;
        } else {
            throw new RuntimeException("this is last node.");
        }

    }


    //todo is last
    public boolean isLast() {
        return next == null;
    }

    //todo print the whole node

    public void printNode() {
        //print the node
        Node currentNode = this;
        while (currentNode.getNext() != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
        System.out.println(currentNode.getData());
    }
}
