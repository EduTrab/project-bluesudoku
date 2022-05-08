package model;

import java.util.ArrayList;

/**
 * A SubGrid is an array consists of 9 cell objects in the same 9x9 subgrid as
 * its elements.
 * For example subGrid1 contains cell1,1, cell2,1, cell3,1, cell1,2, cell2,2,
 * cell3,2,..., cell3,3
 *
 * @author Chengjiang He
 * @version 2022.05.08
 */
public class SubGrid extends CellCollection {
    /**
     * Constructor for objects of class subGrid.
     */
    public SubGrid(Grid theGrid, int subGrid) {
        super(theGrid, subGrid);
        int remainder = subGrid % 3;
        int quotient = subGrid / 3;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int current = i * 3 + j;
                Cell objectCell = theGrid.getCells().get(current + (remainder - 1) * 3 + quotient * 9);
                this.getCells().add(objectCell);
            }
        }
    }

}