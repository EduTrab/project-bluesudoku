package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * A SudokuReader can read the content of an external .txt file 
 * and constrcut a sudoku with integers in it.
 *
 * @hech@usi.ch
 * 2022.05.12
 */
public class SudokuReader
{
    /**
     * Constructor for objects of class SudokuReader
     */
    public SudokuReader()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param emptyList The ArrayList to store the values
     * @param filePath The path of the target .txt file
     */
    public void readSudokuFile(ArrayList<Cell> emptyList, String filePath) throws FileNotFoundException {
        InputStream sudokuFile = new FileInputStream(filePath);
        Scanner scanner = new Scanner(sudokuFile);
        int i = 0;
        while(scanner.hasNextInt()) {
            emptyList.get(i).changeValue(scanner.nextInt());
            i++;
        }
        i = 0;
    }   
}
