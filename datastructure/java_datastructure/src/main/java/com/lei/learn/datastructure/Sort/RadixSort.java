package com.lei.learn.datastructure.Sort;

import java.util.Arrays;

public class RadixSort {
    //    15,25,105,78,34,21,32,41,1001,9876,34654;
    public static void main(String[] args) {

        int[] tmp = new int[]{34654, 15, 25, 105, 78, 34, 21, 32, 41, 1001, 9876};

        System.out.println(Arrays.toString(tmp));
        radixSort(tmp);
        System.out.println(Arrays.toString(tmp));

    }

    /*
    Find the max of the array
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;

    }


    public static void radixSort(int[] array) {
        //获取数组最大值，10^位数
        double d = Math.pow(10, String.valueOf(getMax(array)).length());
        //标记，做循环用
        int k = 1;
        //二维数组，存储排序时候的临时数字
        int[][] bucket = new int[10][array.length];
//记录不同桶里边的数字个数
        int[] count = new int[10];
//多次排序
        while (k < d) {
            for (int element : array) {
                int tmp = (element / k) % 10;
                bucket[tmp][count[tmp]] = element;
                count[tmp]++;
            }

            int tmpIndex = 0;
            int indexArray = 0;
            while (tmpIndex < 10) {
                if (count[tmpIndex] != 0) {
                    for (int j = 0; j < count[tmpIndex]; j++) {
                        array[indexArray++] = bucket[tmpIndex][j];
                    }
                    count[tmpIndex] = 0;
                }
                tmpIndex++;
            }
            k = k * 10;
        }


    }
}
