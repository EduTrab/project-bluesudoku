package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class SingleKindWinTest.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SingleKindWinTest {
    /**
     * Default constructor for test class SingleKindWinTest
     */
    public SingleKindWinTest() {
    }

    @Test
    public void testTestAllRows() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testSingleKind(game1.getGrid(), "Row"));
    }

    @Test
    public void testTestAllColumns() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testSingleKind(game1.getGrid(), "Column"));
        assertEquals(false, singleKi1.testSingleKind(game1.getGrid(), "123"));
    }

    @Test
    public void testTestAllSubGrids() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testSingleKind(game1.getGrid(), "SubGrid"));
    }
}
