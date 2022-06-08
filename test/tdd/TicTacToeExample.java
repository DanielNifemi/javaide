package tdd;

import java.util.*;
public class TicTacToeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] board =
                {
                        {" ", " ", " "},
                        {" ", " ", " "},
                        {" ", " ", " "}
                };
        boolean done = false;
        int player = 1;
        int row = 0;
        int col = 0;
        while (!done) {

                System.out.println("Enter the row and column for your next move");
                row = input.nextInt();
                col = input.nextInt();
                if (player == 1) {
                    board[row][col] = "X";
                    player = 2;
                } else {
                    board[row][col] = "O";
                    player = 1;
                }
                printBoard(board);


            }
            checkForWinner(board);

        }

        public static void printBoard (String[][]board)
        {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    System.out.print("|" + board[row][col] + "|");
                }
            }
            System.out.println();
            System.out.println("-------");
        }

        public static boolean checkForWinner (String[][]board)
        {
            // checkForWinner() method determines if a pattern of data stored
            // in the char array indicates the player has won the game.

            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag4 = false;

            // checks the contents of each row for matching data
            for (int i = 0; i <= 2; i++) {
                if ((board[i][0] == board[i][1] && board[i][1] == board[i][2]) && board[i][2] != "")
                    flag1 = true;
            }

            // checks the contents of each column for matching data
            for (int j = 0; j <= 2; j++) {
                if ((board[0][j] == board[1][j] && board[1][j] == board[2][j]) && board[2][j] != " ")
                    flag2 = true;
            }

            // checks the contents of one diagonal for matching data
            if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) && board[2][2] != " ")
                flag3 = true;

            // checks the contents of the other diagonal for matching data
            if ((board[0][2] == board[1][1] && board[1][1] == board[2][0]) && board[2][0] != " ")
                flag4 = true;

            // checks if any of the previous conditions evaluated to true
            if (flag1 == true || flag2 == true || flag3 == true || flag4 == true)
                flag = true;
            // returns true if a winner was found; returns false is no winner
            return flag;
        }
        // end of checkForWinner method
    }

