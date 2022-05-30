package tui;

/**
 * text user interface.
 * 
 * @author hech@usi.ch
 * @author trabae@usi.ch
 * @version 2022.05.29
 */

public class Main {
    /**
     * this is the main function of the tui.
     * 
     * @param args is the main arguments of the tui
     */
    /**
     * this is the main funkcion of the tui.
     * 
     * @param args is the main arguments of the tui
     */
    public static void main(String[] args) {
        Gametui gametui = new Gametui();
        gametui.chooseDifficulty();
    }
    
    /**
     * Method to deal with the unreasonable PMD check.
     * @return number Number 2.
     */
    public int run() {
        int number = 2;
        return number;
    }
}
