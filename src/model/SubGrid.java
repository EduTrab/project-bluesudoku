package model;

/**
 * SubGrid is a childclass of CellCollection.
 * 
 * A SubGrid is an array consists of 9 cell objects in the same 9x9 subgrid as
 * its elements.
 * For example subGrid1 contains cell1,1, cell2,1, cell3,1, cell1,2, cell2,2,
 * cell3,2,..., cell3,3.
 * 
 * SubGrid class has 2 fields.
 * left and down are used to locate the elements of this SubGrid.
 * 
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SubGrid extends CellCollection {
    private int left;
    private int down;

    /**
     * Constructor of instances of class subGrid.
     * 
     * @param theGrid       The grid in which this SubGrid is.
     * @param subGridNumber The number of this SubGrid.
     */
    public SubGrid(Grid theGrid, int subGridNumber) {
        super(theGrid, subGridNumber);
        left = (this.getNumber() - 1) % 3;
        down = (this.getNumber() - 1) / 3;
    }

    /**
     * Intialize the SubGrid by adding corresponding cells of the Grid
     * to which this SubGrid belongs as its elements.
     * 
     * This method overrides the method with the same name of CellCollection class.
     */
    @Override
    public void initializeCollection() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int current = (i * 9 + j) + (left * 3) + (down * 27);
                Cell objectCell = getGrid().getCells().get(current);
                this.getCells().add(objectCell);
            }
        }
    }
}