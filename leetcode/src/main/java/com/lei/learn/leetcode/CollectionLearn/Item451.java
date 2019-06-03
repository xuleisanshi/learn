package com.lei.learn.leetcode.CollectionLearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item451 {
    public static String frequencySort(String s) {
        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            max = Math.max(max, map.get(c));
        }

        List<Character>[] array = new List[max + 1];
        for (Character c : map.keySet()) {
            int count = map.get(c);
            if (array[count] == null) {
                array[count] = new ArrayList();
            }

            array[count].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i > 0; i--) {
            List<Character> list = array[i];
            if (list != null) {
                for (Character c : list) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aAbb";
        System.out.println(frequencySort(s));
    }
}
