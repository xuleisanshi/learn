package com.lei.learn.leetcode.CollectionLearn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Item205 {


    //TODO O(n)
    public static boolean isIsomorphicOn(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        return false;
    }

    public static boolean isIsomorphic(String s, String t) {

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (map.get(chars[i]) != null) {
                if (map.get(chars[i]) != chart[i]) {
                    result = false;
                    break;
                }
            } else {
                if (!map.containsValue(chart[i])) map.put(chars[i], chart[i]);
                else return false;
            }

        }
        return result;

    }


    public static void main(String[] args) {

        String s = "ab";
        String t = "cc";

        System.out.println(isIsomorphic(s, t));

    }

}
