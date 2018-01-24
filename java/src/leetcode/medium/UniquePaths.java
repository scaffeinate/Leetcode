public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        return uniquePaths(0, 0, m, n, memo);
    }
    
    private int uniquePaths(int row, int column, int m, int n, int[][] memo) {
        if(row < 0 || row >= m || column < 0 || column >= n) {
            return 0;
        } else if(row == m - 1 && column == n - 1) {
            return 1;
        } else if(memo[row][column] == -1) {
            memo[row][column] = uniquePaths(row, column + 1, m, n, memo) + uniquePaths(row + 1, column, m, n, memo);
        }
        
        return memo[row][column];
    }
}
