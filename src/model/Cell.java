package model;


/**
 * A cell is the basic unit of a Sudoku grids, which has three fields (a x
 * coordinate, a y coordinate and a value. All this three fields are integer
 * numbers from 1 to 9 (inclusive) )
 *
 * @author Chengjiang He
 * @version 2022.04.27
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int value;

    /**
     * Constructor for objects of class Cell (unfilled ones)
     */
    public Cell(int xCoordinate, int yCoordinate)
    {
        this.x = xCoordinate;
        this.y = yCoordinate;
        this.value = 0; // 0 means this cell is not filled
    }
    
    /**
     * Constructor for objects of class Cell
     */
    public Cell(int xCoordinate, int yCoordinate, int cellValue)
    {
        this.x = xCoordinate;
        this.y = yCoordinate;
        this.value = cellValue;
    }

    /**
     * Change the value of a cell.
     * @param cellValue A integer number represents the new value of the cell (0 if the cell should be empty)
     */
    public void changeValue(int cellValue)
    {
        this.value = cellValue;
    }
}
