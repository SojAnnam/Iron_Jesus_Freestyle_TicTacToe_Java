import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ticTacToe tic = new ticTacToe();

        while (tic.boardIsFull != true) {
            tic.printBoard();
            System.out.println(tic.boardFull());
            List returnList = tic.userInputs();
            tic.placeChar(returnList);
            System.out.println(tic.playerChar);
            tic.boardFull();
            if (tic.winCheck() == 'x') {
                System.out.println("Player One won.");
            } else if (tic.winCheck() == 'o'){
                System.out.println("Player Two won.");
            }
        }

        if (tic.boardIsFull = true) {

            System.out.println("The match ends in a draw!");
        }
    }
}
