package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class DIYGameTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DIYGameTest {
    /**
     * Default constructor for test class DIYGameTest
     */
    public DIYGameTest() {
    }

    @Test
    public void testDIY() {
        model.DIYGame dIYGame1 = new model.DIYGame();
        dIYGame1.initialize();
    }
}
