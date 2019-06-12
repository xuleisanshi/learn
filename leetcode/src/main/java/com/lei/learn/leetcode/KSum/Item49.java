package com.lei.learn.leetcode.KSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item49 {
  public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> lists = new ArrayList<>();

    Map<Integer, Map<Character, Integer>> map = new HashMap<>();
    for (int i = 0; i < strs.length; i++) {
      Map<Character, Integer> tmp = new HashMap<>();
      for (int j = 0; j < strs[i].length(); j++) {
        tmp.put(strs[i].charAt(j), tmp.getOrDefault(strs[i].charAt(j), 0) + 1);
      }
      map.put(i, tmp);
    }
    return null;
  }
}
