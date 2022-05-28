package model;

/**
 * This class defines the conditions to win the game.
 *
 * @author trabae@usi.ch
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
        this.ifwin = true;
        for (int i = 1; i < 10; i++) {
            CellCollection currentRow = new Row(grid, i);
            currentRow.initializeCollection();
            this.ifwin = this.ifwin && this.singleUnitWin.testSingleUnit(currentRow);
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
        this.ifwin = true;
        for (int i = 1; i < 10; i++) {
            CellCollection currentColumn = new Column(grid, i);
            currentColumn.initializeCollection();
            this.ifwin = this.ifwin && this.singleUnitWin.testSingleUnit(currentColumn);
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
        this.ifwin = true;
        for (int i = 1; i < 10; i++) {
            CellCollection currentSubGrid = new SubGrid(grid, i);
            currentSubGrid.initializeCollection();
            this.ifwin = this.ifwin && this.singleUnitWin.testSingleUnit(currentSubGrid);
        }
        return this.ifwin;
    }
}
