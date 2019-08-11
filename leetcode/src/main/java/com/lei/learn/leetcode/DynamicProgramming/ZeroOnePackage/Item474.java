package com.lei.learn.leetcode.DynamicProgramming.ZeroOnePackage;

public class Item474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] res = new int[m + 1][n + 1];
        for (String str : strs) {
            int[] count = count(str);
            for (int i=m;i>=count[0];i--){
                for (int j=n;j>=count[1];j--){
                    res[i][j]=Math.max(1 + res[i-count[0]][j-count[1]], res[i][j]);
                }
            }
        }

        return res[m][n];

    }

    public int[] count(String str) {
        int[] res = new int[2];
        for (int i = 0; i < str.length(); i++)
            res[str.charAt(i) - '0']++;
        return res;
    }
}
