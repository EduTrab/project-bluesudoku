package model;

import java.util.Random;


/**
 * Write a description of class easyGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EasyGame extends Game
{
    // instance variables - replace the example below with your own
    private int easySudokuNumber;

    /**
     * Constructor for objects of class easyGame
     */
    public EasyGame()
    {
        super();
        Random randomGenerator = new Random();
        easySudokuNumber = randomGenerator.nextInt(9) + 1;
    }

    public void initialize()
    {
        super.randomInitialize("easy");
    }
}
