package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AllWinTest.
 *
 * @author  Chengjiang He
 * @version 2022.05.08
 */
public class AllWinTest
{
    /**
     * Default constructor for test class AllWinTest
     */
    public AllWinTest()
    {
    }

    @Test
    public void testGetIfwin()
    {
        model.AllWin allWin1 = new model.AllWin();
        assertEquals(false, allWin1.getIfwin());
    }

    @Test
    public void testTestAll()
    {
        model.Game game1 = new model.Game();
        model.AllWin allWin1 = new model.AllWin();
    }
}


