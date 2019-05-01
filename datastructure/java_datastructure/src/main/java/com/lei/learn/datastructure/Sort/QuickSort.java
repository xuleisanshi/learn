package com.lei.learn.datastructure.Sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] tmp = new int[]{10, 1, 3, 5, 3, 9, 18, 37};

//        System.out.println(Arrays.toString(tmp));
        tmp = quickSort(tmp, 0, tmp.length - 1);
        System.out.println(Arrays.toString(tmp));

    }

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
