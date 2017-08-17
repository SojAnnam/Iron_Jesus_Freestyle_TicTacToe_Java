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

            tic.getNames();
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
                    System.out.println(tic.names.get(0) + " won.");
                    again = tic.nextGame();

                } else if (tic.playerChar == 'x') {
                    System.out.println(tic.names.get(1) + " won.");
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
