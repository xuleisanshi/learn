package com.lei.learn.leetcode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Item230 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        result = inOrd(root, result);

        return result.get(k - 1);

    }

    private static List<Integer> inOrd(TreeNode root, List<Integer> result) {

        if (root == null) {
            return result;
        }
        if (root.left != null) result = inOrd(root.left, result);
        result.add(root.val);
        if (root.right != null) result = inOrd(root.right, result);

        return result;
    }


    public static void main(String[] args) {

    }
}
