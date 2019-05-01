package com.lei.learn.datastructure.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] tmp = new int[]{90, 1, 3, 5, 3, 9, 18, 37};

        System.out.println(Arrays.toString(tmp));
        tmp = bubbleSort(tmp);
        System.out.println(Arrays.toString(tmp));

    }

    public static int[] bubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j + 1] < array[j]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
        }
        return array;
    }
}
