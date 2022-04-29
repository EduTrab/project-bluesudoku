package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CellTest.
 *
 * @author Chengjiang He
 * @version 2022.04.28
 */
public class CellTest {
    /**
     * Default constructor for test class CellTest.
     */
    public CellTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCreate() {
        model.Cell cell1 = new model.Cell(1, 3);
        model.Cell cell2 = new model.Cell(4, 5, 9);
        assertEquals(0, cell1.getValue());
        assertEquals(1, cell1.getXCoordinate());
        assertEquals(3, cell1.getYCoordinate());
        assertEquals(9, cell2.getValue());
        assertEquals(4, cell2.getXCoordinate());
        assertEquals(5, cell2.getYCoordinate());
    }

    @Test
    public void testChangeValue() {
        model.Cell cell1 = new model.Cell(4, 2, 1);
        model.Cell cell2 = new model.Cell(7, 8);
        cell1.changeValue(8);
        cell1.changeValue(0);
        cell2.changeValue(1);
        cell2.changeValue(9);
        assertEquals(0, cell1.getValue());
        assertEquals(9, cell2.getValue());
    }
}
