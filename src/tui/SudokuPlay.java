package tui;

import model.Game;

import java.util.Scanner;


/**
 * Display the change value interface.
 *
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class SudokuPlay {
    /**
     * Display the fill number interface, which allows the users
     * change the value of a cell.
     * 
     * @param game The working sudoku game.
     */
    public void play(Game game) {
        int column = -99;
        int row = -99;
        int value = -99;
        Scanner in = new Scanner(System.in);

        askForNumbers();
        try {
            column = Integer.parseInt(in.next());
            row = Integer.parseInt(in.next());
            value = Integer.parseInt(in.next());
        } catch (NumberFormatException exception) {
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

    /**
     * Display an instruction asks the users enter the number they want
     * to insert into the cell.
     */
    private int askNum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a num fom 1 to 9...");

        int res = Integer.parseInt(in.next());

        return res;
    }

    /**
     * Give instructions to the user that explains how to choose a cell
     * and change its value.
     */
    public void askForNumbers() {
        System.out.println(
                "Enter 3 numbers from 1-9 first number = your column; second number = row; third number = value:\n please press enter after each number");
    }
}
