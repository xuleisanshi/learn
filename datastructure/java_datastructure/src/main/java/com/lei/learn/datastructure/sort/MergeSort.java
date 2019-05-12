package com.lei.learn.datastructure.sort;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {

    int[] tmp = new int[]{1, 3, 5, 7, 2, 4, 6, 8, 10, 11, 12, 0};

    System.out.println(Arrays.toString(tmp));
    mergeSort(tmp, 0, tmp.length - 1);
    //    tmp = mergeSort(tmp);
    System.out.println(Arrays.toString(tmp));
  }

  private static int[] mergeSort(int[] array, int low, int high) {
    int mid = (low + high) / 2;
    if (low < high) {

      mergeSort(array, low, mid);
      mergeSort(array, mid + 1, high);
      merge(array, low, mid, high);
    }
    return array;
  }

  private static void merge(int[] array, int start, int mid, int end) {
    int[] tmpArray = new int[end - start + 1];
    int indexLeft = start;
    int indexRight = mid + 1;
    int i = 0;
    while (indexLeft <= mid && indexRight <= end) {
      if (array[indexLeft] < array[indexRight]) {
        tmpArray[i++] = array[indexLeft++];
      } else {
        tmpArray[i++] = array[indexRight++];
      }
    }

    while (indexLeft <= mid) {
      tmpArray[i++] = array[indexLeft++];
    }
    while (indexRight <= end) {
      tmpArray[i++] = array[indexRight++];
    }

    for (int j = 0; j < tmpArray.length; j++) {

      array[j + start] = tmpArray[j];
    }
  }
}
