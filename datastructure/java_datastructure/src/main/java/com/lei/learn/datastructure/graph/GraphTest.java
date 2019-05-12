package com.lei.learn.datastructure.graph;

import java.util.Arrays;

public class GraphTest {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Graph graph = new Graph(5);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        graph.addEdge(v1, v3);
        graph.addEdge(v2, v3);
        graph.addEdge(v1, v2);
        graph.addEdge(v2, v4);
        graph.addEdge(v2, v5);


        for (int[] a : graph.getAdjMat()) {
            System.out.println(Arrays.toString(a));
        }

    }
}
