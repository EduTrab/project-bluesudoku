package model;

/**
 * This class defines the conditions to win the game.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.09
 */
public class AllWin {
    private boolean ifwin;
    private final SingleKindWin singleKindWin;

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
        this.ifwin = this.singleKindWin.testSingleKind(grid, "Row")
                && this.singleKindWin.testSingleKind(grid, "Column")
                && this.singleKindWin.testSingleKind(grid, "SubGrid");
    }
}
