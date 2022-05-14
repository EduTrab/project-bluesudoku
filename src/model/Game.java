package model;


import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * The main class of the sudoku game, which the player directly interact with.
 *
 * @author hech@usi.ch
 *         <<<<<<< HEAD
 * @version 2022.05.08
 *          =======
 * @version 2022.05.09
 *          >>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 * @version 2022.05.12
 */
public class Game {
    private Grid grid;
    private AllWin win;
    private SudokuReader reader;

    /**
     * Constructor for objects of class Game.
     */
    public Game() {
        this.grid = new Grid();
        this.win = new AllWin();
        this.reader = new SudokuReader();
    }

    /**
     * An accessor method to get the grid of current game.
     * 
     * @return grid
     */
    public Grid getGrid() {
        return this.grid;
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
     * A tempoary method to generate a Sudoku solution.
     */
    public void generateSudokuSolution() {
        ArrayList<Cell> cells = this.grid.getCells();
        try {
            reader.readSudokuFile(cells,
                    "/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/sampleSolution1.txt");
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

    /**
     * Print "You win!" if all test conditions are met, otherwise print
     * "Whoops...Try it again."
     */

    public void checkWin() {
        this.win.testAll(this.grid);
        if (this.win.isIfwin() == true) {
            System.out.println("You win!");
        } else {
            System.out.println("Whoops...Try it again.");
            // this.printGrid();
        }
    }
}
