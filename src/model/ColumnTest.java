package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColumnTest.
 *
 * @author Chengjiang He
 * @version 2022.05.08
 */
public class ColumnTest {
    /**
     * Default constructor for test class ColumnTest
     */
    public ColumnTest() {
    }

    @Test
    public void testConstructor() {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.Column column1 = new model.Column(game1.getGrid(), 4);
    }
}