package model;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GridTest.
 *
 * @author  Chengjiang He
 * @version 2022.04.28
 */
public class GridTest
{
    /**
     * Default constructor for test class GridTest
     */
    public GridTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testGetCells()
    {
        model.Grid grid1 = new model.Grid();
        model.Cell cell1 = new model.Cell(1, 4);
        model.Cell cell2 = new model.Cell(7, 9, 9);
        grid1.addCell(cell1);
        grid1.addCell(cell2);
        assertEquals(cell1, grid1.getCells().get(0));
        assertEquals(cell2, grid1.getCells().get(1));
    }
}

