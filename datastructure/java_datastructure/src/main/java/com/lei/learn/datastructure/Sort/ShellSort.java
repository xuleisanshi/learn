package com.lei.learn.datastructure.Sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] tmp = new int[]{10, 1, 3, 5, 3, 9, 18, 37};

        System.out.println(Arrays.toString(tmp));
        tmp = shellSort(tmp);
        System.out.println(Arrays.toString(tmp));
    }

    /*
    three loops
    fhe first loop  until d ==1, d=d/2;
    the second loop, loop the all array, by from the 0 one to the dth one;
    the third loop, loop and sort the small array, from the left to the right one.
     */
    private static int[] shellSort(int[] array) {
        for (int d = array.length / 2; d >= 1; d = d / 2)
            for (int i = d; i < array.length; i++)
                for (int j = i - d; j >= 0; j = j - d) {
                    if (array[j] > array[j + d]) {
                        int tmp = array[j];
                        array[j] = array[j + d];
                        array[d + 1] = tmp;
                    }
                }
        return array;

    }
}
