package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

/**
 * The test class RowTest.
 *
 * @author hech@usi.ch
<<<<<<< HEAD
 * @version 2022.05.08
=======
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 * @version 2022.05.12
 */
public class RowTest {
    /**
     * Default constructor for test class RowTest
     */
    public RowTest() {
    }

    @Test
    public void testConstructor() {
        model.Game game1 = new model.Game();
        game1.initialize("/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/easy1.txt");
        model.Row row1 = new model.Row(game1.getGrid(), 4);
    }
}
