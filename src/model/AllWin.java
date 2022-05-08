package model;

import java.util.HashSet;

/**
 * This class defines the conditions to win the game.
 *
 * @author Chengjiang He
 * @version 2022.04.28
 */
public class AllWin {
    private boolean ifwin;
    private SingleKindWin singleKindWin;
    
    /**
     * Constructor for objects of class Win.
     */
    public AllWin() {
        ifwin = false;
        singleKindWin = new SingleKindWin();   
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
     * Mutator method to change the value of ifwin
     */
    public void changeIfwin() {
        this.ifwin = true;
    }

    /**
     * Return true if all win conditions are met, otherwise return false.
     * 
     * @param grid The current grid
     */
    public void testAll(Grid grid) {
        this.ifwin = this.singleKindWin.testAllRows(grid) && 
                     this.singleKindWin.testAllColumns(grid) && 
                     this.singleKindWin.testAllSubGrids(grid);
    }
}
