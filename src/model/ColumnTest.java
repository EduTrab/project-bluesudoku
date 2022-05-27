package model;

import org.junit.Test;

/**
 * The test class ColumnTest.
 *
 * @author trabat@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.12
 */
public class ColumnTest {
    /**
     * Default constructor for test class ColumnTest
     */
    public ColumnTest() {
    }

    @Test
    public void testConstructor() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.Column column1 = new model.Column(game1.getGrid(), 4);
    }
}