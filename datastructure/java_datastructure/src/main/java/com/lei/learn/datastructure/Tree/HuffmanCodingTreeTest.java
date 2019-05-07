package com.lei.learn.datastructure.Tree;

import java.util.*;

/**
 *
 * 太难了，没想明白，等过段时间再来看！！！
 * 算法之路漫漫，不过终究会解决有所得。
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

public class HuffmanCodingTreeTest {
    public static void main(String[] args) {
        String msg = "can you can a can as a can canner can a can";
        byte[] bytes = msg.getBytes();
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

        //创建huffman 编码表
        Map<Byte, String> huffmanCodes = getCodes(tree);
        //编码
        System.out.println(huffmanCodes);
        byte[] b;
        b = zip(bytes, huffmanCodes);


        return null;
    }

    /**
     * 进行霍夫曼编码
     *
     * @param bytes
     * @param huffmanCodes
     * @return
     */

    private static byte[] zip(byte[] bytes, Map<Byte, String> huffmanCodes) {

        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(huffmanCodes.get(b));
        }
        //定义长度
        int len;
        if (sb.length() % 8 == 0) {
            len = sb.length() / 8;
        } else {
            len = sb.length() / 8 + 1;
        }
        //用于存储压缩后的byte
        byte[] by = new byte[len];
        for (int i=0;i<sb.length();i+=8){


        }
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

    static StringBuilder sb = new StringBuilder();
    static Map<Byte, String> huffCode = new HashMap<>();

    /**
     * 根据huffmantree 得到huffman codes
     *
     * @param node
     * @return
     */

    public static Map<Byte, String> getCodes(HuffmanCodingNode node) {
        if (node == null) {
            return null;
        }
        getCodes(node.getLeftNode(), "0", sb);
        getCodes(node.getRightNode(), "1", sb);

        return huffCode;

    }

    private static void getCodes(HuffmanCodingNode node, String code, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.append(code);
        if (node.getData() == null) {
            getCodes(node.getLeftNode(), "0", sb2);
            getCodes(node.getRightNode(), "1", sb2);
        } else {
            huffCode.put(node.getData(), sb2.toString());
        }
    }

}
