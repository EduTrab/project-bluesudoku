package model;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RowTest.
 *
 * @author  Chengjiang He
 * @version 2022.05.08
 */
public class RowTest
{
    /**
     * Default constructor for test class RowTest
     */
    public RowTest()
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
        game1.initialize();
        model.Row row1 = new model.Row(game1.getGrid(), 4);
    }
}

