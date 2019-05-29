package com.lei.learn.leetcode.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * two pointer
 */
public class Item3 {
    public static int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;

        int result = 1;
        int left = 0;
        int right = left + 1;

        while (right < chars.length) {
            if (isTarget(chars, left, right)) {
                result = right - left + 1 > result ? right - left + 1 : result;
                right++;
            } else {
                left++;
                right = left + 1;
            }
        }
        return result;
    }


    public static boolean isTarget(char[] chars, int left, int right) {

        boolean result = true;
        for (int i = left; i < right; i++) {
            for (int j = i + 1; j <= right; j++) {
                if (chars[i] == chars[j]) {
                    result = false;
                    break;
                }
            }
            if (!result) {
                break;
            }
        }
        return result;
    }

    public static int lengthOfLongestSubstringHashSet(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;

    }

    public static void main(String[] args) {


        String s = "qqqq";
//        System.out.println(isTarget(s.toCharArray(), 0, 1));
        System.out.println(lengthOfLongestSubstringHashSet(s));

    }

}
