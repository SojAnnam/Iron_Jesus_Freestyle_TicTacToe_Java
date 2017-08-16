import java.util.InputMismatchException;
import java.util.List;
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
    public ArrayList<Integer> userInputs() {

        boolean corr = false;
        ArrayList<Integer> userInputs = new ArrayList<>();
        userInputs.clear();
        int userInputX = 0;
        int userInputY = 0;

        while (corr = true) {
            System.out.println("Please, provide the x and y coordinates: ");
            Scanner inputX = new Scanner(System.in);
            Scanner inputY = new Scanner(System.in);
            try {

                userInputX = inputX.nextInt();
                userInputY = inputX.nextInt();
                if (userInputX- 1 >= 0 && userInputX - 1 <= 2 && userInputY- 1 >= 0 && userInputY - 1 <= 2) {
                    userInputs.add(userInputX);
                    userInputs.add(userInputY);
                    corr = true;
                }
                else{
                    corr = false;
                }

                    /*else {

                        System.out.println("Kurwa hülye vagy, hogy két kibaszott koordinátát nem tudsz megadni bazdmeg!4!!4NÉGY(ANYÁD)");
                        corr = false;
                    } */
            }
            /*catch (InputMismatchException ime) {

                System.out.println("Kurwa hülye vagy, hogy két kibaszott koordinátát nem tudsz megadni bazdmeg!4!!4NÉGY(ANYÁD)");
                corr = false;

            }*/
            catch (Exception e) {

                System.out.println("Kurwa hülye vagy, hogy két kibaszott koordinátát nem tudsz megadni bazdmeg!4!!4NÉGY(ANYÁD)");
                corr = false;

            }


        }

        return userInputs;
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


    public void  placeChar(List<Integer> returnList) {

        try {
            if (board[returnList.get(0)-1][returnList.get(1)-1] == ' ') {
                board[returnList.get(0)-1][returnList.get(1)-1] = playerChar;
            }
        }

        catch (ArrayIndexOutOfBoundsException ei) {

                userInputs();
            }
        }


        //return board[x][y];

    }

    /*
    public boolean playerTurn(int x, int y) {
        if (x> 0)

    }
    */





