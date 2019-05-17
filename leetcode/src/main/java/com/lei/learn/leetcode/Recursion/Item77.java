package com.lei.learn.leetcode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Item77 {
  /**
   * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
   * Example:
   * <p>
   * Input: n = 4, k = 2
   * Output:
   * [
   * [2,4],
   * [3,4],
   * [2,3],
   * [1,2],
   * [1,3],
   * [1,4],
   * ]
   */

  public static List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> arrayLists = new ArrayList<>();

    for (int i = 1, j = i + 1; i <= n; i++) {
      List<Integer> integers = new ArrayList<>();
      integers.add(i);
      //add the next part
    }
    return arrayLists;
  }

  public static void main(String[] args) {
    int n = 4, k = 2;
    System.out.println(combine(n, k).toString());
  }
}
