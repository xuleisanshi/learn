package com.lei.learn.leetcode.Recursion;

public class Item108 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) return null;
        TreeNode head = generateTree(nums, 0, nums.length - 1);

        return head;

    }

    private static TreeNode generateTree(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = generateTree(nums, low, mid - 1);
        head.right = generateTree(nums, mid + 1, high);
        return head;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        sortedArrayToBST(nums);

    }
}
