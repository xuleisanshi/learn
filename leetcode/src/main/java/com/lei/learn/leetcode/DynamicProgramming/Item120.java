package com.lei.learn.leetcode.DynamicProgramming;

import java.util.List;

public class Item120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        assert triangle.size() > 2;

        for (int i = triangle.size() - 2; i >= 0; i--)
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int v = triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, v);
            }
        return triangle.get(0).get(0);


    }


    public static void main(String[] args) {

    }
}
