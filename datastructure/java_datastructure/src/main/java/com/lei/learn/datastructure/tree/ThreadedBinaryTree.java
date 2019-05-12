package com.lei.learn.datastructure.tree;

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

  public ThreadedNode getRoot() {
    return root;
  }

  public void setRoot(ThreadedNode root) {
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
    //如果前驱节点的右指针没有指向右子树，则让前驱节点的右指针指向当前节点并改变前驱节点的右指针类型
    if (preNode != null && preNode.getRightNode() == null) {
      preNode.setRightNode(node);
      preNode.setRightType(1);
    }
    //每处理一个节点，当前节点为下一个节点的前驱节点
    preNode = node;
    //处理右子树
    threadNodes(node.getRightNode());
  }
  //TODO  前序线索化二叉树
  //TODO  后序线索化二叉树

  /**
   * 遍历线索二叉树
   */
  public void threadIterate() {
    ThreadedNode node = root;
    while (node != null) {
      //找到最前的节点
      while (node.getLeftType() == 0) {
        node = node.getLeftNode();
      }
      //打印当前的节点
      System.out.println(node.getValue());
      //如果当前节点的右指针指向的是后继节点，可能后续节点还有后续节点
      while (node.getRightType() == 1) {
        node = node.getRightNode();
        System.out.println(node.getValue());
      }
      //替换遍历的节点
      node = node.getRightNode();
    }
  }
}
