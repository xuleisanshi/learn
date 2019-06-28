package com.lei.learn.leetcode.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public static List<Integer> lelelOrderTraverse(TreeNode treeNode) {

    List<Integer> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(treeNode);
    while (!queue.isEmpty()) {
      TreeNode tmp = queue.poll();
      result.add(tmp.val);
      if (tmp.left != null) {
        queue.add(tmp.left);
      }
      if (tmp.right != null) {
        queue.add(tmp.right);
      }
    }
    return result;
  }

  public static void main(String[] args) {

    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node6 = new TreeNode(6);
    TreeNode node7 = new TreeNode(7);
    TreeNode node8 = new TreeNode(8);

    node1.left = node2;
    node1.right = node3;
    node2.left = node4;
    node2.right = node5;
    node3.left = node6;
    node3.right = node7;
    node4.left = node8;

    System.out.println(lelelOrderTraverse(node1).toString());
  }
}
