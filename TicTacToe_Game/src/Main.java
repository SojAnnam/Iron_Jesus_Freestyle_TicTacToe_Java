import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ticTacToe tic = new ticTacToe();

        boolean isFull = false;
        boolean isWin = false;
        String again = "y";

        while (again == "y") {

            System.out.println("Welcome to TicTacToe! Let's start the game!");

            while (isFull != true && isWin != true) {

                tic.markCheck.clear();
                tic.printBoard();
                List returnList = tic.userInputs();
                tic.placeChar(returnList);
                isFull = tic.boardFull();
                isWin = tic.winCheck();
                System.out.println(again);


            }

            if (isWin) {

                tic.printBoard();
                if (tic.playerChar == 'o') {
                    System.out.println("Player One won.");
                    again = tic.nextGame();

                } else if (tic.playerChar == 'x') {
                    System.out.println("Player Two won.");
                    again = tic.nextGame();

                }


            }

            if (tic.boardIsFull == true) {
                tic.printBoard();
                System.out.println("The match ends in a draw!");
                again = tic.nextGame();
            }
        }
    }
}
