package model;

/**
 * HardGame class is a childclass of Game class, which holds a method
 * to initalize itself with a hard sudoku file.
 * 
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class HardGame extends Game {
    /**
     * Initialize the HardGame by randomly choosing a hard sudoku file.
     */
    public void initialize() {
        super.randomInitialize("hard");
    }
}
