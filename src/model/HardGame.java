package model;

import java.util.Random;


/**
 * Write a description of class hardGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardGame extends Game
{
    // instance variables - replace the example below with your own
    private int hardSudokuNumber;

    /**
     * Constructor for objects of class hardGame
     */
    public HardGame()
    {
        super();
        Random randomGenerator = new Random();
        hardSudokuNumber = randomGenerator.nextInt(9) + 1;
    }

    public void initialize()
    {
        String filePath = "sudokuFiles/hard" + hardSudokuNumber + ".txt";
        super.initialize(filePath);
    }
}
