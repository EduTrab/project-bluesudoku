package model;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GridTest.
 *
 * @author Chengjiang He
 * @version 2022.04.28
 */
public class GridTest {
    /**
     * Default constructor for test class GridTest
     */
    public GridTest() {
    }

    @Test
    public void testAddAndGetCells() {
        model.Grid grid1 = new model.Grid();
        model.Cell cell1 = new model.Cell(1, 4);
        model.Cell cell2 = new model.Cell(7, 9, 9);
        grid1.addCell(cell1);
        grid1.addCell(cell2);
        assertEquals(cell1, grid1.getCells().get(0));
        assertEquals(cell2, grid1.getCells().get(1));
    }
}
