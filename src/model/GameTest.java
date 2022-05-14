package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

/**
 * The test class GameTest.
 *
 * @author hech@usi.ch
<<<<<<< HEAD
 * @version 2022.05.08
=======
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 * @version 2022.05.12
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
        game1.initialize("../sudokuFiles/easy1.txt");
    }

    @Test
    public void testChangeCellValue() {
        model.Game game1 = new model.Game();
        game1.initialize("../sudokuFiles/easy1.txt");
        game1.changeCellValue(3, 5, 9);
    }

    @Test
    public void testEmptyCell() {
        model.Game game1 = new model.Game();
        game1.initialize("../sudokuFiles/easy1.txt");
        game1.emptyCell(3, 9);
    }

    @Test
    public void testPrintRow() {
        model.Game game1 = new model.Game();
        game1.initialize("../sudokuFiles/easy1.txt");
    }

    @Test
    public void testPrintGrid() {
        model.Game game1 = new model.Game();
        game1.initialize("../sudokuFiles/easy1.txt");
    }

    @Test
    public void testCheckWin() {
        model.Game game1 = new model.Game();
        model.Game game2 = new model.Game();
        game1.initialize("../sudokuFiles/easy1.txt");
        game2.initialize("../sudokuFiles/easy1.txt");
        game2.generateSudokuSolution();
        game1.checkWin();
        game2.checkWin();
    }
}
