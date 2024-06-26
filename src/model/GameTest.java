package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class GameTest.
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.19
 */
public class GameTest {
    /**
     * Default constructor for test class GameTest
     */
    public GameTest() {
    }

    @Test
    public void TestInitialize() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
    }

    @Test
    public void testChangeValue() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        game1.changeCellValue(1, 1, 1);
    }

    @Test
    public void testEmptyCell() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        game1.emptyCell(1, 1);
    }

    @Test
    public void testCheckWin() {
        model.Game game1 = new model.Game();
        model.Game game2 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        game2.initialize("sudokuFiles/sampleSolution1.txt");
        game1.checkWin();
        game2.checkWin();
        game1.getGrid();
        game1.getWin();
    }

    @Test
    public void testInvalidSudokuFile() {
        model.Game game1 = new model.Game();
        game1.initialize("123");
    }

    @Test
    public void testaiResult() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        game1.getSolver();
        assertEquals("Solved successfully!!!", game1.aiResult());
    }

    @Test
    public void testRandomInitialize() {
        model.Game game1 = new model.Game();
        game1.randomInitialize("easy");
    }

    @Test
    public void testSetGrid()
    {
        model.Game game1 = new model.Game();
        model.Grid grid1 = new model.Grid();
        game1.initialize();
        game1.setGrid(grid1);
    }
}

