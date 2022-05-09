package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AllWinTest.
 *
 * @author hech@usi.ch
 * @version 2022.05.08
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
