package com.lei.learn.datastructure.graph;

/**
 * 图
 */
public class Graph {
    private Vertex[] vertices;
    private int currentSize;
    private int[][] adjMat;

    public Graph(int size) {
        vertices = new Vertex[size];
        adjMat = new int[size][size];
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

        if (index1>=0&&index2>=0){

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
