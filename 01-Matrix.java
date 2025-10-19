class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if (mat[i][j] == 0) {
                    q.add(new int[]{i,j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        while(!q.isEmpty()) {
            int[] cell = q.poll();
            // check neighbour
            int row = cell[0];
            int col = cell[1];

            if(row > 0 && mat[row-1][col] == -1) {
                mat[row-1][col] = 1 + mat[row][col];
                q.add(new int[]{row-1,col});
            }

            if(row < rows-1 && mat[row+1][col] == -1) {
                mat[row+1][col] = 1 + mat[row][col];
                q.add(new int[]{row+1,col});
            }
            
            if(col > 0 && mat[row][col-1] == -1) {
                mat[row][col-1] = 1 + mat[row][col];
                q.add(new int[]{row,col-1});
            }

            if(col < cols-1 && mat[row][col+1] == -1) {
                mat[row][col+1] = 1 + mat[row][col];
                q.add(new int[]{row,col+1});
            }
        }

        return mat;
    }
}
