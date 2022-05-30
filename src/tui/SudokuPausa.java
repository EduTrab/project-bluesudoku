package tui;

import java.util.Scanner;

/**
 * This class offers a method that allows the tui pause for a while.
 *
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SudokuPausa {
    /**
     * this method halps with the experianc of the player as it creats a break in
     * the game.
     * 
     * @param scanner allows interactiv tui
     */
    public void pausa(Scanner scanner) {
        System.out.println("Click any key to continue ...");
        scanner.next();
    }
}
