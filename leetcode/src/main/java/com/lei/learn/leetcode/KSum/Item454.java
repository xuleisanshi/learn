package com.lei.learn.leetcode.KSum;

import java.util.HashMap;
import java.util.Map;

public class Item454 {
  public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    int result = 0;
    Map<Integer, Integer> sum1 = new HashMap<>();
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < B.length; j++) {
        sum1.put(A[i] + B[j], sum1.getOrDefault(A[i] + B[j], 0) + 1);
      }
    }

    for (int k = 0; k < C.length; k++) {
      for (int l = 0; l < D.length; l++) {
        int sum2 = C[k] + D[l];
        result = result + sum1.getOrDefault(-sum2, 0);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] A = new int[]{1,2};
    int[] B = new int[]{-2, -1};
    int[] C = new int[]{-1, 2};
    int[] D = new int[]{0, 2};
    System.out.println(fourSumCount(A, B, C, D));
  }
}
