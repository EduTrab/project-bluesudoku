package tui;

import model.Cell;
import model.Game;
import model.EasyGame;
import model.MediumGame;
import model.HardGame;
import model.DIYGame;
import model.SudokuSolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a description of class gametui here.
 *
 * @author trabae@usi.ch
 * @author trabae@usi.ch
 * @version 2020.05.29
 */
public class Gametui {
    private Game game;
    private SudokuPrinter printer;
    private SudokuPausa pausaGenerator;
    private SudokuGrid grid;
    
    /**
     * Accessor method to get the Game of this Gametui.
     */
    public Game getGame() {
        return this.game;
    }
    
    /**
     * Display the difficulty selection interface.
     * 
     */
    public void chooseDifficulty() {
        int option;
        this.pausaGenerator = new SudokuPausa();
        this.grid = new SudokuGrid();
        this.printer = new SudokuPrinter();

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println(
                    "to play the easy level sudoku insert 1 and press enter\nto play the medium level sudoku insert 2 and press enter\nto play the hard level sudoku insert 3 and press enter\nto make a DIY sudoku insert 4 and press enter\nto exit the game insert 5 and press enter");

            try {
                option = Integer.parseInt(in.next());
            } catch (Exception exception) {
                continue;
            }

            if (option == 1) {
                this.game = new EasyGame();
                ((EasyGame)game).initialize();
                grid.sudokuGrid(this);
            } else if (option == 2) {
                this.game = new MediumGame();
                ((MediumGame)game).initialize();
                grid.sudokuGrid(this);
            } else if (option == 3) {
                this.game = new HardGame();
                ((HardGame)game).initialize();
                grid.sudokuGrid(this);
            } else if (option == 4) {
                this.game = new DIYGame();
                ((DIYGame)game).initialize();
                grid.sudokuGrid(this);
            } else if (option == 5) {
                break;
            } else {
                pausaGenerator.pausa(in);
            }
        }
        System.out.println("Good bye");
    }
        
}
