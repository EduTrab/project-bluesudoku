package model;

import java.util.ArrayList;

/**
 * The main class of the sudoku game, which the player directly interact with.
 *
 * @author Chengjiang He
 * @version 2022.05.08
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

    /**
     * An accessor method to get the grid of current game
     */
    public Grid getGrid() {
        return this.grid;
    }

    // TODO: An algorithm to randomly generate the values
    // Now we just give a determined Sudoku

    /**
     * Generate an empty grid the fill some cells to generate a determined Sudoku
     */
    public void initialize() {
        ArrayList<Cell> Cells = this.grid.getCells();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // int current = i * 9 + j;
                Cells.add(new Cell(j + 1, i + 1));
            }
        }
        // TODO: Improve this piece by creating a method can import external sudoku grid
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
        Cells.get(41).changeValue(2);
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
        Cells.get(67).changeValue(6);
        Cells.get(70).changeValue(8);
        Cells.get(74).changeValue(1);
        Cells.get(78).changeValue(3);
        // this.printGrid();
    }

    /**
     * Change the value of a cell
     * 
     * @param x     The x coordinate of the object cell
     * @param y     The y coordinate of the object cell
     * @param value The new value
     */
    public void changeCellValue(int x, int y, int value) {
        this.grid.getCells().get((y - 1) * 9 + (x - 1)).changeValue(value);
        // this.printGrid();
    }

    /**
     * Empty a cell
     * 
     * @param cellNumber The object cell
     */
    public void emptyCell(int x, int y) {
        this.changeCellValue(x, y, 0);
        // this.printGrid();
    }

    /**
     * TODO:If met the win conditions, show win page
     */
    public void checkWin() {
        this.win.testAll(this.grid);
        if (this.win.getIfwin() == true) {
            System.out.println("You win!");
        } else {
            System.out.println("Whoops...Try it again.");
            // this.printGrid();
        }
    }

    /**
     * Print a single row of the grid
     */
    public void printRow(int start, int end) {
        System.out.println("━━━━━━━━━━━━━━━━━━━");
        ArrayList<Cell> Cells = this.grid.getCells();
        String print = "┃";
        for(int i = start; i < end; i++){
            if (i % 3 == 2){
                print = print + Integer.toString(Cells.get(i).getValue()) + "┃";
            }
            else {
                print = print + Integer.toString(Cells.get(i).getValue()) + "┆";
            }     
        }
        System.out.println(print);
    }
    
    /**
     * Print the current grid
     */
    public void printGrid() {
        for(int i = 0, j = 9; j < 81 ; i = i + 9, j = j + 9){
            printRow(i, j);
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━");
        
    }
}
