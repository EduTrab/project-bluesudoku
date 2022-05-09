package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SubGridTest.
 *
 * @author Chengjiang He
 * @version 2022.05.08
 */
public class SubGridTest {
    @Test
    public void Test1() {

    }

    @Test
    public void testConstructor() {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.SubGrid subGrid1 = new model.SubGrid(game1.getGrid(), 3);
    }
}
