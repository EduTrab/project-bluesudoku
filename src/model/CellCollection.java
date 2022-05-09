package model;

import java.util.ArrayList;

/**
 * A cellCollection is an array consists of 9 cell objects as its
 * elements.
 *
 * @author hech@usi.ch
 * @version 2022.05.09
 */
public class CellCollection {
    private ArrayList<Cell> cells;

    /**
     * Constructor for objects of class Column.
     * 
     * @param theGrid .
     * @param number  .
     */
    public CellCollection(Grid theGrid, int number) {
        cells = new ArrayList<Cell>();
        for (int i = 0; i < 10; i++) {
            cells.add(new Cell(0, 0, 0));
        }
    }

    /**
     * An accessor method which returns the list of cells in this collection.
     * 
     * @return cells The list of cells in this collection
     */
    public ArrayList<Cell> getCells() {
        return this.cells;
    }

    /**
     * Test if the sum of the values of all cells in this collection equals to 45.
     * 
     * @return True if the sum of the values of all cells in this collection equals
     *         to 45, other wise false
     */
    public boolean testSum() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + this.getCells().get(i).getValue();
        }
        return sum == 45;
    }

    /**
     * Fill the cellCollection with cells of values whose sum is 45. In order to
     * test.
     */
    public void fillTrueSum() {
        for (int i = 0; i < 10; i++) {
            this.getCells().set(i, new Cell(0, 0, i));
        }
    }
}
