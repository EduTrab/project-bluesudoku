package tui;

import model.Game;

import java.util.Scanner;


/**
 * Display the current sudoku game and allow the users
 * do servals operations.
 *
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SudokuGrid {
    /**
     * Display the current sudoku grid and give instructions.
     * 
     * @param tui The game tui used in this grid.
     */
    public void sudokuGrid(Gametui tui) {
        int option;
        SudokuPausa pausaGenerator = new SudokuPausa();
        Game game = tui.getGame();
        SudokuPlay play = new SudokuPlay();
        SudokuPrinter printer = new SudokuPrinter();
        while (true) {
            Scanner in = new Scanner(System.in);
            printer.printGrid(game.getGrid().getCells());
            System.out.println(
                    "to fill the cell insert 1 and press enter\nto check your answer insert 2 and press enter\nto let the AI try to solve the sudoku insert 3 and press enter\nto exit the game insert 4 and press enter");
            try {
                option = Integer.parseInt(in.next());
            } catch (final NumberFormatException exception) {
                continue;
            }

            if (option == 1) {
                play.play(game);
            } else if (option == 2) {
                game.checkWin();
                if (game.getWin().isIfwin()) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Whoops...Try it again.");
                }
                pausaGenerator.pausa(in);
            } else if (option == 3) {
                System.out.println(game.aiResult());
                aiResultRender(game);
            } else if (option == 4) {
                break;
            } else {
                pausaGenerator.pausa(in);
            }
        }
        System.out.println("Good bye");
    }
    
    /**
     * Render the AI Solution of a sudoku game.
     * 
     * @param game The sudoku game solved by the solver.
     */
    private void aiResultRender(Game game) {
        for (int row = 0; row < game.getSolver().getGridSize(); row++) {
            for (int column = 0; column < game.getSolver().getGridSize(); column++) {
                System.out.print(game.getSolver().getSudoku()[row][column]);
            }
            System.out.println();
        }
    }
}
