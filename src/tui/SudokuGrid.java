package tui;
import java.util.Scanner;
import model.*;


/**
 * Display the current sudoku game and allow the users
 * do servals operations.
 *
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SudokuGrid
{
   
    /**
     * Constructor for objects of class SudokuGrid
     */
    public SudokuGrid()
    {
    }

    /**
     * Display the current sudoku grid and give instructions.
     */
    public void sudokuGrid(Gametui tui) {
        int option;
        SudokuPausa pausaGenerator = new SudokuPausa();
        Game game = tui.getGame();
        SudokuPlay play = new SudokuPlay();
        SudokuPrinter printer = new SudokuPrinter();
        while(true) {
            Scanner in = new Scanner(System.in);
            printer.printGrid(game.getGrid().getCells());
            System.out.println(
                    "to fill the cell insert 1 and press enter\nto check your answer insert 2 and press enter\nto let the AI try to solve the sudoku insert 3 and press enter\nto exit the game insert 4 and press enter");
            try {
                option = Integer.parseInt(in.next());
            } catch (Exception exception) {
                continue;
            }
            
            if (option == 1) {
                play.play(game);
            } else if (option == 2) {
                game.checkWin();
                if (game.getWin().isIfwin() == true) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Whoops...Try it again.");
                }
                pausaGenerator.pausa(in);
            } else if (option == 3) {
                System.out.println(game.AIResult());
                for (int row = 0; row < game.getSolver().getGridSize(); row++) {
                     for (int column = 0; column < game.getSolver().getGridSize(); column++) {
                         System.out.print(game.getSolver().getSudoku()[row][column]);
                     }
                     System.out.println();
                }
            } else if (option == 4) {
                break;
            } else {
                pausaGenerator.pausa(in);
            }
        }
        System.out.println("Good bye");
    }
}
