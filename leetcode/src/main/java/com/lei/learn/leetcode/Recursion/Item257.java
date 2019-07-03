package com.lei.learn.leetcode.Recursion;


import java.util.ArrayList;
import java.util.List;

public class Item257 {

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();

        if (root != null) {
            getPath(root, "", list);
        }

        return list;
    }

    private static void getPath(TreeNode root, String string, List<String> list) {

        if (root.left == null && root.right == null) list.add(string + root.val);
        string = string + root.val+"->";
        if (root.left != null) getPath(root.left, string, list);
        if (root.right != null) getPath(root.right, string, list);
    }


}
