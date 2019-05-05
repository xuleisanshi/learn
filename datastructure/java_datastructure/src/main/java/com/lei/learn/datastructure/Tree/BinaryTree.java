package com.lei.learn.datastructure.Tree;

import apple.laf.JRSUIUtils;

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

    public void midShow() {
        this.getRootNode().midShow();
    }

    public void afterShow() {
        this.getRootNode().afterShow();
    }

    public TreeNode frontSearch(String target) {
        return this.getRootNode().frontSearch(target);
    }

    public TreeNode midSearch(String target) {
        return this.getRootNode().midSearch(target);
    }
}
