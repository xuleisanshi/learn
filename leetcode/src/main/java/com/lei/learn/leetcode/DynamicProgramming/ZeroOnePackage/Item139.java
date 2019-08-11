package com.lei.learn.leetcode.DynamicProgramming.ZeroOnePackage;

import java.util.List;

public class Item139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;

        for (int i = 1; i < res.length; i++) {
            for (int j = 0; j < i; j++) {
                if (res[j] && wordDict.contains(s.substring(j, i))) {
                    res[i] = true;
                    break;
                }
            }

        }
        return res[s.length()];
    }
}
