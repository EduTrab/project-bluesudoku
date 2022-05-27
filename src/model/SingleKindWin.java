package model;

/**
 * This class defines the conditions to win the game.
 *
 * @author hech@usi.ch
 * @version 2022.05.09
 */
public class SingleKindWin {
    private boolean ifwin;
    private SingleUnitWin singleUnitWin;

    /**
     * Constructor for objects of class Win.
     */

    public SingleKindWin() {
        ifwin = false;
        singleUnitWin = new SingleUnitWin();
    }

    /**
     * Successor method to get ifwin.
     * 
     * @return ifwin
     */
    /**
     * public boolean getIfwin() {
     * return this.ifwin;
     * }
     * Return true if all rows met the win conditional, otherwise return false.
     * 
     * @param grid The current grid
     * @return True if all rows met the win conditional, otherwise return false
     */
    public boolean testAllRows(Grid grid) {
        for (int i = 1; i < 10; i++) {
            Row currentRow = new Row(grid, i);
            this.ifwin = this.singleUnitWin.testRow(currentRow);
        }
        return this.ifwin;
    }

    /**
     * Return true if all columns met the win conditional, otherwise return false.
     * 
     * @param grid The current grid
     * @return True if all columns met the win conditional, otherwise return false
     */
    public boolean testAllColumns(Grid grid) {
        for (int i = 1; i < 10; i++) {
            Column currentColumn = new Column(grid, i);
            this.ifwin = this.singleUnitWin.testColumn(currentColumn);
        }
        return this.ifwin;
    }

    /**
     * Return true if all subgrids met the win conditional, otherwise return false.
     * 
     * @param grid The current grid
     * @return True if all subgrids met the win conditional, otherwise return false
     */
    public boolean testAllSubGrids(Grid grid) {
        for (int i = 1; i < 10; i++) {
            SubGrid currentSubGrid = new SubGrid(grid, i);
            this.ifwin = this.singleUnitWin.testSubGrid(currentSubGrid);
        }
        return this.ifwin;
    }
}
