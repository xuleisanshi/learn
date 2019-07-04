package com.lei.learn.leetcode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Item129 {

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int sum(TreeNode root) {
        return getSum(root, 0);

    }

    private static int getSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        if (root.right == null && root.left == null) {
            sum = sum * 10 + root.val;
        }
        return getSum(root.left, sum*10+root.val) + getSum(root.right, sum*10+root.val);

    }

    public static int sumNumbers(TreeNode root) {
        int result = 0;
        List<Integer> integers = new ArrayList<>();
        List<String> strings = binaryTreePaths(root);

        for (String s : strings) {
            integers.add(Integer.parseInt(s));
        }

        for (int tmp : integers) {
            result = result + tmp;
        }

        return result;
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
        string = string + root.val;
        if (root.left != null) getPath(root.left, string, list);
        if (root.right != null) getPath(root.right, string, list);
    }


}
