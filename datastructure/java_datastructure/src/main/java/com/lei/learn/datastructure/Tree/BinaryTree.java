package com.lei.learn.datastructure.Tree;

public class BinaryTree {

    private TreeNode rootNode;

    public void setRootNode(TreeNode rootNode) {
        this.rootNode = rootNode;
    }


    public TreeNode getRootNode() {
        return rootNode;
    }

    public void frontShow() {
        this.getRootNode().frontShow();
    }
    public void midShow(){
        this.getRootNode().midShow();
    }

    public void afterShow(){
        this.getRootNode().afterShow();
    }
}
