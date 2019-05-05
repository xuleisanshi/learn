package com.lei.learn.datastructure.Tree;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode rootNode = new TreeNode("A");
        binaryTree.setRootNode(rootNode);

        TreeNode leftNode = new TreeNode("B");
        TreeNode rightNode = new TreeNode("C");

        rootNode.setLeftNode(leftNode);
        rootNode.setRightNode(rightNode);

        leftNode.setLeftNode(new TreeNode("D"));
        leftNode.setRightNode(new TreeNode("E"));

        rightNode.setLeftNode(new TreeNode("F"));
        rightNode.setRightNode(new TreeNode("G"));

        //前序遍历
        binaryTree.frontShow();
        System.out.println("====================");
        //中序遍历
        binaryTree.midShow();
        System.out.println("====================");
        //后序遍历
        binaryTree.afterShow();


        System.out.println("=========front search========");
        TreeNode treeNode = binaryTree.frontSearch("E");
        System.out.println(treeNode);


        System.out.println("=========mid search========");
        TreeNode treeNode1 = binaryTree.midSearch("E");
        System.out.println(treeNode1);
        System.out.println(treeNode1.getValue());


    }
}
