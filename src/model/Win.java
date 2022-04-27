package model;

import java.util.HashSet;


/**
 * This class defines the conditions to win the game
 *
 * @author Chengjiang He
 * @version 2022.04.27
 */
public class Win
{
    // instance variables - replace the example below with your own
    private boolean ifwin;

    /**
     * Constructor for objects of class Win
     */
    public Win()
    {
        ifwin = false;
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
        return ifwin;
    }
    
    /**
     * Return true if there is no same elements in the column, otherwise return false
     * @param  row The row needs to be tested
     * @return True if there is no same elements in the column, otherwise return false

     */
    public boolean testColumn(Column column)
    {
        HashSet<Cell> set = new HashSet<Cell>(column.getCells());
        ifwin = column.getCells().size() == set.size();
        return ifwin;
    }
    
    /**
     * Return true if there is no same elements in the subgrid, otherwise return false
     * @param  row The row needs to be tested
     * @return True if there is no same elements in the subgrid, otherwise return false

     */
    public boolean testColumn(SubGrid subgrid)
    {
        HashSet<Cell> set = new HashSet<Cell>(subgrid.getCells());
        ifwin = subgrid.getCells().size() == set.size();
        return ifwin;
    }
    
    public boolean testAll(Grid grid){
        return true;
    }
}
