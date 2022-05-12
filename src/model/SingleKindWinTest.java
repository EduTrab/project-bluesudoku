package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

/**
 * The test class SingleKindWinTest.
 *
 * @author hech@usi.ch
<<<<<<< HEAD
 * @version 2022,05.08
=======
 * @version 2022,05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 * @version 2022.05.12
 */
public class SingleKindWinTest {
    /**
     * Default constructor for test class SingleKindWinTest
     */
    public SingleKindWinTest() {
    }

    

    @Test
    public void testTestAllRows() {
        model.Game game1 = new model.Game();
        game1.initialize("/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/easy1.txt");
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testAllRows(game1.getGrid()));
    }

    @Test
    public void testTestAllColumns() {
        model.Game game1 = new model.Game();
        game1.initialize("/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/easy1.txt");
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testAllColumns(game1.getGrid()));
    }

    @Test
    public void testTestAllSubGrids() {
        model.Game game1 = new model.Game();
        game1.initialize("/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/easy1.txt");
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testAllSubGrids(game1.getGrid()));
    }
}
