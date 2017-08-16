import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        tictactoe tic = new tictactoe();

        tic.printBoard();
        System.out.println(tic.boardFull());
        List returnList = tic.userInputs();
        tic.placeChar(returnList);
        tic.printBoard();

    }
}
