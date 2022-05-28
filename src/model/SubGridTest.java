package model;

import org.junit.Test;

/**
 * The test class SubGridTest.
 * 
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.09
 */
public class SubGridTest {
    @Test
    public void Test1() {

    }

    @Test
    public void testConstructor() {
        model.Game game1 = new model.Game();
        game1.initialize("sudokuFiles/easy1.txt");
        model.CellCollection subGrid1 = new model.SubGrid(game1.getGrid(), 3);
        subGrid1.initializeCollection();
    }
}
