package model;

import java.util.Random;


/**
 * Write a description of class mediumGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediumGame extends Game
{
    // instance variables - replace the example below with your own
    private int mediumSudokuNumber;

    /**
     * Constructor for objects of class mediumGame
     */
    public MediumGame()
    {
        super();
    }

    public void initialize()
    {
        super.randomInitialize("medium");
    }
}
