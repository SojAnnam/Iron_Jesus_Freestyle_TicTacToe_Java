public class Main {

    public static void main(String[] args){

        tictactoe tic = new tictactoe();

        tic.printBoard();
        System.out.println(tic.boardFull());
        tic.userInput();
        tic.printBoard();

    }
}
