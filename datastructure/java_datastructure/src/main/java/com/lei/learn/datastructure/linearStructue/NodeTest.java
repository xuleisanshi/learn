package com.lei.learn.datastructure.linearStructue;

public class NodeTest {
    public static void main(String[] args) {
//        Node node1 = new Node("a");
//        Node node2 = new Node("b");
//        Node node3 = new Node("c");
//        node1.setNext(node2);
//        node2.setNext(node3);
//
//        Node node4 = new Node("8");
//        node1.after(node4);
//
//        node1.printNode();
//        System.out.println(node3.isLast());
//        System.out.println(node1.getLength());
//        node1.removeNext();
//        System.out.println(node1.getLength());

//        LoopNode loopNode1 = new LoopNode("a");
//        LoopNode loopNode2 = new LoopNode("b");
//        LoopNode loopNode3 = new LoopNode("c");
//        LoopNode loopNode4 = new LoopNode("d");
//        loopNode1.after(loopNode2);
//        loopNode2.after(loopNode3);
//        System.out.println(loopNode1.getNext().getData());
//        loopNode1.showLoopNode();

        DoubleNode doubleNode1 = new DoubleNode("1");
        DoubleNode doubleNode2 = new DoubleNode("2");
        DoubleNode doubleNode3 = new DoubleNode("3");
        DoubleNode doubleNode4 = new DoubleNode("4");
        DoubleNode doubleNode5 = new DoubleNode("5");
        DoubleNode doubleNode6 = new DoubleNode("6");

        doubleNode1.after(doubleNode2);
        doubleNode2.after(doubleNode3);
        doubleNode3.after(doubleNode4);
        doubleNode1.show();


    }
}
