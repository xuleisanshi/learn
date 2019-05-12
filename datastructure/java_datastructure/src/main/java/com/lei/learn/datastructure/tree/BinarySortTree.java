package com.lei.learn.datastructure.tree;

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

  public TreeNode search(int value) {
    if (this.getRootNode() == null) {

      return null;
    } else {
      return this.getRootNode().search(value);
    }
  }

  public void delete(int value) {
    if (this.getRootNode() == null) {
      return;
    } else {
      //找到节点
      TreeNode treeNode = this.search(value);
      if (treeNode == null) {
        return;
      }
      //找到他的父节点
      TreeNode parentNode = this.searchParent(value);
      //如果删除是叶子节点
      if (treeNode.getRightNode() == null && treeNode.getLeftNode() == null) {
        if (parentNode.getLeftNode().getValue() == treeNode.getValue()) {
          parentNode.setLeftNode(null);
        } else {
          parentNode.setRightNode(null);
        }
      }
      //如果删除带有一个节点的子节点
      if (treeNode.getLeftNode() == null && treeNode.getRightNode() != null) {
        if (parentNode.getValue() > treeNode.getRightNode().getValue()) {
          parentNode.setLeftNode(treeNode.getRightNode());
        } else {
          parentNode.setRightNode(treeNode.getRightNode());
        }
      }
      if (treeNode.getRightNode() == null && treeNode.getLeftNode() != null) {
        if (parentNode.getValue() > treeNode.getLeftNode().getValue()) {
          parentNode.setLeftNode(treeNode.getLeftNode());
        } else {
          parentNode.setRightNode(treeNode.getLeftNode());
        }
      }
      //todo 删除具有两个节点的节点
      if (treeNode.getRightNode() != null && treeNode.getLeftNode() != null) {
        //删除右子树中最小的节点,并拿到其值
        int min = deleteMin(treeNode.getRightNode());
        treeNode.setValue(min);
      }
    }
  }

  //删除一棵树中最小的节点
  private int deleteMin(TreeNode treeNode) {
    TreeNode target = treeNode;
    while (target.getLeftNode() != null) {
      target = target.getLeftNode();
    }
    delete(target.getValue());

    return target.getValue();
  }

  public TreeNode searchParent(int value) {
    if (this.getRootNode() == null) {
      return null;
    } else {
      return this.getRootNode().searchParent(value);
    }
  }
}
