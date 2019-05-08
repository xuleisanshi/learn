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

  public void midShow() {
    this.getRootNode().midShow();
  }

  public void afterShow() {
    this.getRootNode().afterShow();
  }

  public TreeNode frontSearch(int target) {
    return this.getRootNode().frontSearch(target);
  }

  public TreeNode midSearch(int target) {
    return this.getRootNode().midSearch(target);
  }

  public void delete(int target) {
    if (this.getRootNode().getValue() == target) {
      this.setRootNode(null);
    } else {
      this.getRootNode().delete(target);
    }
  }
}
