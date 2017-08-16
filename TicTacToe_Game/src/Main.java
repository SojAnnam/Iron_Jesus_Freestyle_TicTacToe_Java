public class Main {

    public static void main(String[] args) {

        tictactoe tic = new tictactoe();

        tic.printBoard();
        System.out.println(tic.boardFull());
        int[] ret = tic.userInputs();
        tic.placeChar(ret[0] - 1, ret[1] - 1);
        tic.printBoard();

    }
}
