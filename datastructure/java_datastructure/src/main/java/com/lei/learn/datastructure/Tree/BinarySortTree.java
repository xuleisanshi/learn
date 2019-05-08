package com.lei.learn.datastructure.Tree;

public class BinarySortTree {
  private TreeNode rootNode;

  public BinarySortTree(TreeNode rootNode) {
    this.rootNode = rootNode;
  }

  public TreeNode getRootNode() {
    return rootNode;
  }

  public void setRootNode(TreeNode rootNode) {
    this.rootNode = rootNode;
  }

  /**
   * add a new node to a binary sort tree
   *
   * @param treeNode
   */
  public void add(TreeNode treeNode) {

    //如果是空树，则给root
    if (this.getRootNode() == null) {
      return;
    }
    //如果传入的结点值大，则给左
    if (treeNode.getValue() < this.getRootNode().getValue()) {

    }
  }
}
