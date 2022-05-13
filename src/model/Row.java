package model;



/**
 * A row is an array consists of 9 cell objects in the same row as its elements.
 * For example row1 contains cell1,1, cell2,1, cell3,1, ..., cell9,1
 *
 * @author hech@usi.ch
 * @version 2022.05.09
 */
public class Row extends CellCollection {
    /**
     * Constructor for objects of class Row with param theGrid and row.
     * 
     * @param theGrid .
     * @param row     .
     */
    public Row(Grid theGrid, int row) {
        super(theGrid, row);
        for (int i = 0; i < 9; i++) {
            int current = i + (row - 1) * 9;
            Cell objectCell = theGrid.getCells().get(current);
            this.getCells().set(i, objectCell);
        }
    }
}
