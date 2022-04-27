package model;

/**
 * Column is an array consists of 9 cell objects in the same column as its elements.
 * For example row1 contains cell1,1, cell1,2, cell1,3, ..., cell1,9
 *
 * @author Chengjiang He
 * @version 2022.04.27
 */
public class Column
{
    private Cell[] columnCells;
    
    /**
     * Constructor for objects of class Column
     */
    public Column(Grid theGrid, int column)
    {
        columnCells = new Cell[9];
        for(int i = 0; i < 8; i++){
            columnCells[i] = theGrid.cells[(column - 1) + i * 9]; 
        }
    }

}
