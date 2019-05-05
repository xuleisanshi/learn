package com.lei.learn.datastructure.Tree;

public class TreeNode {
    private String value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
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

}
