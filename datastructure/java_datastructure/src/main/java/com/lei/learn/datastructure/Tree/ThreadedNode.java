package com.lei.learn.datastructure.Tree;

public class ThreadedNode {
    private int value;
    private ThreadedNode leftNode;
    private ThreadedNode rightNode;

    private int leftType;
    private int rightType;


    public ThreadedNode(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ThreadedNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(ThreadedNode leftNode) {
        this.leftNode = leftNode;
    }

    public ThreadedNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(ThreadedNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public void frontShow() {
        System.out.println(this.getValue());
        if (this.getLeftNode() != null) {
            this.getLeftNode().frontShow();
        }
        if (this.getRightNode() != null) {
            this.getRightNode().frontShow();
        }
    }

    public void midShow() {
        if (this.getLeftNode() != null) {
            this.getLeftNode().midShow();
        }
        System.out.println(this.getValue());
        if (this.getRightNode() != null
        ) {
            this.getRightNode().midShow();
        }

    }

    public void afterShow() {
        if (this.getLeftNode() != null) {
            this.getLeftNode().afterShow();
        }
        if (this.getRightNode() != null
        ) {
            this.getRightNode().afterShow();
        }
        System.out.println(this.getValue());
    }

    public ThreadedNode frontSearch(int target) {
        ThreadedNode targetNode = null;

        if (this.getValue() == target) {
            return this;
        }

        if (this.getLeftNode() != null) {
            targetNode = this.getLeftNode().frontSearch(target);
        }
        if (null != targetNode) {
            return targetNode;
        }
        if (null != this.getRightNode()) {
            targetNode = this.getRightNode().frontSearch(target);
        }

        return targetNode;
    }

    public ThreadedNode midSearch(int target) {
        ThreadedNode targetNode = null;

        if (this.getLeftNode() != null) {
            targetNode = this.getLeftNode().midSearch(target);
            if (targetNode != null) {
                return targetNode;
            }
        }
        if (this.getValue() == target)
            return this;

        if (null != this.getRightNode()) {
            targetNode = this.getRightNode().midSearch(target);
        }

        return targetNode;
    }

    public void delete(int target) {
        ThreadedNode parent = this;
        if (parent.getLeftNode().getValue() == target) {
            parent.setLeftNode(null);
            return;
        }
        if (parent.getRightNode().getValue() == target) {
            parent.setRightNode(null);
            return;
        }
        parent = parent.getLeftNode();
        if (parent != null) {
            parent.delete(target);
        }
        parent = parent.getRightNode();
        if (parent != null) {
            parent.delete(target);
        }
    }
}
