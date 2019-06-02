package com.lei.learn.leetcode.CollectionLearn;

import java.util.ArrayList;
import java.util.List;

public class Item202 {


    //TODO 快慢指针


    public static boolean isHappy(int n) {
        boolean result = true;
        int sum = n;
        List<Integer> list = new ArrayList<>();
        list.add(sum);
        while (sum != 1) {
            sum = getSum(sum);
            if (list.contains(sum)) {
                result = false;
                break;
            }
            list.add(sum);
        }
        return result;
    }

    public static int getSum(int n) {
        int number = n;
        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10) * (number % 10);
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println(isHappy(n));

    }
}
