package com.lei.learn.leetcode.Recursion;

public class Item222 {
    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);
        return leftNode + rightNode + 1;

    }


    public static int countNodesByCompleteTree(TreeNode root) {

        int leftDepth = getLeftDeep(root);
        int rightDepth = getRightDeep(root);
        if (leftDepth == rightDepth) {
            return (1 << leftDepth) - 1;
        } else
            return 1 + countNodesByCompleteTree(root.left) + countNodesByCompleteTree(root.right);
    }


    public static int getLeftDeep(TreeNode root) {
        int level = 0;
        while (root != null) {
            root = root.left;
            level++;
        }
        return level;
    }

    public static int getRightDeep(TreeNode root) {
        int level = 0;
        while (root != null) {
            root = root.right;
            level++;
        }
        return level;
    }

    public static int mostLeftLevel(TreeNode root, int level) {
        while (root != null) {
            level++;
            root = root.left;
        }
        return level - 1;
    }

    public static void main(String[] args) {

    }


}
