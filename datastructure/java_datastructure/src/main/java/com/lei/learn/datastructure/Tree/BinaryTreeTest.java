package com.lei.learn.datastructure.Tree;

public class BinaryTreeTest {

  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    TreeNode rootNode = new TreeNode(1);
    binaryTree.setRootNode(rootNode);

    TreeNode leftNode = new TreeNode(2);
    TreeNode rightNode = new TreeNode(3);

    rootNode.setLeftNode(leftNode);
    rootNode.setRightNode(rightNode);

    leftNode.setLeftNode(new TreeNode(4));
    leftNode.setRightNode(new TreeNode(5));

    rightNode.setLeftNode(new TreeNode(6));
    rightNode.setRightNode(new TreeNode(7));

    //前序遍历
    binaryTree.frontShow();
    System.out.println("====================");
    //中序遍历
    binaryTree.midShow();
    System.out.println("====================");
    //后序遍历
    binaryTree.afterShow();

    System.out.println("=========front search========");
    TreeNode treeNode = binaryTree.frontSearch(5);
    System.out.println(treeNode);

    System.out.println("=========mid search========");
    TreeNode treeNode1 = binaryTree.midSearch(5);
    System.out.println(treeNode1);
    System.out.println(treeNode1.getValue());

    System.out.println("=========delete a node========");
    binaryTree.frontShow();
    binaryTree.delete(7);
    binaryTree.frontShow();
  }
}
