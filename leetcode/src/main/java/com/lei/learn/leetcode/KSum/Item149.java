package com.lei.learn.leetcode.KSum;

import java.util.HashMap;
import java.util.Map;

public class Item149 {

  //not correct, should be continued!~
  public static int maxPoints(int[][] points) {
    int max = 0;
    if (points.length <= 2) {
      return points.length;
    }

    Map<Double, Integer> map = new HashMap<>();

    for (int i = 0; i < points.length - 1; i++) {
      for (int j = i + 1; j < points.length; j++) {
        int dx = points[j][0] - points[i][0];
        int dy = points[j][1] - points[i][1];
      }
    }

    return max;
  }

  public static void main(String[] args) {
    //{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}
    //{0, 0}, {1, 1}, {0, 0}
    //{1,1},{1,1},{1,1}
    int[][] points = new int[][]{{0, 0}, {1, 1}, {0, 0}};
    System.out.println(maxPoints(points));
  }
}
