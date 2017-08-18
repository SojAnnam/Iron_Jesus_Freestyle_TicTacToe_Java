
import java.util.List;


public class Main {

    public static void main(String[] args) {

        ticTacToe tic = new ticTacToe();
        boolean isNewGame = true;

        while (isNewGame) {
            System.out.flush();
            boolean isFull = false;
            boolean isWin = false;
            tic.playerChar = 'x';
            tic.emptyBoardTable();
            tic.gameChange();
            tic.getNames();
            System.out.println("Welcome to TicTacToe! Let's start the game!");


            while (isFull != true && isWin != true) {
                System.out.flush();
                tic.markCheck.clear();
                tic.printBoard();
                List returnList = tic.userInputs();
                tic.placeChar(returnList);
                isFull = tic.boardFull();
                isWin = tic.winCheck();


            }

            if (isWin) {

                tic.printBoard();
                if (tic.playerChar == 'o' || tic.playerChar =='7') {
                    System.out.println(tic.names.get(0) + " won.");
                    tic.emptyBoardTable();
                    isNewGame = tic.nextGame();

                } else if (tic.playerChar == 'x' || tic.playerChar == '6') {
                    System.out.println(tic.names.get(1) + " won.");
                    tic.emptyBoardTable();
                    isNewGame = tic.nextGame();

                }


            }

            if (isFull && !isWin) {
                tic.printBoard();
                System.out.println("The match ends in a draw!");
                isNewGame = tic.nextGame();
            }
        }
    }
}
