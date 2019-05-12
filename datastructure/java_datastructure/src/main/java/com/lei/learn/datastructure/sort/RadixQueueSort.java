package com.lei.learn.datastructure.sort;

import com.lei.learn.datastructure.linearStructue.QueueObject;

import java.util.Arrays;

public class RadixQueueSort {
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
        //queue，存储排序时候的临时数字
        QueueObject[] queueObject = new QueueObject[10];
        for (int i = 0; i < 10; i++) {
            queueObject[i] = new QueueObject();
        }

        //多次排序
        while (k < d) {
            for (int element : array) {
                int tmp = (element / k) % 10;
                queueObject[tmp].add(String.valueOf(element));
            }


            int index = 0;
            for (int j = 0; j < queueObject.length; j++) {
                while (!queueObject[j].isEmpty()) {
                    array[index++] = Integer.parseInt(queueObject[j].poll());
                }
            }

            k = k * 10;
        }


    }
}
