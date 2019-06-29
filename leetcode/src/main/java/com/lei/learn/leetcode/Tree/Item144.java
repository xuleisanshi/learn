package com.lei.learn.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Item144 {


    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        preOrderPrint(root, list);
        return list;
    }


    /**
     * Use stack
     *
     * @return
     */
    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();
        while (root != null) {
            list.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            root = root.left;
            if (root == null && !stack.isEmpty()) {
                root = stack.pop();
            }
        }
        return list;
    }

    public static void preOrderPrint(TreeNode root, List<Integer> list) {

        list.add(root.val);
        if (root.left != null) {

            preOrderPrint(root.left, list);
        }
        if (root.right != null) {

            preOrderPrint(root.right, list);
        }


    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root).toString());
        System.out.println(preOrderTraversal(root).toString());

    }


}
