package model;

import java.util.Random;

/**
 * MediumGame class is a childclass of Game class, which holds a method
 * to initalize itself with a medium sudoku file
 * 
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class MediumGame extends Game {
    /**
     * Constructor for objects of class mediumGame
     */
    public MediumGame() {
        super();
    }

    /**
     * Initialize the MediumGame by randomly choosing a medium sudoku file.
     */
    public void initialize() {
        super.randomInitialize("medium");
    }
}
