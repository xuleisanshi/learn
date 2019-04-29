package com.lei.learn.datastructure.linearStructue;

public class DoubleNode {
    private String data;
    private DoubleNode preNode;
    private DoubleNode nextNode;

    public DoubleNode(String data) {
        this.data = data;
        this.preNode = this;
        this.nextNode = this;
    }

    public DoubleNode getPreNode() {
        return preNode;
    }

    public String getData() {
        return data;
    }

    public DoubleNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setPreNode(DoubleNode preNode) {
        this.preNode = preNode;
    }

    public void after(DoubleNode doubleNode) {
        DoubleNode currentNextDoubleNode = this.getNextNode();
        this.setNextNode(doubleNode);
        doubleNode.setPreNode(this);
        doubleNode.setNextNode(currentNextDoubleNode);
        currentNextDoubleNode.setPreNode(doubleNode);
    }

    public void show(){
        DoubleNode doubleNode = this;
        int i = 0;
        while (i<10){
            i++;
            System.out.println(doubleNode.getData());
            doubleNode=doubleNode.getNextNode();
        }
    }
}
