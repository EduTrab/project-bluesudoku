package model;

import java.util.ArrayList;

/**
 * A column is an array consists of 9 cell objects in the same column as its
 * elements.
 * For example row1 contains cell1,1, cell1,2, cell1,3, ..., cell1,9
 *
 * @author Chengjiang He
 * @version 2022.04.27
 */
public class Column {
    private ArrayList<Cell> columnCells;

    /**
     * Constructor for objects of class Column.
     */
    public Column(Grid theGrid, int column) {
        columnCells = new ArrayList<Cell>();
        for (int i = 0; i < 8; i++) {
            Cell objectCell = theGrid.getCells().get((column - 1) + i * 9);
            if(objectCell == null) {
                this.columnCells.set(i, null);
            }
            else {
                this.columnCells.set(i, theGrid.getCells().get((column - 1) + i * 9));
            }
        }
    }

    /**
     * An accessor method which returns the list of cells in this column.
     * 
     * @return The list of cells in this column
     */
    public ArrayList<Cell> getCells() {
        return this.columnCells;
    }
    
    /**
     * Test if the sum of the values of all cells in this column equals to 45
     * 
     * @return True if the sum of the values of all cells in this row equals to 45, other wise false
     */
    public boolean testSum(){
        int sum = 0;
        for(int i = 0; i < 8; i++){
            sum = sum + this.getCells().get(i).getValue();
        }
        return sum == 45;
    }
}
