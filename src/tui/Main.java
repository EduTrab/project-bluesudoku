package tui;

import model.Game;

import java.util.Scanner;


/**
 * text user interface.
 * 
 * @author trabae@usi.ch
 */
public class Main {
    private static int option;
    private static int column = -99;
    private static int row = -99;
    private static int value = -99;

    /**
     * this is the main funktion of the tui.
     * 
     * @param args is the main arguments of the tui
     */
    public static void main(String[] args) {

        Game game = new Game();
        game.initialize();

        while (true) {
            Scanner in = new Scanner(System.in);
            game.printGrid();
            System.out.println(
                    "Enter your choice: press 1 to choose the colum 1-9 and row 1-9 and value 1-9 ; to end the game enter 2; to check your solion enter 3");

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

    private static void play(Game game) {
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

    private static int askNum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a num fom 1 to 9...");

        int res = Integer.parseInt(in.next());

        return res;
    }

    /**
     * this method gives instructions to the user.
     */
    public static void askForNumbers() {
        System.out.println(
                "Enter 3 numbers from 1-9 first number = your colum; second number = row; third number = value:");
    }

    /**
     * this method halps with the experianc of the player as it creats a break in
     * the game.
     * 
     * @param scanner allows interactiv tui
     */
    public static void pausa(Scanner scanner) {
        System.out.println("Click any key to continue ...");
        scanner.next();
    }
}
