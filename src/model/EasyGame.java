package model;

import java.util.Random;

/**
 * EasyGame class is a childclass of Game class, which holds a method
 * to initalize itself with a easy sudoku file
 * 
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class EasyGame extends Game {
    /**
     * Initialize the EasyGame by randomly choosing a easy sudoku file.
     */
    public void initialize() {
        super.randomInitialize("easy");
    }
}
