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
        Random randomGenerator = new Random();
        mediumSudokuNumber = randomGenerator.nextInt(9) + 1;
    }

    public void initialize()
    {
        String filePath = "sudokuFiles/medium" + mediumSudokuNumber + ".txt";
        super.initialize(filePath);
    }
}
