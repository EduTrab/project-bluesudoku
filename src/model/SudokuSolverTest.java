package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class SudokuSolverTest.
 *
 * @author Chengjiang He
 * @version 2022.05.26
 */
public class SudokuSolverTest {
    /**
     * Default constructor for test class SudokuSolverTest
     */
    public SudokuSolverTest() {
    }

    @Test
    public void testGetGridSize() {
        
    }

    @Test
    public void testSolver()
    {
        model.SudokuSolver sudokuSo1 = new model.SudokuSolver();
        model.Game game1 = new model.Game();
        model.EasyGame easyGame1 = new model.EasyGame();
        easyGame1.initialize();
        sudokuSo1.initialize(easyGame1.getGrid());
        sudokuSo1.getSudoku();
    }
}

