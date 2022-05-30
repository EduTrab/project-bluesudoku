package model;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolvedSudokuGeneratorTest {

    @Test
    public void Test() {
        SolvedSudokuGenerator solvedSudokuGenerator = new SolvedSudokuGenerator();
        assertTrue(solvedSudokuGenerator.makeSudoku() instanceof Grid);

    }

}
