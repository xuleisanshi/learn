package com.lei.learn.datastructure.Tree;

public class ArrayTree {

  private String[] data;

  public ArrayTree(String[] data) {
    this.data = data;
  }

  public String[] getData() {
    return data;
  }

  public void setData(String[] data) {
    this.data = data;
  }

  /*
  left child node, 2n+1
  right child node 2n+2
   */
  //frontShow
  public void frontShow(int start) {
    if (data == null || data.length == 0) {
      return;
    }
    System.out.println(data[start]);
    if ((2 * start + 1) < data.length) {
      frontShow(2 * start + 1);
    }
    if ((2 * start + 2) < data.length) {
      frontShow(2 * start + 2);
    }
  }
}
