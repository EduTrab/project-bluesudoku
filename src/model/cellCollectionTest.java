package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class cellCollectionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CellCollectionTest
{
    /**
     * Default constructor for test class CellCollectionTest
     */
    public CellCollectionTest()
    {
    }

    @Test
    public void testTestSum()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.SubGrid subGrid1 = new model.SubGrid(game1.getGrid(), 1);
    }
}

