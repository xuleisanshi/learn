package com.lei.learn.leetcode.Recursion.BackTrack;

public class Item130 {

    private int m, n;

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O')
                    floodFill(board, i, j);
            }

    }

    private void floodFill(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || board[i][j] != 'O') return;
        board[i][j] = 'X';
        floodFill(board, i + 1, j);
        floodFill(board, i - 1, j);
        floodFill(board, i, j + 1);
        floodFill(board, i, j - 1);

    }
}
