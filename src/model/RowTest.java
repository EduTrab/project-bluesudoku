package model;

import org.junit.Test;

/**
 * The test class RowTest.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class RowTest {
    /**
     * Default constructor for test class RowTest
     */
    public RowTest() {
    }

    @Test
    public void testConstructor() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.CellCollection row1 = new model.Row(game1.getGrid(), 4);
        row1.initializeCollection();
    }
}
