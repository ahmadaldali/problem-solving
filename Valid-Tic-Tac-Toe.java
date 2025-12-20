class Solution {
    int countX = 0;
    int countO = 0;

    public boolean validTicTacToe(String[] board) {
        // #x = #o and x not winner
        // #x = #o +1 and o not winner 
        // false

        int wX = 0;
        int wO = 0;

        char[][] boardArr = new char[3][3];

        // horizontal
        for(int i=0;i<3;i++) {
            int tempX = 0;
            int tempO = 0;

            for(int j=0;j<3;j++) {
                char current = board[i].charAt(j);

                boardArr[i][j] = current;

                if (current == 'X') {
                    this.countX++;
                    tempX++;
                }

                if (current == 'O') {
                    this.countO++;
                    tempO++;
                }
            }

            if (tempX == 3) wX++;
            if (tempO == 3) wO++;
        }

        // vertical
        for(int i=0;i<3;i++) {
            int tempX = 0;
            int tempO = 0;

            for(int j=0;j<3;j++) {
                char current = board[j].charAt(i);

                if (current == 'X') {
                    tempX++;
                }

                if (current == 'O') {
                    tempO++;
                }
            }

            if (tempX == 3) wX++;
            if (tempO == 3) wO++;
        }

        // 
        if (boardArr[0][0] == boardArr[1][1] && boardArr[1][1] == boardArr[2][2]) {
            if (boardArr[0][0] == 'X') wX++;
            if (boardArr[0][0] == 'O') wO++;
        }
        if (boardArr[0][2] == boardArr[1][1] && boardArr[1][1] == boardArr[2][0]) {
            if (boardArr[0][2] == 'X') wX++;
            if (boardArr[0][2] == 'O') wO++;
        }


        if (this.countX == this.countO) return wX == 0; // x not winner, o no matter

        if (this.countX == this.countO + 1) return wO == 0; // o not winner, x no matter

        return false;
    }
}
