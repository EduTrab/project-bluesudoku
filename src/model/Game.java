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
     * Print the current grid
     */
    public void printGrid() {
        ArrayList<Cell> Cells = this.grid.getCells();
        System.out.println("━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃" + Integer.toString(Cells.get(0).getValue())
                + "┊" + Integer.toString(Cells.get(1).getValue())
                + "┊" + Integer.toString(Cells.get(2).getValue())
                +
                "┃" + Integer.toString(Cells.get(3).getValue())
                +
                "┊" + Integer.toString(Cells.get(4).getValue())
                +
                "┊" + Integer.toString(Cells.get(5).getValue())
                +
                "┃" + Integer.toString(Cells.get(6).getValue())
                +
                "┊" + Integer.toString(Cells.get(7).getValue())
                +
                "┊" + Integer.toString(Cells.get(8).getValue())
                + "┃");
        System.out.println("┃" + Integer.toString(Cells.get(9).getValue())
                +
                "┊" + Integer.toString(Cells.get(10).getValue())
                +
                "┊" + Integer.toString(Cells.get(11).getValue())
                +
                "┃" + Integer.toString(Cells.get(12).getValue())
                +
                "┊" + Integer.toString(Cells.get(13).getValue())
                +
                "┊" + Integer.toString(Cells.get(14).getValue())
                +
                "┃" + Integer.toString(Cells.get(15).getValue())
                +
                "┊" + Integer.toString(Cells.get(16).getValue())
                +
                "┊" + Integer.toString(Cells.get(17).getValue())
                + "┃");
        System.out.println("┃" + Integer.toString(Cells.get(18).getValue())
                +
                "┊" + Integer.toString(Cells.get(19).getValue())
                +
                "┊" + Integer.toString(Cells.get(20).getValue())
                +
                "┃" + Integer.toString(Cells.get(21).getValue())
                +
                "┊" + Integer.toString(Cells.get(22).getValue())
                +
                "┊" + Integer.toString(Cells.get(23).getValue())
                +
                "┃" + Integer.toString(Cells.get(24).getValue())
                +
                "┊" + Integer.toString(Cells.get(25).getValue())
                +
                "┊" + Integer.toString(Cells.get(26).getValue())
                + "┃");
        System.out.println("━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃" + Integer.toString(Cells.get(27).getValue())
                +
                "┊" + Integer.toString(Cells.get(28).getValue())
                +
                "┊" + Integer.toString(Cells.get(29).getValue())
                +
                "┃" + Integer.toString(Cells.get(30).getValue())
                +
                "┊" + Integer.toString(Cells.get(31).getValue())
                +
                "┊" + Integer.toString(Cells.get(32).getValue())
                +
                "┃" + Integer.toString(Cells.get(33).getValue())
                +
                "┊" + Integer.toString(Cells.get(34).getValue())
                +
                "┊" + Integer.toString(Cells.get(35).getValue())
                + "┃");
        System.out.println("┃" + Integer.toString(Cells.get(36).getValue())
                +
                "┊" + Integer.toString(Cells.get(37).getValue())
                +
                "┊" + Integer.toString(Cells.get(38).getValue())
                +
                "┃" + Integer.toString(Cells.get(39).getValue())
                +
                "┊" + Integer.toString(Cells.get(40).getValue())
                +
                "┊" + Integer.toString(Cells.get(41).getValue())
                +
                "┃" + Integer.toString(Cells.get(42).getValue())
                +
                "┊" + Integer.toString(Cells.get(43).getValue())
                +
                "┊" + Integer.toString(Cells.get(44).getValue())
                + "┃");
        System.out.println("┃" + Integer.toString(Cells.get(45).getValue())
                +
                "┊" + Integer.toString(Cells.get(46).getValue())
                +
                "┊" + Integer.toString(Cells.get(47).getValue())
                +
                "┃" + Integer.toString(Cells.get(48).getValue())
                +
                "┊" + Integer.toString(Cells.get(49).getValue())
                +
                "┊" + Integer.toString(Cells.get(50).getValue())
                +
                "┃" + Integer.toString(Cells.get(51).getValue())
                +
                "┊" + Integer.toString(Cells.get(52).getValue())
                +
                "┊" + Integer.toString(Cells.get(53).getValue())
                + "┃");
        System.out.println("━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃" + Integer.toString(Cells.get(54).getValue())
                +
                "┊" + Integer.toString(Cells.get(55).getValue())
                +
                "┊" + Integer.toString(Cells.get(56).getValue())
                +
                "┃" + Integer.toString(Cells.get(57).getValue())
                +
                "┊" + Integer.toString(Cells.get(58).getValue())
                +
                "┊" + Integer.toString(Cells.get(59).getValue())
                +
                "┃" + Integer.toString(Cells.get(60).getValue())
                +
                "┊" + Integer.toString(Cells.get(61).getValue())
                +
                "┊" + Integer.toString(Cells.get(62).getValue())
                + "┃");
        System.out.println("┃" + Integer.toString(Cells.get(63).getValue())
                +
                "┊" + Integer.toString(Cells.get(64).getValue())
                +
                "┊" + Integer.toString(Cells.get(65).getValue())
                +
                "┃" + Integer.toString(Cells.get(66).getValue())
                +
                "┊" + Integer.toString(Cells.get(67).getValue())
                +
                "┊" + Integer.toString(Cells.get(68).getValue())
                +
                "┃" + Integer.toString(Cells.get(69).getValue())
                +
                "┊" + Integer.toString(Cells.get(70).getValue())
                +
                "┊" + Integer.toString(Cells.get(71).getValue())
                + "┃");
        System.out.println("┃" + Integer.toString(Cells.get(72).getValue())
                +
                "┊" + Integer.toString(Cells.get(73).getValue())
                +
                "┊" + Integer.toString(Cells.get(74).getValue())
                +
                "┃" + Integer.toString(Cells.get(75).getValue())
                +
                "┊" + Integer.toString(Cells.get(76).getValue())
                +
                "┊" + Integer.toString(Cells.get(77).getValue())
                +
                "┃" + Integer.toString(Cells.get(78).getValue())
                +
                "┊" + Integer.toString(Cells.get(79).getValue())
                +
                "┊" + Integer.toString(Cells.get(80).getValue())
                + "┃");
        System.out.println("━━━━━━━━━━━━━━━━━━━━");
    }
}
