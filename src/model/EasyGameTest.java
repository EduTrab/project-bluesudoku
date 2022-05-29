package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class EasyGameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EasyGameTest
{
    /**
     * Default constructor for test class EasyGameTest
     */
    public EasyGameTest()
    {
    }

    @Test
    public void testEasy()
    {
        model.EasyGame easyGame1 = new model.EasyGame();
        easyGame1.initialize();
    }
}

