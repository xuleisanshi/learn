package com.lei.learn.leetcode.KSum;

import java.util.HashMap;
import java.util.Map;

public class Item447 {
    public static int numberOfBoomerangs(int[][] points) {
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j)
                    continue;
                int d = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            for (int value : map.values()) {
                result = result + value * (value - 1);
            }
            map.clear();
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] points = new int[][]{{0, 0}, {1, 0}, {2, 0}};
        System.out.println(numberOfBoomerangs(points));
    }
}
