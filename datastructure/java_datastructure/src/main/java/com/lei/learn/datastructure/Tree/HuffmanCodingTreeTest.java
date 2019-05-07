package com.lei.learn.datastructure.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HuffmanCodingTreeTest {
  public static void main(String[] args) {
    String msg =
        "The aim of the GDPR is to protect all EU citizens from privacy and data breaches in "
            + "today’s data-driven world. Although the key principles of data privacy still hold "
            + "true to the previous directive, many changes have been proposed to the regulatory "
            + "policies; the key points of the GDPR as well as information on the impacts it will"
            + " have on business can be found below.";
    byte[] bytes = msg.getBytes();
    System.out.println(Arrays.toString(bytes));
    byte[] result = huffmanZip(bytes);
  }

  /**
   * 进行霍夫曼压缩的方法
   * 0，统计每个byte出现的次数，并放入集合中
   * 1，创建霍夫曼树
   * 3，创建霍夫曼编码表
   * 4，编码
   *
   * @param bytes
   * @return
   */
  public static byte[] huffmanZip(byte[] bytes) {
    //先统计每个byte出现的次数，并放入集合中
    List<HuffmanCodingNode> huffmanCodingNodes = getHuffmanCodingNodes(bytes);
    //创建霍夫曼树
    HuffmanCodingNode tree = createHuffmanTree(huffmanCodingNodes);
    return null;
  }

  /**
   * j将byte数组，转为huffmanCodingNode集合
   *
   * @param bytes
   * @return
   */
  public static List<HuffmanCodingNode> getHuffmanCodingNodes(byte[] bytes) {
    List<HuffmanCodingNode> huffmanCodingNodes = new ArrayList<>();
    Map<Byte, Integer> counts = new HashMap<>();
    //统计每个byte出现的次数
    for (byte b : bytes) {
      Integer count = counts.get(b);
      if (count == null) {
        counts.put(b, 1);
      } else {
        counts.put(b, count++);
      }
    }
    //把每一个键值对转为huffmanCodingNode对象
    for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
      huffmanCodingNodes.add(new HuffmanCodingNode(entry.getKey(), entry.getValue()));
    }

    return huffmanCodingNodes;
  }

  //创建huffmantree
  public static HuffmanCodingNode createHuffmanTree(List<HuffmanCodingNode> huffmanCodingNodes) {
    while (huffmanCodingNodes.size() > 1) {
      Collections.sort(huffmanCodingNodes);
      HuffmanCodingNode leftNode = huffmanCodingNodes.get(huffmanCodingNodes.size() - 1);
      HuffmanCodingNode rightNode = huffmanCodingNodes.get(huffmanCodingNodes.size() - 2);
      HuffmanCodingNode parent;
      parent = new HuffmanCodingNode(null, (leftNode.getWeight() + rightNode.getWeight()));
      parent.setLeftNode(leftNode);
      parent.setRightNode(rightNode);
      huffmanCodingNodes.remove(leftNode);
      huffmanCodingNodes.remove(rightNode);
      huffmanCodingNodes.add(parent);
    }

    return huffmanCodingNodes.get(0);
  }
}
