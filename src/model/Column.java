package model;



/**
 * A column is an array consists of 9 cell objects in the same column as its
 * elements.
 * For example row1 contains cell1,1, cell1,2, cell1,3, ..., cell1,9
 *
 * @author hech@usi.ch
<<<<<<< HEAD
 * @version 2022.04.27
=======
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 */
public class Column extends CellCollection {
    /**
     * Constructor for objects of class Column.
     * 
     * @param theGrid .
     * @param column  .
     */
    public Column(Grid theGrid, int column) {
        super(theGrid, column);
        for (int i = 0; i < 9; i++) {
            int current = (column - 1) + i * 9;
            Cell objectCell = theGrid.getCells().get(current);
            this.getCells().set(i, objectCell);
        }
    }

}
