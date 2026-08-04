import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize the board with empty spaces '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        backtrack(0, n, board, res);
        return res;
    }

    // Manually scan upward directions to check safety
    private boolean isSafe(int r, int c, int n, char[][] board) {
        // 1. Check straight up
        for (int i = 0; i < r; i++) {
            if (board[i][c] == 'Q') {
                return false;
            }
        }

        // 2. Check upper-left diagonal
        int i = r - 1, j = c - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }

        // 3. Check upper-right diagonal
        i = r - 1;
        j = c + 1;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    private void backtrack(int r, int n, char[][] board, List<List<String>> res) {
        if (r == n) {
            // Convert the char array to the required List<String> format
            List<String> currentBoard = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                currentBoard.add(new String(board[i]));
            }
            res.add(currentBoard);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (isSafe(r, c, n, board)) {
                board[r][c] = 'Q';               // Place queen
                backtrack(r + 1, n, board, res); // Move to next row
                board[r][c] = '.';               // Undo choice (backtrack)
            }
        }
    }
}
