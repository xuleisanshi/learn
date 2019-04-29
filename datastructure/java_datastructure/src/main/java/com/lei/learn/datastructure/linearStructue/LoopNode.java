package com.lei.learn.datastructure.linearStructue;

public class LoopNode {
    private String data;
    private LoopNode next;

    public LoopNode(String data) {
        this.data = data;
        this.next = this;

    }

    //TODO get next node
    public LoopNode getNext() {
        return this.next;
    }

    //todo get the data of the node
    public String getData() {
        return this.data;
    }

    public void setNext(LoopNode loopNode) {
        this.next = loopNode;
    }

    public void setData(String data) {

        this.data = data;
    }

    //after a new node to loop
    public void after(LoopNode loopNode) {
        LoopNode currentNextLoopNode = this.getNext();
        this.setNext(loopNode);
        loopNode.setNext(currentNextLoopNode);
    }

    public void showLoopNode(){
        LoopNode currentLoopNode = this;
        int i=0;
        while(currentLoopNode.getNext()!=null&&i<10){
            i++;
            System.out.println(currentLoopNode.getData());
            currentLoopNode = currentLoopNode.getNext();
        }
    }


}
