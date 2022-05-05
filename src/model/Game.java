package model;

import java.util.ArrayList;

/**
 * The main class of the sudoku game, which the player directly interact with.
 *
 * @author Chengjiang He
 * @version 2022.04.28
 */
public class Game {
    // instance variables - replace the example below with your own
    private Grid grid;
    private AllWin win;

    /**
     * Constructor for objects of class Game
     */
    public Game() {
        this.grid = new Grid();
        this.win = new AllWin();
    }

    // TODO: An algorithm to randomly generate the values
    // Now we just give a determined Sudoku
    
    /**
     * Generate an empty grid the fill some cells to generate a determined Sudoku
     */
    public void initialize(){
        ArrayList<Cell> Cells = this.grid.getCells();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int current = i * 9 + j;
                Cells.add(current, new Cell(j+1, i+1));
            }
        }
        Cells.get(1).changeValue(3);
        Cells.get(2).changeValue(2);
        Cells.get(3).changeValue(1);
        Cells.get(4).changeValue(5);
        Cells.get(11).changeValue(5);
        Cells.get(15).changeValue(2);
        Cells.get(17).changeValue(8);
        Cells.get(18).changeValue(1);
        Cells.get(19).changeValue(9);
        Cells.get(21).changeValue(2);
        Cells.get(23).changeValue(4);
        Cells.get(24).changeValue(7);
        Cells.get(26).changeValue(3);
        Cells.get(27).changeValue(2);
        Cells.get(28).changeValue(5);
        Cells.get(29).changeValue(7);
        Cells.get(31).changeValue(3);
        Cells.get(33).changeValue(6);
        Cells.get(34).changeValue(4);
        Cells.get(36).changeValue(9);
        Cells.get(37).changeValue(8);
        Cells.get(40).changeValue(7);
        Cells.get(44).changeValue(1);
        Cells.get(45).changeValue(6);
        Cells.get(50).changeValue(9);
        Cells.get(51).changeValue(8);
        Cells.get(52).changeValue(2);
        Cells.get(53).changeValue(7);
        Cells.get(54).changeValue(3);
        Cells.get(55).changeValue(7);
        Cells.get(56).changeValue(8);
        Cells.get(60).changeValue(9);
        Cells.get(63).changeValue(4);
        Cells.get(64).changeValue(7);
        Cells.get(65).changeValue(8);
        Cells.get(69).changeValue(9);
        Cells.get(72).changeValue(4);
        Cells.get(76).changeValue(6);
        Cells.get(79).changeValue(8);
        Cells.get(83).changeValue(1);
        Cells.get(87).changeValue(3);
    }

    /**
     * Change the value of a cell
     * 
     * @param x The x coordinate of the object cell
     * @param y The y coordinate of the object cell
     * @param value      The new value
     */
    public void changeCellValue(int x, int y, int value) {
        this.grid.getCells().get(y * 9 + x).changeValue(value);
    }

    /**
     * Empty a cell
     * 
     * @param cellNumber The object cell
     */
    public void emptyCell(int x, int y) {
        this.changeCellValue(x, y, 0);
    }

    /**
     * TODO:If met the win conditions, show win page
     */
    public void checkWin() {
        this.win.testAll(this.grid);
        if (this.win.getIfwin() == true) {
            // show the win page
        } else {
            // show "conditions are not met", continue the game
        }
    }
}
