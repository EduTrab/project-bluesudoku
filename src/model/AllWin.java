package model;



/**
 * This class defines the conditions to win the game.
 *
 * @author hech@usi.ch
<<<<<<< HEAD
 * @version 2022.04.28
=======
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
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
     * Successor method to is ifwin.
     * 
     * @return ifwin
     */
    public boolean isIfwin() {
        return this.ifwin;
    }

    /**
     * Mutator method to change the value of ifwin.
     */
    public void changeIfwin() {
        this.ifwin = true;
    }

    /**
     * Return true if all win conditions are met, otherwise return false.
     * 
     * @param grid The current grid.
     */
    public void testAll(Grid grid) {
        this.ifwin = this.singleKindWin.testAllRows(grid)
                && this.singleKindWin.testAllColumns(grid)
                && this.singleKindWin.testAllSubGrids(grid);
    }
}
