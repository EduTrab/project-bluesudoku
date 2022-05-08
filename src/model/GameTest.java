package model;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GameTest
{
    /**
     * Default constructor for test class GameTest
     */
    public GameTest()
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
    public void testConstructor()
    {
        model.Game game1 = new model.Game();
    }

    @Test
    public void testInitialize()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
    }

    @Test
    public void testChangeCellValue()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        game1.changeCellValue(3, 5, 9);
    }

    @Test
    public void testEmptyCell()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        game1.emptyCell(3, 9);
    }

    @Test
    public void testPrintRow()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        game1.printRow(0, 9);
    }

    @Test
    public void testPrintGrid()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        game1.printGrid();
    }
}






