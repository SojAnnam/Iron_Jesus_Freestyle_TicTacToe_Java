import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ticTacToe tic = new ticTacToe();

        while (tic.game != true) {
            tic.markCheck.clear();
            tic.printBoard();
            System.out.println(tic.boardFull());
            System.out.println(tic.winCheck());
            List returnList = tic.userInputs();
            tic.placeChar(returnList);
            System.out.println(tic.playerChar);
            tic.boardFull();
            if (tic.winCheck() == true) {
                tic.printBoard();
                if (tic.playerChar == 'o') {
                    System.out.println("Player One won.");
                    System.exit(0);
                } else if (tic.playerChar == 'x') {
                    System.out.println("Player Two won.");
                    System.exit(0);
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
