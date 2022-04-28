package model;

import java.util.HashSet;


/**
 * This class defines the conditions to win the game
 *
 * @author Chengjiang He
 * @version 2022.04.28
 */
public class Win
{
    private boolean ifwin;

    /**
     * Constructor for objects of class Win
     */
    public Win()
    {
        ifwin = false;
    }

    /**
     * Successor method to get ifwin
     * @return ifwin
     */
    public boolean getIfwin()
    {
        return this.ifwin;
    }
    
    /**
     * Return true if there is no same elements in the row, otherwise return false
     * @param  row The row needs to be tested
     * @return True if there is no same elements in the row, otherwise return false

     */
    public boolean testRow(Row row)
    {
        HashSet<Cell> set = new HashSet<Cell>(row.getCells());
        ifwin = row.getCells().size() == set.size();
        return this.ifwin;
    }
    
    /**
     * Return true if there is no same elements in the column, otherwise return false
     * @param  row The row needs to be tested
     * @return True if there is no same elements in the column, otherwise return false

     */
    public boolean testColumn(Column column)
    {
        HashSet<Cell> set = new HashSet<Cell>(column.getCells());
        this.ifwin = column.getCells().size() == set.size();
        return this.ifwin;
    }
    
    /**
     * Return true if there is no same elements in the subgrid, otherwise return false
     * @param  row The row needs to be tested
     * @return True if there is no same elements in the subgrid, otherwise return false

     */
    public boolean testSubGrid(SubGrid subgrid)
    {
        HashSet<Cell> set = new HashSet<Cell>(subgrid.getCells());
        this.ifwin = subgrid.getCells().size() == set.size();
        return this.ifwin;
    }
    
    /**
     * Return true if all rows met the win conditional, otherwise return false
     * @param grid The current grid
     * @return True if all rows met the win conditional, otherwise return false
     */
    public boolean testAllRows(Grid grid)
    {
        for(int i = 1; i < 9; i++){
            Row currentRow = new Row(grid, i);
            this.ifwin = testRow(currentRow);
        }
        return this.ifwin;
    }
    
    /**
     * Return true if all columns met the win conditional, otherwise return false
     * @param grid The current grid
     * @return True if all columns met the win conditional, otherwise return false
     */
    public boolean testAllColumns(Grid grid)
    {
        for(int i = 1; i < 9; i++){
            Column currentColumn = new Column(grid, i);
            this.ifwin = testColumn(currentColumn);
        }
        return this.ifwin;
    }
    
    /**
     * Return true if all subgrids met the win conditional, otherwise return false
     * @param grid The current grid
     * @return True if all subgrids met the win conditional, otherwise return false
     */
    public boolean testAllSubGrids(Grid grid)
    {
        for(int i = 1; i < 9; i++){
            SubGrid currentSubGrid = new SubGrid(grid, i);
            this.ifwin = testSubGrid(currentSubGrid);
        }
        return this.ifwin;
    }
    
    /**
     * Return true if all win conditions are met, otherwise return false
     * @param grid The current grid
     */
    public void testAll(Grid grid)
    {
        this.ifwin = testAllRows(grid) && testAllColumns(grid) && testAllSubGrids(grid);
    }
}
