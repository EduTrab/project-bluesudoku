package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GameTest.
 *
 * @author Chengjiang He
 * @version 2022.05.08
 */
public class GameTest {
    /**
     * Default constructor for test class GameTest
     */
    public GameTest() {
    }

    @Test
    public void testConstructor() {
        model.Game game1 = new model.Game();
    }

    @Test
    public void testGetGrid() {
        model.Game game1 = new model.Game();
        game1.getGrid();
    }

    @Test
    public void testInitialize() {
        model.Game game1 = new model.Game();
        game1.initialize();
    }

    @Test
    public void testChangeCellValue() {
        model.Game game1 = new model.Game();
        game1.initialize();
        game1.changeCellValue(3, 5, 9);
    }

    @Test
    public void testEmptyCell() {
        model.Game game1 = new model.Game();
        game1.initialize();
        game1.emptyCell(3, 9);
    }

    @Test
    public void testPrintRow() {
        model.Game game1 = new model.Game();
        game1.initialize();
        game1.printRow(0, 9);
    }

    @Test
    public void testPrintGrid() {
        model.Game game1 = new model.Game();
        game1.initialize();
        game1.printGrid();
    }

    @Test
    public void testCheckWin() {
        model.Game game1 = new model.Game();
        model.Game game2 = new model.Game();
        game1.initialize();
        game2.initialize();
        game2.generateSudokuSolution();
        game1.checkWin();
        game2.checkWin();
    }
}
