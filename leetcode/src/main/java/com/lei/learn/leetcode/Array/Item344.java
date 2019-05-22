package com.lei.learn.leetcode.Array;

import java.util.Arrays;

public class Item344 {

    public static void reverseString(char[] s) {

        if (s.length == 0)
            return;
        int low = 0, high = s.length - 1;
        while (low < high) {
            char tmp = s[low];
            s[low] = s[high];
            s[high] = tmp;
            low++;
            high--;
        }

    }


    public static void main(String[] args) {
        char[] s = new char[]{'a','b'};
        reverseString(s);
        System.out.println(Arrays.toString(s));

    }
}
