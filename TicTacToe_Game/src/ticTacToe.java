import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class ticTacToe extends Main {

    private char[][] board;
    private char playerChar;
    int x, y;
    ArrayList<Character> diagonalCheck = new ArrayList<>();
    char first = diagonalCheck.get(0);


    public ticTacToe() {
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
                userInputY = inputX.nextInt();

                if (userInputX - 1 >= 0 && userInputX - 1 <= 2 && userInputY - 1 >= 0 && userInputY - 1 <= 2) {

                    userInputs.add(userInputX);
                    userInputs.add(userInputY);
                    corr = true;
                } else {

                    System.out.println("Kurva hülye vagy, hogy két kibaszott koordinátát nem tudsz megadni bazdmeg!4!!4NÉGY(ANYÁD)");
                    corr = false;
                }

            } catch (Exception e) {

                System.out.println("Kurva hülye vagy, hogy két kibaszott koordinátát nem tudsz megadni bazdmeg!4!!4NÉGY(ANYÁD)");
                corr = false;

            }


        }

        return userInputs;
    }

    public void placeChar(List<Integer> returnList) {

        try {
            if (board[returnList.get(0) - 1][returnList.get(1) - 1] == ' ') {
                board[returnList.get(0) - 1][returnList.get(1) - 1] = playerChar;
            }
        } catch (ArrayIndexOutOfBoundsException ei) {

            userInputs();
        }
    }

    public char winCheck() {
        char notWin = 'a';

        for (char[] row : board) {
            if (row[0] != ' ' && row[0] == row[1] && row[1] == row[2]) {
                return row[0];
            }
        }

        for (int i = 0; i < 3; ) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != ' ' && board[i][j] == board[i][j] && board[i][j] == board[i][j]) {
                    return board[i][j];
                }
            }
            i++;
        }

        for (int i = 0; i < 3; i++) {
            diagonalCheck.add(board[i][i]);
        }

        for (int i = 1; i < 3; i++) {
            if (diagonalCheck.get(i) != ' ' && diagonalCheck.get(i) == first) {
                return first;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                diagonalCheck.add(board[i][i]);
            }
        }
        for (int i = 1; i < 3; i++) {
            if (diagonalCheck.get(i) != ' ' && diagonalCheck.get(i) == first) {
                return first;
            }

        }
        return notWin;
    }
}






