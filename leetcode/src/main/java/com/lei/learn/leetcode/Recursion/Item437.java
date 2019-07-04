package com.lei.learn.leetcode.Recursion;

public class Item437 {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public static int pathFrom(TreeNode root, int sum) {
        if (root == null) return 0;
        return (root.val == sum ? 1 : 0)
                + pathFrom(root.left, sum - root.val) + pathFrom(root.right, sum - root.val);

    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(19);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(-1);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(10);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(1);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node4.right = node9;
        node6.left = node10;
        node6.right = node11;

        System.out.println(pathSum(node1, 20));

    }


}
