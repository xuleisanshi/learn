package com.lei.learn.datastructure.linearStructue;

public class NodeTest {
    public static void main(String[] args) {
        Node node1 = new Node("a");
        Node node2 = new Node("b");
        Node node3 = new Node("c");
        node1.setNext(node2);
        node2.setNext(node3);

        Node node4 = new Node("8");
        node1.after(node4);

        node1.printNode();
        System.out.println(node3.isLast());
        System.out.println(node1.getLength());
        node1.removeNext();
        System.out.println(node1.getLength());





    }
}
