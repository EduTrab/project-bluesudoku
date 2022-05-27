package model;

/**
 * A SubGrid is an array consists of 9 cell objects in the same 9x9 subgrid as
 * its elements.
 * For example subGrid1 contains cell1,1, cell2,1, cell3,1, cell1,2, cell2,2,
 * cell3,2,..., cell3,3
 * 
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.09
 */
public class SubGrid extends CellCollection {
    /**
     * Constructor for objects of class subGrid.
     * 
     * @param theGrid .
     * @param subGrid .
     */
    public SubGrid(Grid theGrid, int subGrid) {
        super(theGrid, subGrid);
        int left = (subGrid - 1) % 3;
        int down = (subGrid - 1) / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int current = (i * 9 + j) + (left * 3) + (down * 27);
                Cell objectCell = theGrid.getCells().get(current);
                this.getCells().set(i * 3 + j, objectCell);
            }
        }
    }

}