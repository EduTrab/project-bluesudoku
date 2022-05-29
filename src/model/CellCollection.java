package model;

import java.util.ArrayList;

/**
 * CellColletion is the superclass of Row, Column and SubGrid.
 * 
 * A CellCollection is an ArrayList consists of 9 cell objects as its
 * elements.
 * 
 * CellCollection class has 3 field. cells is an ArrayList of Cell that
 * holds all elements of the CellCollection. grid is the Grid this CellColletion
 * belongs to. number is the number of this CellCollection (from 1 to 9, inclusive)
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class CellCollection {
    private ArrayList<Cell> cells;
    private Grid grid;
    private int number;

    /**
     * Constructor of instances of class CellCollection.
     */
    public CellCollection(Grid theGrid, int theNumber) {
        cells = new ArrayList<Cell>();
        grid = theGrid;
        number = theNumber;
    }
    
    public Grid getGrid() {
        return grid;
    }
    
    public int getNumber() {
        return number;
    }
    
    /**
     * Initialize the CellCollection by adding 9 empty Cells as its elements.
     */
    public void initializeCollection() {
        for (int i = 0; i < 9; i++) {
            cells.add(new Cell(0, 0, 0));
        }
    }

    /**
     * An accessor method which returns the list of cells in this collection.
     * 
     * @return cells The list of cells in this collection.
     */
    public ArrayList<Cell> getCells() {
        return this.cells;
    }

    /**
     * Test if the sum of the values of all cells in this collection equals to 45.
     * 
     * @return True if the sum of the values of all cells in this collection equals
     *         to 45, other wise false.
     */
    public boolean testSum() {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum = sum + this.getCells().get(i).getValue();
        }
        return sum == 45;
    }
}