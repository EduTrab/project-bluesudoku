package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

/**
 * The test class cellCollectionTest.
 *
<<<<<<< HEAD
 * @author trabae@usi.ch
 * @version 2022.05.06
=======
 * @author hech@usi.ch
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
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
        model.SubGrid subGrid1 = new model.SubGrid(game1.getGrid(), 1);
        model.CellCollection cellCollection1 = new model.CellCollection(game1.getGrid(), 1);
        cellCollection1.fillTrueSum();
        assertEquals(false, subGrid1.testSum());
        assertEquals(true, cellCollection1.testSum());
    }

    @Test
    public void testFillTrueSum() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.Column column1 = new model.Column(game1.getGrid(), 1);
        column1.fillTrueSum();
    }
}
