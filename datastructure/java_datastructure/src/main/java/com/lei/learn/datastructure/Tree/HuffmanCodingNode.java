package com.lei.learn.datastructure.Tree;

public class HuffmanCodingNode implements Comparable<HuffmanCodingNode> {
  private byte data;
  private int weight;
  private HuffmanCodingNode leftNode;
  private HuffmanCodingNode rightNode;

  public HuffmanCodingNode(byte data, int weight) {
    this.data = data;
    this.weight = weight;
  }

  public byte getData() {
    return data;
  }

  public void setData(byte data) {
    this.data = data;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public HuffmanCodingNode getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(HuffmanCodingNode leftNode) {
    this.leftNode = leftNode;
  }

  public HuffmanCodingNode getRightNode() {
    return rightNode;
  }

  public void setRightNode(HuffmanCodingNode rightNode) {
    this.rightNode = rightNode;
  }

  @Override
  public int compareTo(HuffmanCodingNode o) {
    return -(this.getWeight() - o.getWeight());
  }

  @Override
  public String toString() {
    return "HuffmanCodingNode{" + "data=" + data + ", weight=" + weight + '}';
  }
}
