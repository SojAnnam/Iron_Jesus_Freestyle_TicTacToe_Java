import java.util.Scanner;


public class tictactoe extends Main{

    private char[][] board;
    private char playerMark;

    public tictactoe() {
        board = new char[3][3];
        playerMark = 'x';
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
    public static int userInput(){
        System.out.println("Please, provide the x coordinate: ");
        Scanner userInputx = new Scanner(System.in);
        int x = userInputx.nextInt();
        System.out.println("Please, provide the y coordinate: ");
        Scanner userInputy = new Scanner(System.in);
        int y = userInputy.nextInt();

        r
    }

}




