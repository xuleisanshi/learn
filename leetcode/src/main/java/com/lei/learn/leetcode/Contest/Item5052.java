package com.lei.learn.leetcode.Contest;

import java.util.*;

public class Item5052 {

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int maxLevelSum(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        result = levelOrderTraverse(root);
        Map<Integer, Integer> map = new HashMap<>();
        int maxLevel = 0;
        for (int i = 0; i < result.size(); i++) {
            int sum = 0;
            for (int j = 0; j < result.get(i).size(); j++) {
                sum = result.get(i).get(j) + sum;
            }
            map.put(i, sum);
            if (map.get(maxLevel)<sum){
                maxLevel=i;
            }
        }
        return maxLevel+1;
    }

    public static  List<List<Integer>> levelOrderTraverse(TreeNode treeNode) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
        List<Integer> tmpLevel = new LinkedList<>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode tmp = queue.poll();
                tmpLevel.add(tmp.val);
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
            result.add(tmpLevel);
        }
        return result;
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(0);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(-8);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        System.out.println(maxLevelSum(node1));
    }


}
