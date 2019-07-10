package com.lei.learn.leetcode.Recursion.BackTrack;

public class Item79 {
    private static int d[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    private static int m, n;//m表示y轴，n表示x轴
    private static boolean[][] visited;

    public static boolean exist(char[][] board, String word) {
        boolean result = false;
        if (board == null || word == null) return result;

        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (backTrack(word, board, i, j, 0))
                    return true;
            }
        return false;
    }

    public static boolean isInBoard(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static boolean backTrack(String word, char[][] board, int x, int y, int index) {
        if (index == word.length() - 1) {
            return word.charAt(index) == (board[x][y]);
        } else {
            if (word.charAt(index) == board[x][y]) {
                visited[x][y] = true;
                for (int i = 0; i < 4; i++) {
                    int newx = x + d[i][0];
                    int newy = y + d[i][1];
                    if (isInBoard(newx, newy) && !visited[newx][newy] && backTrack(word, board, newx, newy, index + 1))
                        return true;
                }
                visited[x][y] = false;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};

        System.out.println(exist(board, "ABFC"));
    }

}