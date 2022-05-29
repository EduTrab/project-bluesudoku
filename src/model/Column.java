package model;

/**
 * Column is a childclass of CellCollection.
 * 
 * A column is an array consists of 9 cell objects in the same column as its
 * elements.
 * For example row1 contains cell1,1, cell1,2, cell1,3, ..., cell1,9.
 * 
 * Column class has 2 fields. grid is the Grid in which
 * this Column is. column holds the number of this Column. 
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class Column extends CellCollection {
    
    private int column;
    private Grid grid;
    
    /**
     * Constructor for objects of class Column.
     * 
     * @param theGrid The grid in which this Column is.
     * @param rowNumber The number of this Column.
     */
    public Column(Grid theGrid, int columnNumber) {
        super();
        this.grid = theGrid;
        this.column = columnNumber;
    }

    /**
     * Intialize the Column by adding corresponding cells of the Grid 
     * to which this Column belongs as its elements.
     * 
     * This method overrides the method with the same name of CellCollection class.
     */
    @Override
    public void initializeCollection() {
        for (int i = 0; i < 9; i++) {
            int current = (this.column - 1) + i * 9;
            Cell objectCell = this.grid.getCells().get(current);
            this.getCells().add(objectCell);
        }
    }
}
