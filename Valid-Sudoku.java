import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> sodoku = new HashSet<String>();

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                char item = board[i][j];

                if (item == '.') continue;

                boolean isDuplicatedInSameRow = !sodoku.add(String.format("%c in row %d", item, i));
                boolean isDuplicatedInSameCol = !sodoku.add(String.format("%c in col %d", item, j));
                boolean isDuplicatedInSameSubBoard = !sodoku.add(String.format("%c in subboard %d", item, (i / 3) * 3 + (j / 3)));
                if (isDuplicatedInSameRow || isDuplicatedInSameCol || isDuplicatedInSameSubBoard) {
                    return false;
                }
            }
        }

        return true;
    }
}
