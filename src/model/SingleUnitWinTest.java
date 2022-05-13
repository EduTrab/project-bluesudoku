package model;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * The test class SingleUnitWinTest.
<<<<<<< HEAD
 * 
 * @author hech@usi.ch
 * @version 2022.05.08
=======
 *
 * @author hech@usi.ch
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 * @version 2022.05.12
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
        game1.initialize("/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/easy1.txt");
        model.Row row1 = new model.Row(game1.getGrid(), 1);
        model.SingleUnitWin singleUn1 = new model.SingleUnitWin();
        assertEquals(false, singleUn1.testRow(row1));
    }

    @Test
    public void testTestColumn() {
        model.Game game1 = new model.Game();
        game1.initialize("/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/easy1.txt");
        model.Column column1 = new model.Column(game1.getGrid(), 1);
        model.SingleUnitWin singleUn1 = new model.SingleUnitWin();
        assertEquals(false, singleUn1.testColumn(column1));
    }

    @Test
    public void testTestSubGrid() {
        model.Game game1 = new model.Game();
        game1.initialize("/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/easy1.txt");
        model.SubGrid subGrid1 = new model.SubGrid(game1.getGrid(), 1);
        model.SingleUnitWin singleUn1 = new model.SingleUnitWin();
        assertEquals(false, singleUn1.testSubGrid(subGrid1));
    }

    @Test
    public void testGetIfwin() {
        model.SingleUnitWin singleUn1 = new model.SingleUnitWin();
        assertEquals(false, singleUn1.getIfwin());
    }
}
