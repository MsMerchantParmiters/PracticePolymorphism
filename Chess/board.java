package Chess;

public class board {
    private piece [][] board = new piece[8][8];

    public void printBoard(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
