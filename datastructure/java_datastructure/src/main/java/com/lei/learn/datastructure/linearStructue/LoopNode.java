package com.lei.learn.datastructure.linearStructue;

public class LoopNode {
    private String data;
    private Node next;

    public LoopNode(String data) {
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



}
