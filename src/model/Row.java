package model;

/**
 * Row is a childclass of CellCollection
 * 
 * A row is an array consists of 9 cell objects in the same row as its elements.
 * For example row1 contains cell1,1, cell2,1, cell3,1, ..., cell9,1.
 *
 * Row class has 2 fields. grid is the Grid in which 
 * this Row is. row holds the number of this Row. 
 * 
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class Row extends CellCollection {
    /**
     * Constructor for objects of class Row with param theGrid and row.
     * 
     * @param theGrid The grid in which this Row is.
     * @param rowNumber The number of this Row.
     */
    
    public Row(Grid theGrid, int rowNumber) {
        super(theGrid, rowNumber);
    }
    
    /**
     * Intialize the Row by adding corresponding cells of the Grid 
     * to which this Row belongs as its elements.
     * 
     * This method overrides the method with the same name of CellCollection class.
     */
    @Override
    public void initializeCollection() {
        for (int i = 0; i < 9; i++) {
          int current = i + (this.getNumber() - 1) * 9;
          Cell objectCell = getGrid().getCells().get(current);
          this.getCells().add(objectCell);
        }
    }
}
