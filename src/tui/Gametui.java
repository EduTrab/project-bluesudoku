package tui;

import model.Game;

import java.util.Scanner;


/**
 * Write a description of class gametui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gametui
{
    private int option;
    private int column = -99;
    private int row = -99;
    private int value = -99;

    /**
     * this is the main funktion of the tui.
     * 
     * @param args is the main arguments of the tui
     */
    public void gametuimain() {

        Game game = new Game();
        game.initialize();

        while (true) {
            Scanner in = new Scanner(System.in);
            game.printGrid();
            System.out.println(
                    "to play the game insert 1 and press enter\n to exit the game insert 2 and press enter\n to check your solution insert 3 and press enter");

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
}

