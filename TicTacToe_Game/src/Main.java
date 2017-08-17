import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ticTacToe tic = new ticTacToe();

        boolean isFull = false;
        boolean isWin = false;

        while (isFull != true && isWin != true) {
            tic.markCheck.clear();
            tic.printBoard();
            System.out.println(tic.boardFull());
            List returnList = tic.userInputs();
            tic.placeChar(returnList);
            isFull = tic.boardFull();
            System.out.println("F" + isFull);
            isWin = tic.winCheck();
            System.out.println("W" + isWin);



        }

        if (isWin) {
            tic.printBoard();
            if (tic.playerChar == 'o') {
                System.out.println("Player One won.");
                System.exit(0);
            } else if (tic.playerChar == 'x'){
                System.out.println("Player Two won.");
                System.exit(0);
            }
            System.out.println(tic.winCheck());


        }

        if (tic.boardIsFull == true) {
            tic.printBoard();
            System.out.println("The match ends in a draw!");
        }
    }
}
