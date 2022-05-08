package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RowTest.
 *
 * @author  Chengjiang He
 * @version 2022.05.08
 */
public class RowTest
{
    /**
     * Default constructor for test class RowTest
     */
    public RowTest()
    {
    }

    @Test
    public void testConstructor()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.Row row1 = new model.Row(game1.getGrid(), 4);
    }
}

