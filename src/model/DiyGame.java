package model;

import java.util.Random;

/**
 * DIYGame class is a childclass of Game class, which holds a method
 * to initalize itself with a empty sudoku file
 * 
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class DiyGame extends Game {
    /**
     * Initialize the DIYGame by choosing a empty sudoku file. So the users
     * can create their own sudokus.
     */
    public void initialize() {
        super.randomInitialize("empty");
    }
}
