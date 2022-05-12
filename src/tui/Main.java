package tui;

import model.Game;

import java.util.Scanner;

/**
 * text user interface.
 * 
 * @author trabae@usi.ch
 */
public class Main {
    private Gametui gametui;

    /**
     * this is the main funktion of the tui.
     * 
     * @param args is the main arguments of the tui
     */
    /**
     * this is the main funktion of the tui.
     * 
     * @param args     is the main arguments of the tui
     * @param filePath .
     */
    public static void main(String[] args, String filePath) {
        Gametui gametui = new Gametui();
        gametui.gametuimain(filePath);
    }

}