package model;

/**
 * A cell is the basic unit of a Sudoku grids, which has three fields (a x
 * coordinate, a y coordinate and a value. All this three fields are integer
 * numbers from 1 to 9 (inclusive) ).
 *
 * @author hech@usi.ch
<<<<<<< HEAD
 * @version 2022.04.27
=======
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 */
public class Cell {
    // instance variables - replace the example below with your own.
    private int xvalue;
    private int yvalue;
    private int value;

    /**
     * Constructor for objects of class Cell (unfilled ones).
     * 
     * @param xcoordinate .
     * @param ycoordinate .
     */
    public Cell(int xcoordinate, int ycoordinate) {
        this.xvalue = xcoordinate;
        this.yvalue = ycoordinate;
        this.value = 0; // 0 means this cell is not filled
    }

    /**
     * Constructor for objects of class Cell.
     * 
     * @param xcoordinate .
     * @param ycoordinate .
     * @param cellValue   .
     */
    public Cell(int xcoordinate, int ycoordinate, int cellValue) {
        this.xvalue = xcoordinate;
        this.yvalue = ycoordinate;
        this.value = cellValue;
    }

    /**
     * Accessor method to get the value of current cell.
     * 
     * @return The value of current cell
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Accessor method to get the x coordinate of current cell.
     * 
     * @return The x coordinate of current cell
     */
    public int getXCoordinate() {
        return this.xvalue;
    }

    /**
     * Accessor method to get the y coordinate of current cell.
     * 
     * @return The y coordinate of current cell
     */
    public int getYCoordinate() {
        return this.yvalue;
    }

    /**
     * Change the value of a cell.
     * 
     * @param cellValue A integer number represents the new value of the cell (0 if
     *                  the cell should be empty)
     */
    public void changeValue(int cellValue) {
        this.value = cellValue;
    }
}
