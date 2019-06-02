package com.lei.learn.leetcode.CollectionLearn;

import java.util.HashMap;
import java.util.Map;

public class Item242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        boolean result = true;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        for (int j = 0; j < chart.length; j++) {
            if (!map.containsKey(chart[j]) || map.get(chart[j]) < 1) {
                result = false;
                break;
            } else {
                map.put(chart[j], map.get(chart[j]) - 1);
            }
        }
        return result;
    }


    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        int[] count = new int[26];

        for (int i = 0; i < chars.length; i++) {
            count[chars[i] - 'a']++;
            count[chart[i] - 'a']--;
        }

        boolean result = true;

        for (int i : count) {
            if (i != 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        System.out.println(isAnagram1(s, t));

    }


}
