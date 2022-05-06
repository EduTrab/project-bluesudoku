package model;

import java.util.ArrayList;

/**
 * A row is an array consists of 9 cell objects in the same row as its elements.
 * For example row1 contains cell1,1, cell2,1, cell3,1, ..., cell9,1
 *
 * @author trabae@usi.ch
 * @version 2022.04.27
 */
public class Row extends cellCollection {
    // TODO: To store the cells in a row, we should use 9 fields or a list?

    private ArrayList<Cell> rowCells;

    
    /**
     * Constructor for objects of class Row.
     * @param theGrid
     * @param row
     */
    public Row(Grid theGrid, int row) {
        super(theGrid, row);

        rowCells = new ArrayList<Cell>();
        for (int i = 0; i < 9; i++) {
            Cell objectCell = theGrid.getCells().get(i + (row - 1) * 9);
            if (objectCell == null) {
                this.rowCells.set(i, null);
            } else {
                this.rowCells.set(i, theGrid.getCells().get(i + (row - 1) * 9));
            }
        }
    }

}
