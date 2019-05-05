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

    public TreeNode frontSearch(String target) {
        TreeNode targetNode = null;

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

    public TreeNode midSearch(String target) {
        TreeNode targetNode = null;

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

    public void delete(String target) {
        TreeNode parent = this;
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
