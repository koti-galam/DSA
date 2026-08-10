class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return ways(m - 1, n - 1, dp);
    }

    int ways(int rows, int cols, int[][] dp) {
        // First row or first column
        if (rows == 0 || cols == 0) {
            return 1;
        }

        // Already calculated
        if (dp[rows][cols] != 0) {
            return dp[rows][cols];
        }

        // Move up + move left
        dp[rows][cols] =
            ways(rows - 1, cols, dp) +
            ways(rows, cols - 1, dp);

        return dp[rows][cols];
    }
}