package tui;

import java.util.ArrayList;
import model.*;

/**
 * The printer of the gui.
 *
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SudokuPrinter {
    /**
     * Constructor for objects of class sudokuPrint
     */
    public SudokuPrinter() {
    }

    /**
     * Print a single row of the grid.
     * 
     * @param start The number of the start cell of this row.
     * @param end   The number of the end cell of this row.
     */
    public void printRow(int start, int end, ArrayList<Cell> cell) {
        ArrayList<Cell> cells = cell;
        String print = "┃";
        for (int i = start; i < end; i++) {
            if (i % 3 == 2) {
                print = print + Integer.toString(cells.get(i).getValue()) + "┃";
            } else {
                print = print + Integer.toString(cells.get(i).getValue()) + "┆";
            }
        }
        System.out.println(print);
    }

    /**
     * Print the current grid.
     */

    public void printGrid(ArrayList<Cell> cell) {
        System.out.println("━━━━━━━━━━━━━━━━━━━");
        for (int i = 0, j = 9; j < 82; i = i + 9, j = j + 9) {
            printRow(i, j, cell);
            if (j < 81) {
                System.out.println(" ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄ ");
            }
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━");
    }
}
