package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class MediumGameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MediumGameTest
{
    /**
     * Default constructor for test class MediumGameTest
     */
    public MediumGameTest()
    {
    }

    @Test
    public void testMedium()
    {
        model.MediumGame mediumGa1 = new model.MediumGame();
        mediumGa1.initialize();
    }
}

