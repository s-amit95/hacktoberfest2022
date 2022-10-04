package Backtracking;

public class KnightsTour {

    // Given an N*N board with the Knight placed on a block(or the first block) of an empty board.
    // Moving according to the rules of chess knight must visit each square exactly once.
    // Print the order of each cell in which they are visited.
    static void knightsTour(int[][] chess, int row, int col, int move) {
        if (row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0) {
            return;
        } else if (move == chess.length * chess.length) {
            chess[row][col] = move;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }

        chess[row][col] = move;
        knightsTour(chess, row - 2, col + 1, move + 1);
        knightsTour(chess, row - 1, col + 2, move + 1);
        knightsTour(chess, row + 1, col + 2, move + 1);
        knightsTour(chess, row + 2, col + 1, move + 1);
        knightsTour(chess, row + 2, col - 1, move + 1);
        knightsTour(chess, row + 1, col - 2, move + 1);
        knightsTour(chess, row - 1, col - 2, move + 1);
        knightsTour(chess, row - 2, col - 1, move + 1);
        chess[row][col] = 0;
    }

    static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int row = 0, col = 0;  // where knight will be placed initially (it can be anywhere on the board)
        int[][] chess = new int[n][n];
        knightsTour(chess, row, col, 1);
    }

}
