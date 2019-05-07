package com.lei.learn.datastructure.Tree;

public class ThreadedBinaryTreeTest {

  public static void main(String[] args) {
    ThreadedNode rootNode = new ThreadedNode(1);
    ThreadedBinaryTree binaryTree = new ThreadedBinaryTree(rootNode);

    ThreadedNode leftNode = new ThreadedNode(2);
    ThreadedNode rightNode = new ThreadedNode(3);

    rootNode.setLeftNode(leftNode);
    rootNode.setRightNode(rightNode);

    leftNode.setLeftNode(new ThreadedNode(4));
    leftNode.setRightNode(new ThreadedNode(5));

    rightNode.setLeftNode(new ThreadedNode(6));
    rightNode.setRightNode(new ThreadedNode(7));

    //中序遍历
    binaryTree.midShow();
    //中序线索化二叉树
    binaryTree.threadNodes();
    System.out.println("====================");
    //遍历中序线索化二叉树
    binaryTree.threadIterate();
  }
}
