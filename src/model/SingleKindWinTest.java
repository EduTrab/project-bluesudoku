package model;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SingleKindWinTest.
 *
 * @author  Chengjiang He
 * @version 2022,05.08
 */
public class SingleKindWinTest
{
    /**
     * Default constructor for test class SingleKindWinTest
     */
    public SingleKindWinTest()
    {
    }

    @Test
    public void testGetIfwin()
    {
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.getIfwin());
    }

    @Test
    public void testTestAllRows()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testAllRows(game1.getGrid()));
    }
    
    @Test
    public void testTestAllColumns()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testAllColumns(game1.getGrid()));
    }
    

    @Test
    public void testTestAllSubGrids()
    {
        model.Game game1 = new model.Game();
        game1.initialize();
        model.SingleKindWin singleKi1 = new model.SingleKindWin();
        assertEquals(false, singleKi1.testAllSubGrids(game1.getGrid()));
    }
}



