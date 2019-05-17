package com.lei.learn.datastructure.sort;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {

    int[] tmp = new int[]{3, 2, 1, 5, 6, 4};

    //        System.out.println(Arrays.toString(tmp));
    tmp = quickSort(tmp, 0, tmp.length);
    System.out.println(Arrays.toString(tmp));
  }


  //TODO YOUBUG
  private static int[] quickSort(int[] array, int start, int end) {
    int base = array[start];
    int low = start;
    int high = end;
    if (start < end) {
      while (low < high) {
        while (base <= array[high] && high > low) {
          high--;
        }
        array[low] = array[high];
        while (base >= array[low] && low < high) {
          low++;
        }
        array[high] = array[low];
      }

      array[low] = base;
      quickSort(array, start, low);
      quickSort(array, low + 1, high);
    }
    return array;
  }
}
