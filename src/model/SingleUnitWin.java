package model;

import java.util.HashSet;

/**
 * This class defines the conditions to win the game.
 * 
 * @author trabae@usi.ch
 * @author hech@usi.ch
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
     * @return ifwin True if there is no same elements in the row, otherwise return
     *         false
     */
    public boolean testRow(Row row) {
        ifwin = row.testSum();
        return this.ifwin;
    }

    /**
     * Return true if there is no same elements in the column, otherwise return
     * false.
     * 
     * @param column the column needs to be tested
     * @return this.ifwin
     */
    public boolean testColumn(Column column) {
        this.ifwin = column.testSum();
        return this.ifwin;
    }

    /**
     * Return true if there is no same elements in the subgrid, otherwise return
     * false.
     * 
     * @param subgrid the subgrid needs to be tested
     * @return ifwin
     */
    public boolean testSubGrid(SubGrid subgrid) {
        this.ifwin = subgrid.testSum();
        return this.ifwin;
    }

}
