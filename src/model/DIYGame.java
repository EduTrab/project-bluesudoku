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
        Random randomGenerator = new Random();
        hardSudokuNumber = randomGenerator.nextInt(9) + 1;
    }

    public void initialize()
    {
        String filePath = "sudokuFiles/emptySudoku.txt";
        super.initialize(filePath);
    }
}
