package com.lei.learn.leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * two pointer
 */
public class Item438 {


    //O(n^2)

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length() || s == null)
            return list;
        char[] chars = s.toCharArray();
        char[] charp = p.toCharArray();
        int[] pCount = new int[26];
        for (int i = 0; i < charp.length; i++) {
            pCount[charp[i] - 'a']++;

        }
        for (int j = 0; j < chars.length - charp.length + 1; j++) {
            int left = j, right = left + charp.length;
            int[] sCount = new int[26];
            while (left < right) {
                sCount[chars[left] - 'a']++;
                left++;
            }
            if (Arrays.equals(sCount, pCount)) {
                list.add(j);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        String s = "ababab";
        String p = "ab";
        System.out.println(findAnagrams(s, p).toString());
    }
}
