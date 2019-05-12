package com.lei.learn.datastructure.tree;

public class TreeNode {
    private int value;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
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
        if (this.getRightNode() != null) {
            this.getRightNode().midShow();
        }
    }

    public void afterShow() {
        if (this.getLeftNode() != null) {
            this.getLeftNode().afterShow();
        }
        if (this.getRightNode() != null) {
            this.getRightNode().afterShow();
        }
        System.out.println(this.getValue());
    }

    public TreeNode frontSearch(int target) {
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

    public TreeNode midSearch(int target) {
        TreeNode targetNode = null;

        if (this.getLeftNode() != null) {
            targetNode = this.getLeftNode().midSearch(target);
            if (targetNode != null) {
                return targetNode;
            }
        }
        if (this.getValue() == target) {
            return this;
        }

        if (null != this.getRightNode()) {
            targetNode = this.getRightNode().midSearch(target);
        }

        return targetNode;
    }

    public void delete(int target) {
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

    /**
     * add a new node to a binary sort tree
     *
     * @param treeNode
     */
    public void add(TreeNode treeNode) {

        //如果是空树，则给root
        if (this == null) {
            return;
        }
        //如果传入的结点值大，则给左
        if (treeNode.getValue() < this.getValue()) {
            //左节点为空，
            if (this.getLeftNode() == null) {
                this.setLeftNode(treeNode);
            } else {
                this.getLeftNode().add(treeNode);
            }
        } else {
            if (this.getRightNode() == null) {
                this.setRightNode(treeNode);
            } else {
                this.getRightNode().add(treeNode);
            }
        }
    }

    public TreeNode search(int value) {
        if (this.getValue() == value) {
            return this;
        } else if (this.getValue() > value) {
            if (this.getLeftNode() == null) {
                return null;
            }
            return this.getLeftNode().search(value);
        } else {
            if (this.getRightNode() == null)
                return null;
            return this.getRightNode().search(value);
        }

    }

    public TreeNode searchParent(int value) {
        if (this.getLeftNode() != null && this.getLeftNode().getValue() == value || (this.getRightNode() != null && this.getRightNode().getValue() == value)) {
            return this;
        } else {
            if (this.getValue() > value && this.getLeftNode() != null) {
                return this.getLeftNode().searchParent(value);
            } else if (this.getValue() < value && this.getRightNode() != null)
                return this.getRightNode().searchParent(value);
        }
        return null;
    }

}
