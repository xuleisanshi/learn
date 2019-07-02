package com.lei.learn.leetcode.Recursion;

import org.bouncycastle.crypto.tls.MACAlgorithm;

public class Item110 {

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);


        return Math.abs(left - right) < 2 && isBalanced(root.left) && isBalanced(root.right);


    }


    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftResult = maxDepth(root.left);
        int rightResult = maxDepth(root.right);

        return Math.max(leftResult, rightResult) + 1;
    }


}
