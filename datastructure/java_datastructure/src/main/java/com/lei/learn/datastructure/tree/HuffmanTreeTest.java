package com.lei.learn.datastructure.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTreeTest {

  /**
   * HuffmanTree的特点
   * 1，WPL最小，也就是说权越大的节点，距离根节点越近
   * 构建huffmanTree的流程
   * 0，使用数组中所有的元素创建若干个二叉树，只有一个节点
   * 1，对数据进行排序
   * 2，取出两个权值最小的二叉树
   * 3，组成一个新的二叉树，前边两个二叉树是新的二叉树的两个子树。
   * 4，新的二叉树的根节点是前边取出来的两个二叉树的权值之和。
   * 5，用新生成的树的根节点进行排序
   */

  public static void main(String[] args) {
    int[] array = {3, 8, 7, 29, 5, 11, 23, 24};
    HuffmanNode huffmanNode = createHuffmanNodeTree(array);
    System.out.println(huffmanNode);
  }

  private static HuffmanNode createHuffmanNodeTree(int[] array) {
    //构建若干二叉树，只有一个节点
    List<HuffmanNode> huffmanNodes = new ArrayList<>();
    for (int value : array) {
      huffmanNodes.add(new HuffmanNode(value));
    }
    //取出前两个最小的二叉树，组成新的二叉树
    while (huffmanNodes.size() > 1) {
      Collections.sort(huffmanNodes);

      //取出权值最小的二叉树
      HuffmanNode leftNode = huffmanNodes.get(huffmanNodes.size() - 1);
      //取出权值次小的二叉树
      HuffmanNode rightNode = huffmanNodes.get(huffmanNodes.size() - 2);
      //创建新的二叉树
      HuffmanNode parentNode = new HuffmanNode(leftNode.getValue() + rightNode.getValue());
      huffmanNodes.remove(leftNode);
      huffmanNodes.remove(rightNode);
      huffmanNodes.add(parentNode);
    }

    return huffmanNodes.get(0);
  }
}
