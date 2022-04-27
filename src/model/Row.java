package model;

/**
 * Row is a arraylist consists of 9 cell objects in the same row as its elements.
 * For example row1 contains cell1,1, cell2,1, cell3,1, ..., cell9,1
 *
 * @author Chengjiang He
 * @version 2022.04.27
 */
public class Row
{
    // TODO: To store the cells in a row, we should use 9 fields or a list?\
    
    private Cell[] rowCells;
    
    /**
     * Constructor for objects of class Row
     */
    public Row(Grid theGrid, int row)
    {
        rowCells = new Cell[9];
        for(int i = 0; i < 9; i++){
            rowCells[i] = cells[i + (row - 1) * 9]; 
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
