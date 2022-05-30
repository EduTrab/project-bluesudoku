package model;

/**
 * This class defines the conditions to win the game.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SingleKindWin {
    private boolean ifwin;
    private final SingleUnitWin singleUnitWin;
    
    /**
     * Constructor for objects of class Win.
     */

    public SingleKindWin() {
        ifwin = false;
        singleUnitWin = new SingleUnitWin();
    }

   
    /**
     * Return true if all CellCollections of this kind met the win conditional,
     * otherwise return false.
     * 
     * @param grid The current grid
     * @param kind The kind the the grid(row, column or subgrid)
     * @return True if all rows met the win conditional, otherwise return false
     */
    public boolean testSingleKind(Grid grid, String kind) {
        this.ifwin = true;
        CellCollection current;
        for (int i = 1; i < 10; i++) {
            switch (kind) {
                case "Column":
                    current = new Column(grid, i);
                    break;
                case "Row":
                    current = new Row(grid, i);
                    break;
                case "SubGrid":
                    current = new SubGrid(grid, i);
                    break;
                default :
                    current = new Column(grid, i);
                    break;
            }
            current.initializeCollection();
            this.ifwin = this.ifwin && this.singleUnitWin.testSingleUnit(current);
        }
        return this.ifwin;
    }
}
