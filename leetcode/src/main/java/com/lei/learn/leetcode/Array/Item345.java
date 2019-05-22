package com.lei.learn.leetcode.Array;

import java.util.Arrays;

public class Item345 {

    public static String reverseVowels(String s) {

        if (s.length() <= 1) return s;

        int low = 0, high = s.length() - 1;
        char[] chars = s.toCharArray();

        while (low < high) {
            if (!isVowel(chars[low])) {
                low++;
                continue;
            }
            if (!isVowel(chars[high])) {
                high--;
                continue;
            }

            char tmp = chars[low];
            chars[low] = chars[high];
            chars[high] = tmp;
            low++;
            high--;

        }
        return String.valueOf(chars);


    }

    public static boolean isVowel(char target) {

        boolean result;
        switch (Character.toLowerCase(target)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = true;
                break;
            default:
                result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "hello";

        System.out.println(reverseVowels(s));
    }
}
