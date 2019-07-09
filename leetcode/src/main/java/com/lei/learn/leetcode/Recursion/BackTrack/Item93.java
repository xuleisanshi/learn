package com.lei.learn.leetcode.Recursion.BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Item93 {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return res;
        }
        backTrack(res, s, 1, "");
        return res;
    }

    public void backTrack(List<String> res, String s, int count, String ip) {

        if (count == 4 && isValid(s)) {
            res.add(ip + s);
            return;
        }

        for (int i = 1; i < Math.min(4, s.length()); i++) {
            String cur = s.substring(0, i);
            if (isValid(cur)) {

                backTrack(res, s.substring(i), count + 1, ip + cur + ".");
            }
        }
    }

    public boolean isValid(String s) {
        if (s.charAt(0) == '0') {
            return s.equals("0");
        }
        int num = Integer.parseInt(s);
        return 0 < num && num < 256;
    }
}
