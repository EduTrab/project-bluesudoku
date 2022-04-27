package model;

import java.util.ArrayList;

/**
 * A Grid is a 9x9 Sudoku grid, which can be divided into 9 subgrids or 9 rows or 9 columns.
 * It is actually a ArrayList of Cell and consists of 81 cells as elements.
 *
 * @author Chengjiang He
 * @version 2022.04.27
 */
public class Grid
{
    private ArrayList<Cell> cells;

    /**
     * Constructor for objects of class Grid
     */
    public Grid()
    {
       this.cells = new ArrayList<Cell>(); 
    }
    
    public void addCell(Cell cell){
        this.cells.add(cell);
    }
    
    public ArrayList<Cell> getCells(){
        return this.cells;
    }


}
