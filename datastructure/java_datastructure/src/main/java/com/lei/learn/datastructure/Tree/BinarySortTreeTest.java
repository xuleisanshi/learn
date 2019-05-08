package com.lei.learn.datastructure.Tree;

public class BinarySortTreeTest {
  public static void main(String[] args) {
    int[] array = new int[]{7, 3, 10, 12, 5, 1, 9};

    BinarySortTree binarySortTree = new BinarySortTree();
    for (int i : array) {
      binarySortTree.add(new TreeNode(i));
    }

    binarySortTree.midShow();

    System.out.println("==============================");

    binarySortTree.frontShow();
  }
}
