package model;

import java.util.ArrayList;

/**
 * A Grid is a 9x9 Sudoku grid, which can be divided into 9 subgrids and 9 rows
 * and 9 columns.
 * It is actually a ArrayList of Cell and consists of 81 cells as elements.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class Grid {
    private final ArrayList<Cell> cells = new ArrayList<Cell>();

    /**
     * Add a cell into the current grid.
     * 
     * @param cell The cell needs to be added
     */
    public void addCell(Cell cell) {
        this.cells.add(cell);
    }

    /**
     * Get the list of all cells of the current grid.
     * 
     * @return The list of all cells of the current grid
     */
    public ArrayList<Cell> getCells() {
        return this.cells;
    }

    
    /**
     *  Initialize the Grid according to a Array of integrate, which represents a sudoku.
     * 
     * @param sudoku the sudoku
     */
    public void initializeGrid(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Cell cell = new Cell(i, j, sudoku[i][j]);
                addCell(cell);
            }
        }
    }
}
