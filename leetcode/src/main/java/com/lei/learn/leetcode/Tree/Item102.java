package com.lei.learn.leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Item102 {
  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      List<Integer> tmpList = new ArrayList<>();
      TreeNode tmpNode = ((LinkedList<TreeNode>) queue).pop();
      tmpList.add(tmpNode.val);
    }

    return result;
  }

  public static void main(String[] args) {

  }
}
