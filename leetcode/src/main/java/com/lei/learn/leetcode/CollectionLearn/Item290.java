package com.lei.learn.leetcode.CollectionLearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Item290 {

    public static boolean wordPattern(String pattern, String str) {

        boolean result = true;

        String[] strs = str.split(" ");
        char[] patterns = pattern.toCharArray();
        if (strs.length != patterns.length) {
            return false;
        }

        Map map = new HashMap<>();
        for (int i = 0; i < strs.length; ++i) {
            if (!Objects.equals(map.put(pattern.charAt(i), i),
                    map.put(strs[i], i))) {
                result = false;
                break;
            }
        }
        return result;


    }


    public static void main(String[] args) {
        String pattern = "abba", str = "dog1 cat cat dog";
        System.out.println(wordPattern(pattern, str));

    }


}
