package com.lei.learn.leetcode.Contest;

import java.util.HashMap;

public class Item5048 {

    public static int countCharacters(String[] words, String chars) {

        int result = 0;
        if (chars.length() == 0 || words.length == 0) return result;
        HashMap<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            m.put(chars.charAt(i), m.getOrDefault(chars.charAt(i), 0) + 1);
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0 && contain(m, words[i]) && words[i].length() <= chars.length()) {
                result = result + words[i].length();
            }
        }
        return result;
    }


    private static boolean contain(HashMap<Character, Integer> m1, String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        m.putAll(m1);
        for (int i = 0; i < s.length(); i++) {
            if (m.get(s.charAt(i)) != null && m.get(s.charAt(i)) > 0) {
                m.put(s.charAt(i), m.get(s.charAt(i)) - 1);
                continue;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));

    }
}
