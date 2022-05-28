package model;

/**
 * A column is an array consists of 9 cell objects in the same column as its
 * elements.
 * For example row1 contains cell1,1, cell1,2, cell1,3, ..., cell1,9
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.28
 */
public class Column extends CellCollection {
    
    private int column;
    private Grid grid;
    
    /**
     * Constructor for objects of class Column.
     * 
     * @param theGrid .
     * @param column  .
     */
    public Column(Grid theGrid, int columnNumber) {
        super();
        this.grid = theGrid;
        this.column = columnNumber;
    }

    @Override
    public void initializeCollection() {
        for (int i = 0; i < 9; i++) {
            int current = (this.column - 1) + i * 9;
            Cell objectCell = this.grid.getCells().get(current);
            this.getCells().add(objectCell);
        }
    }
}
