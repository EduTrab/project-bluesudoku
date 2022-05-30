package model;

import java.util.Random;

/**
 * HardGame class is a childclass of Game class, which holds a method
 * to initalize itself with a hard sudoku file
 * 
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class HardGame extends Game {
    /**
     * Constructor for objects of class hardGame
     */
    public HardGame() {
        super();
    }

    /**
     * Initialize the HardGame by randomly choosing a hard sudoku file.
     */
    public void initialize() {
        super.randomInitialize("hard");
    }
}
