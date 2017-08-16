import java.util.Scanner;
import java.util.ArrayList;

public class tictactoe extends Main{

    private char[][] board;
    private char playerChar;
    int x, y;

    public tictactoe() {
        board = new char[3][3];
        playerChar = 'x';
        emptyBoardTable();
    }

    public void emptyBoardTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';

            }
        }
    }

    public void printBoard() {

        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {

            System.out.print("| ");

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " | ");
            }

            System.out.println();
            System.out.println("-------------");


        }
    }

    public boolean boardFull() {
        boolean boardIsFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    boardIsFull = false;

                }
            }


        }
        return  boardIsFull;
    }
    public int[] userInput() {

        System.out.println("Please, provide the x coordinate: ");
        Scanner userInputx = new Scanner(System.in);
        int x = userInputx.nextInt();

        if (x - 1 >= 0 && x - 1 <= 2) {

            System.out.println("Please, provide the y coordinate: ");
            Scanner userInputy = new Scanner(System.in);
            int y = userInputy.nextInt();


            if (y - 1 >= 0 && y - 1 <= 2) {

                return new int[]{x-1,y-1};
                //jelenítse meg a playerMarkkal a táblát

            } else {

                userInput();

            }

        } else {
            userInput();
        }
        return new int[]{x-1,y-1};
    }
    /*public int[] userInput() {
        try {
            System.out.println("Please, provide the x coordinate: ");
            Scanner userInputx = new Scanner(System.in);
            int y = userInputx.nextInt();

            if (y - 1 >= 0 && y - 1 <= 2) {

                return new int[]{y - 1};
            }
        } catch (){

        }
    }*/


    public void placeChar(int row, int col) {
        if (board[row][col] == ' ') {
            board[row][col] = playerChar ;
        }


        //return board[x][y];

    }

    /*
    public boolean playerTurn(int x, int y) {
        if (x> 0)

    }
    */
}




