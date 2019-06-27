package com.lei.learn.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class Item94 {
    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        inOrderPrint(root, list);
        return list;
    }


    public static void inOrderPrint(TreeNode root, List<Integer> list) {

        if (root.left != null) {
            inOrderPrint(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            inOrderPrint(root.right, list);
        }


    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(root).toString());

    }


}