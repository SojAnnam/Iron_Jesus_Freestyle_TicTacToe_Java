import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class ticTacToe extends Main {

    public char[][] board;
    public char playerChar;
    int x, y;
    boolean boardIsFull;
    boolean game;
    ArrayList<Character> diagonalCheck = new ArrayList<>();

    public ticTacToe() {
        board = new char[3][3];
        playerChar = 'x';
        emptyBoardTable();
        boardIsFull = false;
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


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {

                    boardIsFull = false;
                    return boardIsFull;

                }
            }

            boardIsFull = true;
        }

        return boardIsFull;
    }


    public ArrayList<Integer> userInputs() {

        boolean corr = false;
        ArrayList<Integer> userInputs = new ArrayList<>();
        userInputs.clear();
        int userInputX = 0;
        int userInputY = 0;

        while (corr != true) {
            System.out.println("Please, provide the x and y coordinates: ");
            Scanner inputX = new Scanner(System.in);
            Scanner inputY = new Scanner(System.in);
            try {

                userInputX = inputX.nextInt();
                userInputY = inputY.nextInt();

                if (userInputX - 1 >= 0 && userInputX - 1 <= 2 && userInputY - 1 >= 0 && userInputY - 1 <= 2) {

                    userInputs.add(userInputX);
                    userInputs.add(userInputY);
                    corr = true;
                } else {

                    System.out.println("Please provide two NUMBERS between 1 and 3!");
                    corr = false;
                }


            } catch (Exception e) {

                System.out.println("Please provide two NUMBERS between 1 and 3!");
                corr = false;

            }


        }

        return userInputs;
    }


    public char placeChar(List<Integer> returnList) {

        try {
            if (board[returnList.get(0) - 1][returnList.get(1) - 1] == ' ') {
                board[returnList.get(0) - 1][returnList.get(1) - 1] = playerChar;
            }

        } catch (ArrayIndexOutOfBoundsException ei) {

            userInputs();
        }

        if (playerChar == 'x') {

            playerChar = 'o';

        } else {

            playerChar = 'x';


        }


        return playerChar;

    }

    public boolean winCheck() {
        for (char[] row : board) {
            if (row[0] != ' ' && row[0] == row[1] && row[1] == row[2]) {
                System.out.println("ok");
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[2][i] == board[i][2]) {
                if (board[0][i] != ' ') {
                    System.out.println("ok1");
                    return true;
                }
            }
        }


            for (int i = 0; i < 3; i++) {
                diagonalCheck.add(board[i][i]);
            }


            char first = diagonalCheck.get(0);

            for (int i = 1; i < 3; i++) {
                if (diagonalCheck.get(i) != ' ' && diagonalCheck.get(i) == first) {
                    System.out.println("ok2");
                    return true;
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 2; j >= 0; j--) {
                    diagonalCheck.add(board[i][i]);
                }
            }
            for (int i = 1; i < 3; i++) {
                if (diagonalCheck.get(i) != ' ' && diagonalCheck.get(i) == first) {
                    System.out.println("ok3");
                    return true;
                }

            }
            return false;

    }
}






