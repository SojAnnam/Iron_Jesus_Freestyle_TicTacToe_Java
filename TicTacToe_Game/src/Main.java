import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ticTacToe tic = new ticTacToe();

        while (tic.boardIsFull != true && tic.winCheck() == 'a') {
            tic.printBoard();
            System.out.println(tic.boardFull());
            System.out.println(tic.winCheck());
            List returnList = tic.userInputs();
            tic.placeChar(returnList);
            System.out.println(tic.playerChar);
            tic.boardFull();


        }

        if (tic.boardIsFull = true && tic.winCheck() != 'a') {


            tic.printBoard();
            if (tic.winCheck() == 'x') {
                System.out.println("Player One won.");
            } else if (tic.winCheck() == 'o'){
                System.out.println("Player Two won.");
            }
            System.out.println(tic.winCheck());
            System.out.println("The match ends in a draw!");

        }
    }
}
