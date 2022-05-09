package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AllWinTest.
 *
 * @author hech@usi.ch
<<<<<<< HEAD
 * @version 2022.05.08
=======
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 */
public class AllWinTest {
    /**
     * Default constructor for test class AllWinTest.
     */
    public AllWinTest() {
    }

    @Test
    public void testGetIfwin() {
        model.AllWin allWin1 = new model.AllWin();
        model.AllWin allWin2 = new model.AllWin();
        allWin2.changeIfwin();
        assertEquals(false, allWin1.getIfwin());
        assertEquals(true, allWin2.getIfwin());
    }

    @Test
    public void testTestAll() {
        model.Game game1 = new model.Game();
        model.Game game2 = new model.Game();
        model.Game game3 = new model.Game();
        model.AllWin allWin1 = new model.AllWin();
        game1.initialize();
        game2.initialize();
        game3.initialize();
        game2.generateSudokuSolution();
        game3.generateSudokuSolution();
        game3.changeCellValue(3, 1, 6);
        game3.changeCellValue(4, 1, 4);
        allWin1.testAll(game1.getGrid());
        allWin1.testAll(game2.getGrid());
        allWin1.testAll(game3.getGrid());
    }
}
