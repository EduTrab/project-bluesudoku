package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class DIYGameTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiyGameTest {
    /**
     * Default constructor for test class DIYGameTest
     */
    public DiyGameTest() {
    }

    @Test
    public void testDIY() {
        model.DiyGame dIYGame1 = new model.DiyGame();
        dIYGame1.initialize();
    }
}
