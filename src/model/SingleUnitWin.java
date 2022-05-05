package model;

import java.util.HashSet;

/**
 * This class defines the conditions to win the game.
 *
 * @author Chengjiang He
 * @version 2022.04.28
 */
public class SingleUnitWin {
    private boolean ifwin;

    /**
     * Constructor for objects of class SingleUnitWin.
     */
    public SingleUnitWin() {
        ifwin = false;
    }

    /**
     * Successor method to get ifwin.
     * 
     * @return ifwin
     */
    public boolean getIfwin() {
        return this.ifwin;
    }

    /**
     * Return true if there is no same elements in the row, otherwise return false.
     * 
     * @param row The row needs to be tested
     * @return True if there is no same elements in the row, otherwise return false
     * 
     */
    public boolean testRow(Row row) {
        ifwin = row.testSum();
        return this.ifwin;
    }

    /**
     * Return true if there is no same elements in the column, otherwise return
     * false.
     * 
     * @param row The row needs to be tested
     * @return True if there is no same elements in the column, otherwise return
     *         false
     * 
     */
    public boolean testColumn(Column column) {
        this.ifwin = column.testSum();
        return this.ifwin;
    }

    /**
     * Return true if there is no same elements in the subgrid, otherwise return
     * false.
     * 
     * @param row The row needs to be tested
     * @return True if there is no same elements in the subgrid, otherwise return
     *         false
     * 
     */
    public boolean testSubGrid(SubGrid subgrid) {
        this.ifwin = subgrid.testSum();
        return this.ifwin;
    }
}
