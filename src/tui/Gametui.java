package tui;

import model.Cell;
import model.Game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class gametui here.
 *
 * @author trabae@usi.ch
 * @version 10/05.2022
 */
public class Gametui {
    private int option;
    private int column = -99;
    private int row = -99;
    private int value = -99;
    private Game game;

    /**
     * this creats the tui.
     * 
     * @param filePath .
     */
    public void gametuimain(String filePath) {

        this.game = new Game();
        game.initialize(filePath);

        while (true) {
            Scanner in = new Scanner(System.in);
            this.printGrid();
            System.out.println(
                    "to play the game insert 1 and press enter\nto exit the game insert 2 and press enter\nto check your solution insert 3 and press enter");

            try {
                option = Integer.parseInt(in.next());
            } catch (Exception exception) {
                continue;
            }

            if (option == 1) {
                play(game);

            } else if (option == 2) {
                break;
            } else if (option == 3) {
                game.checkWin();
                if (this.game.getWin().isIfwin() == true) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Whoops...Try it again.");
                }
                pausa(in);

            } else {
                pausa(in);
            }
        }
        System.out.println("Good bye");
    }

    private void play(Game game) {
        Scanner in = new Scanner(System.in);

        askForNumbers();
        try {
            column = Integer.parseInt(in.next());
            row = Integer.parseInt(in.next());
            value = Integer.parseInt(in.next());
        } catch (Exception exception) {
            System.out.println("Wrong input type");
            play(game);
        }

        while (!(1 <= column && column <= 9)) {
            System.out.println("Wrong column try again");
            column = askNum();
        }

        while (!(1 <= row && row <= 9)) {
            System.out.println("Wrong row try again");
            row = askNum();

        }

        while (!(1 <= value && value <= 9)) {
            System.out.println("Wrong value try again");
            value = askNum();

        }

        game.changeCellValue(column, row, value);

    }

    private int askNum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a num fom 1 to 9...");

        int res = Integer.parseInt(in.next());

        return res;
    }

    /**
     * this method gives instructions to the user.
     */
    public void askForNumbers() {
        System.out.println(
                "Enter 3 numbers from 1-9 first number = your column; second number = row; third number = value:\n please press enter after each number");
    }

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

    /**
     * Print a single row of the grid.
     * 
     * @param start .
     * @param end   .
     */
    public void printRow(int start, int end) {
        ArrayList<Cell> cells = this.game.getGrid().getCells();
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

    public void printGrid() {
        System.out.println("━━━━━━━━━━━━━━━━━━━");
        for (int i = 0, j = 9; j < 82; i = i + 9, j = j + 9) {
            printRow(i, j);
            if (j < 81) {
                System.out.println(" ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄ ");
            }
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━");
    }
}
