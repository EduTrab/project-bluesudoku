package model;

import java.util.ArrayList;

/**
 * A row is an array consists of 9 cell objects in the same row as its elements.
 * For example row1 contains cell1,1, cell2,1, cell3,1, ..., cell9,1
 *
 * @author Chengjiang He
 * @version 2022.04.27
 */
public class Row {
    // TODO: To store the cells in a row, we should use 9 fields or a list?

    private ArrayList<Cell> rowCells;

    /**
     * Constructor for objects of class Row.
     */
    public Row(Grid theGrid, int row) {
        rowCells = new ArrayList<Cell>();
        for (int i = 0; i < 9; i++) {
            Cell objectCell = theGrid.getCells().get(i + (row - 1) * 9);
            if(objectCell == null) {
                this.rowCells.set(i, null);
            }
            else {
                this.rowCells.set(i, theGrid.getCells().get(i + (row - 1) * 9));
            }  
        }
    }

    /**
     * An accessor method which returns the list of cells in this row
     * 
     * @return The list of cells in this row.
     */
    public ArrayList<Cell> getCells() {
        return this.rowCells;
    }
    
    /**
     * Test if the sum of the values of all cells in this row equals to 45
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
