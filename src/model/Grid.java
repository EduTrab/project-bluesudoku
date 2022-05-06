package model;

import java.util.ArrayList;

/**
 * A Grid is a 9x9 Sudoku grid, which can be divided into 9 subgrids and 9 rows
 * and 9 columns.
 * It is actually a ArrayList of Cell and consists of 81 cells as elements.
 *
 * @author trabae@usi.ch
 * @version 2022.04.27
 */
public class Grid {
    private ArrayList<Cell> cells;

    /**
     * Constructor for objects of class Grid
     */
    public Grid() {
        this.cells = new ArrayList<Cell>();
    }

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

}
