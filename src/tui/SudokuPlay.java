package tui;
import java.util.Scanner;
import model.*;


/**
 * Write a description of class SudokuPlay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SudokuPlay
{

    /**
     * Constructor for objects of class SudokuPlay
     */
    public SudokuPlay()
    {
 
    }

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
}
