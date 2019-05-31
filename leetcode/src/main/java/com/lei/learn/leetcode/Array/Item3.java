package com.lei.learn.leetcode.Array;

/**
 * two pointer
 */
public class Item3 {

  public static int lengthOfLongestSubstring(String s) {

    int result = 1;
    if (s.length() == 0) {
      return 0;
    }

    char[] chars = s.toCharArray();
    int right = 0;

    return result;
  }

  public static void main(String[] args) {
    String s = "abcabcbb";
    System.out.println(lengthOfLongestSubstring(s));
  }
}
