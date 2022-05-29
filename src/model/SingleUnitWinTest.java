package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class SingleUnitWinTest.
 * 
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SingleUnitWinTest {
    /**
     * Default constructor for test class SingleUnitWinTest
     */
    public SingleUnitWinTest() {
    }

    @Test
    public void testTestRow() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.CellCollection row1 = new model.Row(game1.getGrid(), 1);
        row1.initializeCollection();
        model.SingleUnitWin singleUn1 = new model.SingleUnitWin();
        assertEquals(false, singleUn1.testSingleUnit(row1));
    }

    @Test
    public void testTestColumn() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.CellCollection column1 = new model.Column(game1.getGrid(), 1);
        column1.initializeCollection();
        model.SingleUnitWin singleUn1 = new model.SingleUnitWin();
        assertEquals(false, singleUn1.testSingleUnit(column1));
    }

    @Test
    public void testTestSubGrid() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.CellCollection subGrid1 = new model.SubGrid(game1.getGrid(), 1);
        subGrid1.initializeCollection();
        model.SingleUnitWin singleUn1 = new model.SingleUnitWin();
        assertEquals(false, singleUn1.testSingleUnit(subGrid1));
    }

    @Test
    public void testGetIfwin() {
        model.SingleUnitWin singleUn1 = new model.SingleUnitWin();
        assertEquals(false, singleUn1.getIfwin());
    }
}
