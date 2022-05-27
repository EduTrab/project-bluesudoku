package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class AllWinTest.
 *
 * @author hech@usi.ch
 * @version 2022.05.12
 */
public class AllWinTest {
    /**
     * Default constructor for test class AllWinTest.
     */
    public AllWinTest() {
    }

    @Test
    public void testisIfwin() {
        model.AllWin allWin1 = new model.AllWin();
        model.AllWin allWin2 = new model.AllWin();
        allWin2.changeIfwin();
        assertEquals(false, allWin1.isIfwin());
        assertEquals(true, allWin2.isIfwin());
    }

    @Test
    public void testTestAll() {
        model.Game game1 = new model.Game();
        model.Game game2 = new model.Game();
        model.Game game3 = new model.Game();
        model.Game game4 = new model.Game();
        model.AllWin allWin1 = new model.AllWin();
        game1.initialize("sudokuFiles/easy1.txt");
        game2.initialize("sudokuFiles/sampleSolution1.txt");
        game3.initialize("sudokuFiles/onlySubgrid.txt");
        game4.initialize("sudokuFiles/onlyColumn.txt");
        allWin1.testAll(game1.getGrid());
        allWin1.testAll(game2.getGrid());
        allWin1.testAll(game3.getGrid());
        allWin1.testAll(game4.getGrid());
    }
}
