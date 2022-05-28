package model;

/**
 * A row is an array consists of 9 cell objects in the same row as its elements.
 * For example row1 contains cell1,1, cell2,1, cell3,1, ..., cell9,1
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.28
 */
public class Row extends CellCollection {
    
    private int row;
    private Grid grid;
    
    /**
     * Constructor for objects of class Row with param theGrid and row.
     * 
     * @param theGrid .
     * @param row     .
     */
    
    public Row(Grid theGrid, int rowNumber) {
        super();
        this.grid = theGrid;
        this.row = rowNumber;
    }
    
    @Override
    public void initializeCollection() {
        for (int i = 0; i < 9; i++) {
          int current = i + (this.row - 1) * 9;
          Cell objectCell = this.grid.getCells().get(current);
          this.getCells().add(objectCell);
        }
    }
}
