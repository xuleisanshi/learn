package com.lei.learn.datastructure.Tree;

public class ThreadedBinaryTree {
    private ThreadedNode root;
    //临时存储前驱节点
    private ThreadedNode preNode;

    public ThreadedNode getPreNode() {
        return preNode;
    }

    public void setPreNode(ThreadedNode preNode) {
        this.preNode = preNode;
    }


    public ThreadedBinaryTree(ThreadedNode root) {
        this.root = root;
    }

    public void frontShow() {
        this.getRoot().frontShow();
    }

    public void midShow() {
        this.getRoot().midShow();
    }

    public void afterShow() {
        this.getRoot().afterShow();
    }


    //中序线索化二叉树
    public void threadNodes() {
        threadNodes(root);

    }

    public void threadNodes(ThreadedNode node) {
        //当前节点为空，直接返回
        if (node == null) {
            return;
        }
        //处理左子树
        threadNodes(node.getLeftNode());
        //处理前驱节点
        if (node.getLeftNode() == null) {
            //当前节点的左指针指向前驱节点
            node.setLeftNode(preNode);
            node.setLeftType(1);
        }
        //每处理一个节点，当前节点为下一个节点的前驱节点
        preNode = node;
        //如果前驱节点的右指针没有指向右子树，则让前驱节点的右指针指向当前节点并改变前驱节点的右指针类型
        if (preNode != null && preNode.getRightNode() == null) {
            preNode.setRightNode(node);
            preNode.setRightType(1);

        }

        //处理右子树
        threadNodes(node.getRightNode());


    }

    public ThreadedNode getRoot() {
        return root;
    }

    public void setRoot(ThreadedNode root) {
        this.root = root;
    }
}
