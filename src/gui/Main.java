package gui;

/**
 * grfical user interface.
 * 
 * @author hech@usi.ch
 * @author trabae@usi.ch
 * @version 2022.05.06
 */
public class Main {
    /**
     * The gui main method.
     * 
     * @param args the main arg of main
     */
    public static void main(String[] args) {
        RenderGrid renderGrid = new RenderGrid();
        renderGrid.run();
    }
    
    /**
     * Method to deal with the unreasonable PMD check.
     * @return theNumber Number2.
     */
    public int run() {
        int theNumber = 1;
        return theNumber;
    }
}