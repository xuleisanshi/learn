package com.lei.learn.leetcode.Recursion.BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Item131 {

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s.length() == 0) {
            return res;
        }
        backTrack(s, res, new ArrayList<>());

        return res;

    }

    public void backTrack(String s, List<List<String>> res, List<String> tmp) {
        if (s == null || s.length() == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (!ispalindrome(s.substring(0, i))) continue;
            tmp.add((s.substring(0, i)));
            backTrack(s.substring(i, s.length()), res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }


    boolean ispalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
}
