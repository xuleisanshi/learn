package com.lei.learn.datastructure.Tree;

public class HuffmanNode implements Comparable<HuffmanNode> {
  private int value;
  private HuffmanNode leftNode;
  private HuffmanNode rightNode;

  public HuffmanNode(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public HuffmanNode getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(HuffmanNode leftNode) {
    this.leftNode = leftNode;
  }

  public HuffmanNode getRightNode() {
    return rightNode;
  }

  public void setRightNode(HuffmanNode rightNode) {
    this.rightNode = rightNode;
  }

  @Override
  public int compareTo(HuffmanNode o) {
    return -(this.value - o.value);
  }

  @Override
  public String toString() {
    return "HuffmanNode{" + "value=" + value + '}';
  }
}
