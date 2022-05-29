package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class HardGameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HardGameTest
{
    /**
     * Default constructor for test class HardGameTest
     */
    public HardGameTest()
    {
    }

    @Test
    public void testHard()
    {
        model.HardGame hardGame1 = new model.HardGame();
        hardGame1.initialize();
    }
}

