package com.lei.learn.leetcode.DynamicProgramming;

public class Item63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        assert m > 0 || n > 0;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) grid[i][j] = 0;
                else if (i == 0 && j == 0) {
                    grid[i][j] = 1;
                } else if (i == 0) {
                    grid[i][j] = grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] = grid[i - 1][j];
                } else {
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
                }
            }
        }
        return grid[m - 1][n - 1];
    }


    public static void main(String[] args) {
        int[][] a = {{0, 1}, {0, 0}};


        System.out.println(uniquePathsWithObstacles(a));
    }
}
