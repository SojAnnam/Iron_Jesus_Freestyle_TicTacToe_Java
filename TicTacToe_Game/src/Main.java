public class Main {

    public static void main(String[] args){

        tictactoe tic = new tictactoe();

        tic.printBoard();
        System.out.println(tic.boardFull());
        int[] ret = tic.userInput();
        tic.placeChar(ret[0] ,ret[1]);
        tic.printBoard();

    }
}
