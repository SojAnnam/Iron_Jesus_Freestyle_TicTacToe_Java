import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ticTacToe tic = new ticTacToe();
        tic.diagonalCheck.clear();
        tic.printBoard();
        System.out.println(tic.boardFull());
        List returnList = tic.userInputs();
        tic.placeChar(returnList);
        tic.printBoard();

        if (tic.winCheck() == 'x') {
            System.out.println("Player One won.");
        }
        else if (tic.winCheck() == 'o') {
            System.out.println("Player Two won.");
        }
        


    }
}
