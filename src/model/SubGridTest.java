package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

/**
 * The test class SubGridTest.
<<<<<<< HEAD
 * 
 * @author hech@usi.ch
 * @version 2022.05.08
=======
 *
 * @author hech@usi.ch
 * @version 2022.05.09
>>>>>>> 0091b78ff2447580070c0e74e81ef2ec5a924750
 * @version 2022.05.12
 */
public class SubGridTest {
    @Test
    public void Test1() {

    }

    @Test
    public void testConstructor() {
        model.Game game1 = new model.Game();
        game1.initialize("/Users/carsonhe/Desktop/project-bluesudoku/src/sudokuFiles/easy1.txt");
        model.SubGrid subGrid1 = new model.SubGrid(game1.getGrid(), 3);
    }
}
