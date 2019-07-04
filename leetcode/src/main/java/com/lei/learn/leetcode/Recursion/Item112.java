package com.lei.learn.leetcode.Recursion;

public class Item112 {

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return sum == root.val;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(-1);
        TreeNode node2 = new TreeNode(-2);


        node1.right = node2;

        hasPathSum(node1, -3);

    }


}
