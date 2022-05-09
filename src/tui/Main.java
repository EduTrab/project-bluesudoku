package tui;

import model.Game;

import java.util.Scanner;



/**
 * text user interface.
 * 
 * @author trabae@usi.ch
 */
public class Main {

    /**
     * this is the main funktion of the tui.
     * 
     * @param args is the main arguments of the tui
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        int colum; 
        int row; 
        int value;

        Game game = new Game();
        game.initialize();

        while (true) {
            game.printGrid();
            System.out.println(
                    "Enter your choice: press 1 to choose the colum 1-9 and row 1-9 and value 1-9 ; to end the game enter 2; to check your solion enter 3");
            option = Integer.parseInt(in.next());

            if (option == 1) {
                askForNumbers();
                colum = Integer.parseInt(in.next());
                row = Integer.parseInt(in.next());
                value = Integer.parseInt(in.next());
                game.changeCellValue(colum, row, value);
            } else if (option == 2) {
                break;
            } else if (option == 3) {
                game.checkWin();
                pausa(in);

            } else {
                pausa(in);
            }

        }
        // add a goodby messeg
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
