package com.lei.learn.datastructure.sort;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] tmp = new int[]{10, 1, 3, 5, 3, 9, 18, 37};

    System.out.println(Arrays.toString(tmp));
    tmp = insertionSort(tmp);
    System.out.println(Arrays.toString(tmp));
  }

  private static int[] insertionSort(int[] array) {

    for (int i = 1; i < array.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (array[j] > array[j + 1]) {
          int tmp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = tmp;
        }
      }
    } return array;
  }
}
