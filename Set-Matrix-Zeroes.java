class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                int element = matrix[i][j];
                if (element == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int r: rows) {
            for(int j=0;j<matrix[r].length;j++) {
                matrix[r][j] = 0;
            }
        }
    
        for(int j: cols) {
            for(int i=0;i<matrix.length;i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
