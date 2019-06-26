package com.lei.learn.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class Item145 {
    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        postOrderPrint(root, list);
        return list;
    }


    public static void postOrderPrint(TreeNode root, List<Integer> list) {

        if (root.left != null) {

            postOrderPrint(root.left, list);
        }
        if (root.right != null) {

            postOrderPrint(root.right, list);
        }

        list.add(root.val);


    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root).toString());

    }


}