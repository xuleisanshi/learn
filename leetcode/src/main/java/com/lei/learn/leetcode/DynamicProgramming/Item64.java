package com.lei.learn.leetcode.DynamicProgramming;

import cucumber.api.java.it.Ma;

public class Item64 {

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] mem = new int[m][n];
        assert m > 0 && n > 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) mem[i][j] = grid[i][j];
                else if (i == 0 && j > 0) mem[i][j] = mem[i][j - 1] + grid[i][j];
                else if (j == 0 && i > 0) mem[i][j] = mem[i - 1][j] + grid[i][j];
                else mem[i][j] = Math.min(mem[i][j - 1], mem[i - 1][j]) + grid[i][j];
            }
        }


        return mem[m - 1][n - 1];
    }

    public static void main(String[] args) {

    }
}
