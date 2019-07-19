package com.lei.learn.leetcode.HackerRank;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.List;

public class Test {

  public static int minSum(List<Integer> num, int k) {
    // Write your code here

    for (int temp = 0; temp < k; temp++) {
      replace(num);
    }

    int result = 0;
    for (Integer i : num) {
      result = result + i;
    }
    return result;
  }

  private static void replace(List<Integer> num) {
    int replaceIndex = getMax(num);
    double d = num.get(replaceIndex) / 2.0;
    num.set(replaceIndex, (int)Math.round(d));
  }

  public static int getMax(List<Integer> num) {
    int max = num.get(0);
    int index = 0;
    for (int i = 0; i < num.size(); i++) {
      if (num.get(i) > max) {
        max = num.get(i);
        index = i;
      }
    }
    return index;
  }

  public static int[] bubbleSort(int[] array) {
    int tmp;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j + 1] < array[j]) {
          tmp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = tmp;
        }
      }
    }
    return array;
  }

  public static void main(String[] args) {
    int a = 3;
    a = Math.round(3 / 2);
    System.out.println(a);
  }

  private void increate(int[] a) {
    a[a.length - 1]++;
  }
}
