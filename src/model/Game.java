package model;

import java.util.ArrayList;

/**
 * The main class of the sudoku game, which the player directly interact with.
 *
 * @author hech@usi.ch
 * @version 2022.05.08
 */
public class Game {
    // instance variables - replace the example below with your own
    private Grid grid;
    private AllWin win;

    /**
     * Constructor for objects of class Game.
     */
    public Game() {
        this.grid = new Grid();
        this.win = new AllWin();
    }

    /**
     * An accessor method to get the grid of current game.
     * 
     * @return grid
     */
    public Grid getGrid() {
        return this.grid;
    }

    // TODO: An algorithm to randomly generate the values
    // Now we just give a determined Sudoku

    /**
     * A tempoary method to generate an empty grid the fill some cells to generate
     * a determined Sudoku. It will soon be replaced by a better one without code
     * duplication.
     */
    public void initialize() {
        ArrayList<Cell> cells = this.grid.getCells();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // int current = i * 9 + j;
                cells.add(new Cell(i, j));
            }
        }
        // TODO: Improve this piece by creating a method can import external sudoku grid
        cells.get(1).changeValue(3);
        cells.get(2).changeValue(2);
        cells.get(3).changeValue(1);
        cells.get(4).changeValue(5);
        cells.get(11).changeValue(5);
        cells.get(15).changeValue(2);
        cells.get(17).changeValue(8);
        cells.get(18).changeValue(1);
        cells.get(19).changeValue(9);
        cells.get(21).changeValue(2);
        cells.get(23).changeValue(4);
        cells.get(24).changeValue(7);
        cells.get(26).changeValue(3);
        cells.get(27).changeValue(2);
        cells.get(28).changeValue(5);
        cells.get(29).changeValue(7);
        cells.get(31).changeValue(3);
        cells.get(33).changeValue(6);
        cells.get(34).changeValue(4);
        cells.get(36).changeValue(9);
        cells.get(37).changeValue(8);
        cells.get(40).changeValue(7);
        cells.get(41).changeValue(2);
        cells.get(44).changeValue(1);
        cells.get(45).changeValue(6);
        cells.get(50).changeValue(9);
        cells.get(51).changeValue(8);
        cells.get(52).changeValue(2);
        cells.get(53).changeValue(7);
        cells.get(54).changeValue(3);
        cells.get(55).changeValue(7);
        cells.get(56).changeValue(8);
        cells.get(60).changeValue(9);
        cells.get(63).changeValue(4);
        cells.get(67).changeValue(6);
        cells.get(70).changeValue(8);
        cells.get(74).changeValue(1);
        cells.get(78).changeValue(3);
        // this.printGrid();
    }

    /**
     * A tempoary method to generate a Sudoku solution. It will soon be replaced
     * by a better one without code duplication.
     */
    public void generateSudokuSolution() {
        ArrayList<Cell> cells = this.grid.getCells();
        cells.get(0).changeValue(5);
        cells.get(1).changeValue(3);
        cells.get(2).changeValue(4);
        cells.get(3).changeValue(6);
        cells.get(4).changeValue(7);
        cells.get(5).changeValue(8);
        cells.get(6).changeValue(9);
        cells.get(7).changeValue(1);
        cells.get(8).changeValue(2);
        cells.get(9).changeValue(6);
        cells.get(10).changeValue(7);
        cells.get(11).changeValue(2);
        cells.get(12).changeValue(1);
        cells.get(13).changeValue(9);
        cells.get(14).changeValue(5);
        cells.get(15).changeValue(3);
        cells.get(16).changeValue(4);
        cells.get(17).changeValue(8);
        cells.get(18).changeValue(1);
        cells.get(19).changeValue(9);
        cells.get(20).changeValue(8);
        cells.get(21).changeValue(3);
        cells.get(22).changeValue(4);
        cells.get(23).changeValue(2);
        cells.get(24).changeValue(5);
        cells.get(25).changeValue(6);
        cells.get(26).changeValue(7);
        cells.get(27).changeValue(8);
        cells.get(28).changeValue(5);
        cells.get(29).changeValue(9);
        cells.get(30).changeValue(7);
        cells.get(31).changeValue(6);
        cells.get(32).changeValue(1);
        cells.get(33).changeValue(4);
        cells.get(34).changeValue(2);
        cells.get(35).changeValue(3);
        cells.get(36).changeValue(4);
        cells.get(37).changeValue(2);
        cells.get(38).changeValue(6);
        cells.get(39).changeValue(8);
        cells.get(40).changeValue(5);
        cells.get(41).changeValue(3);
        cells.get(42).changeValue(7);
        cells.get(43).changeValue(9);
        cells.get(44).changeValue(1);
        cells.get(45).changeValue(7);
        cells.get(46).changeValue(1);
        cells.get(47).changeValue(3);
        cells.get(48).changeValue(9);
        cells.get(49).changeValue(2);
        cells.get(50).changeValue(4);
        cells.get(51).changeValue(8);
        cells.get(52).changeValue(5);
        cells.get(53).changeValue(6);
        cells.get(54).changeValue(9);
        cells.get(55).changeValue(6);
        cells.get(56).changeValue(1);
        cells.get(57).changeValue(5);
        cells.get(58).changeValue(3);
        cells.get(59).changeValue(7);
        cells.get(60).changeValue(2);
        cells.get(61).changeValue(8);
        cells.get(62).changeValue(4);
        cells.get(63).changeValue(2);
        cells.get(64).changeValue(8);
        cells.get(65).changeValue(7);
        cells.get(66).changeValue(4);
        cells.get(67).changeValue(1);
        cells.get(68).changeValue(9);
        cells.get(69).changeValue(6);
        cells.get(70).changeValue(3);
        cells.get(71).changeValue(5);
        cells.get(72).changeValue(3);
        cells.get(73).changeValue(4);
        cells.get(74).changeValue(5);
        cells.get(75).changeValue(2);
        cells.get(76).changeValue(8);
        cells.get(77).changeValue(6);
        cells.get(78).changeValue(1);
        cells.get(79).changeValue(7);
        cells.get(80).changeValue(9);
    }

    /**
     * Change the value of a cell.
     * 
     * @param xcoordinate The x coordinate of the object cell
     * @param ycoordinate The y coordinate of the object cell
     * @param value       The new value
     */

    public void changeCellValue(int xcoordinate, int ycoordinate, int value) {
        this.grid.getCells().get((ycoordinate - 1) * 9 + (xcoordinate - 1)).changeValue(value);
        // this.printGrid();
    }

    /**
     * Empty a cell.
     * 
     * @param xcoordinate select the cell on the xcoordinate
     * @param ycoordinate select the cell on the ycoordinate
     */
    public void emptyCell(int xcoordinate, int ycoordinate) {
        this.changeCellValue(xcoordinate, ycoordinate, 0);
        // this.printGrid();
    }

    /**
     * TODO:If met the win conditions, show win page.
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
     * Print a single row of the grid.
     * 
     * @param start .
     * @param end   .
     */
    public void printRow(int start, int end) {
        System.out.println("━━━━━━━━━━━━━━━━━━━");
        ArrayList<Cell> cells = this.grid.getCells();
        String print = "┃";
        for (int i = start; i < end; i++) {
            if (i % 3 == 2) {
                print = print + Integer.toString(cells.get(i).getValue()) + "┃";
            } else {
                print = print + Integer.toString(cells.get(i).getValue()) + "┆";
            }
        }
        System.out.println(print);
    }

    /**
     * Print the current grid.
     */

    public void printGrid() {
        for (int i = 0, j = 9; j < 81; i = i + 9, j = j + 9) {
            printRow(i, j);
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━");

    }
}
