import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class ticTacToe extends Main{

    private char[][] board;
    public char playerChar;
    int x, y;

    String userInput;
    ArrayList<Character> markCheck = new ArrayList<>();

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

    public boolean nextGame() {

        System.out.println("Would you like to play another game (y or n)?");
        Scanner inputString = new Scanner(System.in);
        userInput = inputString.next();
        System.out.println(userInput);
        if (userInput.toLowerCase() == "n") {
            System.out.println("Thank you very much for playing!");
            return false;

        } else {

           return true;

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
                    return false ;
                }
            }
        }

        return  true;
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

                if (userInputX- 1 >= 0 && userInputX - 1 <= 2 && userInputY- 1 >= 0 && userInputY - 1 <= 2) {

                    userInputs.add(userInputX);
                    userInputs.add(userInputY);
                    corr = true;
                }
                else{

                    System.out.println("Please provide two NUMBERS between 1 and 3!");
                    corr = false;
                }


            }

            catch (Exception e) {

                System.out.println("Please provide two NUMBERS between 1 and 3!");
                corr = false;

            }


        }

        return userInputs;
    }


    public char  placeChar(List<Integer> returnList) {

        try {
            if (board[returnList.get(0) - 1][returnList.get(1) - 1] == ' ') {
                board[returnList.get(0) - 1][returnList.get(1) - 1] = playerChar;
                if (playerChar == 'x') {

                    playerChar = 'o';

                } else {

                    playerChar = 'x';


                }
            }

        }

        catch (ArrayIndexOutOfBoundsException ei) {

            System.out.println("Try again, this field already in use! ");
            userInputs();
        }

        return playerChar;

    }
    public boolean winCheck() {
        //checks the rows

        for (char[] row : board) {
            if (row[0] != ' ' && row[0] == row[1] && row[1] == row[2]) {
                return true;
            }
        }

        //adds all nums into an array, and checks diagonals and columns

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                markCheck.add(board[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (markCheck.get(i) == markCheck.get(i+3) && markCheck.get(i+3) == markCheck.get(i+6) && markCheck.get(i) != ' ') {
                return true;
            }
        }

        if (markCheck.get(0) == markCheck.get(4) && markCheck.get(8) == markCheck.get(4) && markCheck.get(0) != ' ') {
            return true;
        }

        if  (markCheck.get(2) == markCheck.get(4) && markCheck.get(6) == markCheck.get(4) && markCheck.get(2) != ' ') {
            return true;
        }

        return false;
    }
}







