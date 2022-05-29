package model;

/**
 * This class defines the conditions to win the game.
 * 
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
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
     * Return true if there is no same elements in the CellCollection, otherwise return false.
     * 
     * @param row The row needs to be tested
     * @return ifwin True if there is no same elements in the row, otherwise return
     *         false
     */
    public boolean testSingleUnit(CellCollection cellColletion) {
        ifwin = cellColletion.testSum();
        return this.ifwin;
    }

}
