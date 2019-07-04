package com.lei.learn.leetcode.Recursion;

public class Item98 {


    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private static boolean helper(TreeNode root, Integer min, Integer max) {

        if (root == null) return true;
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;

        if (!helper(root.right, root.val, max)) return false;
        if (!helper(root.left, min, root.val)) return false;
        return true;


    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(15);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(20);

        node1.left = node2;
        node1.right = node3;
        node3.left = node6;
        node3.right = node7;

        System.out.println(isValidBST(node1));
    }


}
