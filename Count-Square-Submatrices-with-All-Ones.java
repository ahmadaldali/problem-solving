class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];
        int result = 0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if (i==0) {
                    dp[i][j] = matrix[i][j];
                    result += dp[i][j];
                    continue;
                }

                if (j==0) {
                    dp[i][j] = matrix[i][j];
                    result += dp[i][j];
                    continue;
                }

                if (matrix[i][j] == 1) {
                    dp[i][j] = 1+ Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                    result += dp[i][j];
                }
            }
        }
        return result;
    }
}

//Time and space: O(m×n)
