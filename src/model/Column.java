package model;

/**
 * Column is a arraylist consists of 9 cell objects in the same column as its elements.
 * For example row1 contains cell1,1, cell1,2, cell1,3, ..., cell1,9
 *
 * @author Chengjiang He
 * @version 2022.04.27
 */
public class Column
{
    // TODO: To store the cells in a row, we should use 9 fields or a list?\
    
    private Cell[] columnCells;
    
    /**
     * Constructor for objects of class Row
     */
    public Column(Grid theGrid, int column)
    {
        columnCells = new Cell[9];
        for(int i = 0; i < 9; i++){
            columnCells[i] = cells[(column - 1) + i * 9]; 
        }
    }

}
