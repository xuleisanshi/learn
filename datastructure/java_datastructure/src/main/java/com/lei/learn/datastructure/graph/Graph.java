package com.lei.learn.datastructure.graph;

import com.lei.learn.datastructure.linearStructue.StackObject;

/**
 * 图
 */
public class Graph {
    private Vertex[] vertices;
    private int currentSize;
    private int[][] adjMat;
    private StackObject<String> stack = new StackObject<>();
    private int currentIndex = 0;

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Graph(int size) {
        vertices = new Vertex[size];
        adjMat = new int[size][size];
    }


    /**
     * 深度优先搜索算法应用
     */
    public void dfs() {
        //找到第0个元素标记为已访问
        vertices[0].setVisited(true);
        //把第0个元素放入栈
        stack.push(vertices[0].getValue());
        System.out.println(vertices[0].getValue());
        while (!stack.isEmpty()) {
            for (int i = currentIndex + 1; i < vertices.length; i++) {
                //如果和下一个遍历的元素相关联
                if (adjMat[currentIndex][i] == 1 && vertices[i].isVisited() == false) {
                    stack.push(vertices[i].getValue());
                    vertices[i].setVisited(true);
                    System.out.println(vertices[i].getValue());
                }

            }
            //弹出栈顶元素
            stack.pop();
            //修改当前位置为栈顶元素的位置
            if (!stack.isEmpty()) {
                currentIndex = getIndex(new Vertex(stack.top()));
            }

        }

    }

    public StackObject getStack() {
        return stack;
    }

    public void setStack(StackObject stack) {
        this.stack = stack;
    }

    /**
     * 向图中加入一个顶点
     *
     * @param vertex
     */
    public void addVertex(Vertex vertex) {
        vertices[currentSize++] = vertex;

    }

    /**
     * 增加一个边
     */
    public void addEdge(Vertex v1, Vertex v2) {
        int index1 = getIndex(v1);
        int index2 = getIndex(v2);

        if (index1 >= 0 && index2 >= 0) {
            adjMat[index1][index2] = 1;
            adjMat[index2][index1] = 1;
        }

    }

    /**
     * get index of one vertex
     */
    public int getIndex(Vertex vertex) {
        int index = -1;
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].getValue() == vertex.getValue()) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Vertex[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertex[] vertices) {
        this.vertices = vertices;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int[][] getAdjMat() {
        return adjMat;
    }

    public void setAdjMat(int[][] adjMat) {
        this.adjMat = adjMat;
    }

}
