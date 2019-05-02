package com.lei.learn.datastructure.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] tmp = new int[]{10, 1, 3, 5, 3, 9, 18, 37};

        System.out.println(Arrays.toString(tmp));
        tmp = mergeSort(tmp);
        System.out.println(Arrays.toString(tmp));

    }

    private static int[] mergeSort(int[] array) {
        return array;
    }
}
