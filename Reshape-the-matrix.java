class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) return mat;
        
        int[][] res = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = mat[row][col++];
                if (col == mat[0].length) {
                    col = 0;
                    row++;
                }
            }
        }

        return res;
    }                                                                                                    
}
