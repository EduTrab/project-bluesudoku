package model;

import java.util.ArrayList;

/**
 * A cellCollection is an array consists of 9 cell objects as its
 * elements.
 *
 * @author trabae@usi.ch
 * @version 2022.05.06
 */
public class cellCollection {
    private ArrayList<Cell> cells;

    /**
     * Constructor for objects of class Column.
     */
    public cellCollection(Grid theGrid, int number) {
        cells = new ArrayList<Cell>();
    }

    /**
     * An accessor method which returns the list of cells in this collection.
     * 
     * @return The list of cells in this collection
     */
    public ArrayList<Cell> getCells() {
        return this.cells;
    }

    /**
     * Test if the sum of the values of all cells in this collection equals to 45
     * 
     * @return True if the sum of the values of all cells in this collection equals
     *         to 45, other wise false
     */
    public boolean testSum() {
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum = sum + this.getCells().get(i).getValue();
        }
        return sum == 45;
    }
}
