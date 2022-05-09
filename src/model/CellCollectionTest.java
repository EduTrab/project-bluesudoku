package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class cellCollectionTest.
 *
 * @author hech@usi.ch
 * @version 2022.05.09
 */
public class CellCollectionTest {
    /**
     * Default constructor for test class CellCollectionTest
     */
    public CellCollectionTest() {
    }

    @Test
    public void testTestSum() {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.SubGrid subGrid1 = new model.SubGrid(game1.getGrid(), 1);
        model.CellCollection cellCollection1 = new model.CellCollection(game1.getGrid(), 1);
        cellCollection1.fillTrueSum();
        assertEquals(false, subGrid1.testSum());
        assertEquals(true, cellCollection1.testSum());
    }

    @Test
    public void testFillTrueSum() {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.Column column1 = new model.Column(game1.getGrid(), 1);
        column1.fillTrueSum();
    }
}
