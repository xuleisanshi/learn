package com.lei.learn.datastructure.tree;

public class ArrayTreeTest {
  public static void main(String[] args) {
    String[] data = {"A", "B", "C", "D", "E", "F","G"};
    ArrayTree arrayTree = new ArrayTree(data);
    arrayTree.frontShow(0);
  }
}
