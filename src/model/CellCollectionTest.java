package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class cellCollectionTest.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.12
 */
public class CellCollectionTest {
    /**
     * Default constructor for test class CellCollectionTest.
     */
    public CellCollectionTest() {
    }

    @Test
    public void testTestSum() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.CellCollection subGrid1 = new model.SubGrid(game1.getGrid(), 1);
        subGrid1.initializeCollection();
        model.CellCollection cellCollection1 = new model.CellCollection(game1.getGrid(), 1);
        cellCollection1.initializeCollection();
        assertEquals(false, subGrid1.testSum());
        cellCollection1.getNumber();
        cellCollection1.getGrid();
    }

}
