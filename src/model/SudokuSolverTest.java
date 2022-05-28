package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class SudokuSolverTest.
 *
 * @author Chengjiang He
 * @version 2022.05.26
 */
public class SudokuSolverTest
{
    /**
     * Default constructor for test class SudokuSolverTest
     */
    public SudokuSolverTest()
    {
    }

    @Test
    public void testGetGridSize()
    {
        model.SudokuSolver sudokuSo1 = new model.SudokuSolver();
        assertEquals(9, sudokuSo1.getGridSize());
        assertEquals(null, sudokuSo1.getSudoku());
    }
}

