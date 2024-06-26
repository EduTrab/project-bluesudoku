package model;

/**
 * Column is a childclass of CellCollection.
 * 
 * <p>A column is an array consists of 9 cell objects in the same column as its
 * elements.
 * For example row1 contains cell1,1, cell1,2, cell1,3, ..., cell1,9.
 * 
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class Column extends CellCollection {
    
    /**
     * Constructor of instances of class Column.
     * 
     * @param theGrid The grid in which this Column is.
     * @param columnNumber The number of this Column.
     */
    public Column(Grid theGrid, int columnNumber) {
        super(theGrid, columnNumber);
    }

    /**
     * Intialize the Column by adding corresponding cells of the Grid
     * to which this Column belongs as its elements.
     * 
     * <p>This method overrides the method with the same name of CellCollection class.
     */
    @Override
    public void initializeCollection() {
        for (int i = 0; i < 9; i++) {
            int current = (this.getNumber() - 1) + i * 9;
            Cell objectCell = getGrid().getCells().get(current);
            this.getCells().add(objectCell);
        }
    }
}
