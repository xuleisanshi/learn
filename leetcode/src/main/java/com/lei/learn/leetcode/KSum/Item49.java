package com.lei.learn.leetcode.KSum;

import java.util.*;

public class Item49 {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String string = Arrays.toString(chars);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList<>());
            }
            map.get(string).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

}
