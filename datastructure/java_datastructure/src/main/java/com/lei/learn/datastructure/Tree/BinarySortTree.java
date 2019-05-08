package com.lei.learn.datastructure.Tree;

public class BinarySortTree {
  private TreeNode rootNode;

  public BinarySortTree() {
  }

  public TreeNode getRootNode() {
    return rootNode;
  }

  public void setRootNode(TreeNode rootNode) {
    this.rootNode = rootNode;
  }

  public void midShow() {
    if (this.getRootNode() != null) {
      this.getRootNode().midShow();
    }
  }

  public void frontShow() {
    this.getRootNode().frontShow();
  }

  public void add(TreeNode node) {
    if (rootNode == null) {
      this.setRootNode(node);
    } else {
      rootNode.add(node);
    }
  }
}
