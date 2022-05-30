package model;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Game is the superclass of EasyGame, MediumGame, HardGame, DIYGame
 * 
 * The main class of the sudoku game, which the player directly interact with.
 * 
 * Game class has 4 fields. grid is the sudoku Grid of this game. win is
 * the win condition checker of this game. reader is the SudokuReader to
 * reader external sudoku files. solver is used to generator a computer
 * player solution.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class Game {
    private Grid grid;
    private AllWin win;
    private final SudokuReader reader;
    private final SudokuSolver solver;

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
     * @return The sudoku grid of this game
     */
    public Grid getGrid() {
        return this.grid;
    }

    /**
     * Set the grid the current game.
     * @grid The new grid.
     */
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     * An accessor method to get the SudokuSolver of the current game.
     * 
     * @return The SudokuSolver of the current game.
     */
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

    public void initialize() {};

    /**
     * Reader an external sudoku file and create a sudoku grid according
     * to it.
     * 
     * @param pathFile The path of the sudoku file.
     */
    public void initialize(String pathFile) {
        String path = pathFile;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // int current = i * 9 + j;
                this.grid.getCells().add(new Cell(i, j));
            }
        }
        try {
            reader.readSudokuFile(this.grid.getCells(), path);
        } catch (FileNotFoundException exception) {
            path = "File Not Found.";
        }
        this.solver.initialize(this.getGrid());
    }

    /**
     * Randomly choose a sudoku file of the given difficulty. Use it
     * to initialize the game.
     * 
     * @param difficulty "easy" "medium" "hard" "empty"
     */
    public void randomInitialize(String difficulty) {
        Random randomGenerator = new Random();
        int sudokuNumber = randomGenerator.nextInt(9) + 1;
        String filePath = "sudokuFiles/" + difficulty + sudokuNumber + ".txt";
        initialize(filePath);
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
    }

    /**
     * Empty a cell.
     * 
     * @param xcoordinate select the cell on the xcoordinate
     * @param ycoordinate select the cell on the ycoordinate
     */
    public void emptyCell(int xcoordinate, int ycoordinate) {
        this.changeCellValue(xcoordinate, ycoordinate, 0);
    }

    /**
     * Ask the SudokuSolver of this game check if this sudoku solvable
     */
    public String aiResult() {
        String result = "";
        int[][] sudoku = solver.getSudoku();
        if ((boolean) solver.solveSudoku(sudoku)[0]) {
            result = "Solved successfully!!!";
        }
        return result;
    }

    /**
     * Show "You win!" if all test conditions are met, otherwise print
     * "Whoops...Try it again."
     */

    public void checkWin() {
        this.win.testAll(this.grid);
    }
}
