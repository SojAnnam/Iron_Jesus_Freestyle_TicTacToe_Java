import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ticTacToe tic = new ticTacToe();

        while (tic.game != true) {
            tic.diagonalCheck.clear();
            tic.printBoard();
            System.out.println(tic.boardFull());
            System.out.println(tic.winCheck());
            List returnList = tic.userInputs();
            tic.placeChar(returnList);
            System.out.println(tic.playerChar);
            tic.boardFull();
            if (tic.winCheck() == true) {
                tic.printBoard();
                if (tic.playerChar == 'x') {
                    System.out.println("Player One won.");
                    tic.game = false;
                } else if (tic.playerChar == 'o') {
                    System.out.println("Player Two won.");
                    tic.game = false;
                }
                System.out.println(tic.winCheck());
            }

            if (tic.boardIsFull = true) {

                tic.printBoard();
                System.out.println("The match ends in a draw!");
            }
        }
    }
}
