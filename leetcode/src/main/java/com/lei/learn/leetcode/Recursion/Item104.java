package com.lei.learn.leetcode.Recursion;

public class Item104 {


    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftResult = maxDepth(root.left);
        int rightResult = maxDepth(root.right);

        return Math.max(leftResult, rightResult) + 1;
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftResult = minDepth(root.left);
        int rightResult = minDepth(root.right);

        return (leftResult == 0 || rightResult == 0) ? leftResult + rightResult + 1 : Math.min(leftResult, rightResult) + 1;

    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);

        node1.left = node2;
//        node1.right = node3;
//        node2.left = node4;
//        node2.right = node5;
//        node3.left = node6;
//        node3.right = node7;
//        node4.left = node8;
//        node4.right = node9;
//        node6.left = node10;
//        node6.right = node11;

        System.out.println(minDepth(node1));
    }


}
