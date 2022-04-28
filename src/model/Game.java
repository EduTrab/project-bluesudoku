package model;


/**
 * The main class of the sudoku game, which the player directly interact with.
 *
 * @author Chengjiang He
 * @version 2022.04.28
 */
public class Game
{
    // instance variables - replace the example below with your own
    private Grid grid;
    private Win win;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        this.grid = new Grid(); 
        this.win = new Win();
    }

    /**
     * TODO: An algorithm to randomly generate the values
     */
    
    /**
     * Change the value of a cell
     * @param cellNumber The object cell
     * @param value The new value
     */
    public void changeCellValue(int cellNumber, int value)
    {
        this.grid.getCells().get(cellNumber).changeValue(value);
    }
    
    /**
     * Empty a cell
     * @param cellNumber The object cell
     */
    public void emptyCell(int cellNumber)
    {
        this.changeCellValue(cellNumber, 0);
    }
    
    /**
     * TODO:If met the win conditions, show win page
     */
    public void checkWin()
    {
        this.win.testAll(this.grid);
        if(this.win.getIfwin() == true){
            // show the win page
        }
        else{
            // show "conditions are not met", continue the game
        }
    }
}
