package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * The main class of the sudoku game, which the player directly interact with.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.12
 */
public class Game {
    private Grid grid;
    private AllWin win;
    private SudokuReader reader;
    private SudokuSolver solver;

    /**
     * Constructor for objects of class Game.
     */
    public Game() {
        this.grid = new Grid();
        this.win = new AllWin();
        this.reader = new SudokuReader();
        this.solver = new SudokuSolver();
    }

    /**
     * An accessor method to get the grid of current game.
     * 
     * @return grid
     */
    public Grid getGrid() {
        return this.grid;
    }
    
    public SudokuSolver getSolver() {
        return this.solver;
    }

    /**
     * An accessor method to get the win statu of current game.
     * 
     * @return win
     */
    public AllWin getWin() {
        return this.win;
    }

    /**
     * A tempoary method to generate an empty grid the fill some cells to generate
     * a determined Sudoku.
     * 
     * @param pathFile .
     */
    public void initialize(String pathFile) {
        ArrayList<Cell> cells = this.grid.getCells();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // int current = i * 9 + j;
                cells.add(new Cell(i, j));
            }
        }
        try {
            reader.readSudokuFile(cells, pathFile);
        } catch (FileNotFoundException exception) {
            System.out.println("Exception throw :" + exception);
        }
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
    
    public boolean AISolution() {
        boolean result = this.solver.solveResult(this.grid);
        return result;
    }

    /**
     * Print "You win!" if all test conditions are met, otherwise print
     * "Whoops...Try it again."
     */

    public void checkWin() {
        this.win.testAll(this.grid);
    }
}
