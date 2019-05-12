package com.lei.learn.datastructure.sort;

import java.util.Arrays;

public class SelectSort {
  public static void main(String[] args) {

    int[] tmp = new int[]{10, 1, 3, 5, 3, 9, 18, 37};

    System.out.println(Arrays.toString(tmp));
    tmp = selectSort(tmp);
    System.out.println(Arrays.toString(tmp));
  }

  private static int[] selectSort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[minIndex] > array[j]) {
          minIndex = j;
        }
      }
      int tmp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = tmp;
    }
    return array;
  }
}
