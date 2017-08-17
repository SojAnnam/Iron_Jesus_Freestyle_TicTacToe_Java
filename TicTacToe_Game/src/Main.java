import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        tictactoe tic = new tictactoe();

        while (tic.boardIsFull != true) {

            tic.printBoard();
            System.out.println(tic.boardFull());
            List returnList = tic.userInputs();
            tic.placeChar(returnList);
            System.out.println(tic.playerChar);
            tic.boardFull();
        }

        if (tic.boardIsFull = true) {

            System.out.println("The match ends in a draw!");
        }

    }
}
