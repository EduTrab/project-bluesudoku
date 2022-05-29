package model;

import java.util.Random;


/**
 * Write a description of class DIYGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DIYGame extends Game
{
    // instance variables - replace the example below with your own
    private int hardSudokuNumber;

    /**
     * Constructor for objects of class DIYGame
     */
    public DIYGame()
    {
        super();
    }

    public void initialize()
    {
        super.randomInitialize("empty");
    }
}
