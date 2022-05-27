package model;

import java.util.Arrays;

/**
 * sudokusolver.
 * 
 * @author hech@usi.ch
 * @author trabae@usi.ch
 * @version 27.05.2022
 */

public class SudokuCreator {

    // creat sudoku mettici dentro cosa randoica
    // chiama su sudoku il metodo solveSudoku --> sudoku.solveSudoku
    private int[][] sudoku = {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };
    private String message;

    /**
     * SudokuCreator.
     */

    public SudokuCreator() {
        this.message = "";
    }

    /**
     * get the messeg.
     * 
     * @return the messeg
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * this gets the sudoku.
     * 
     * @return the sudoku
     */
    public int[][] getSudoku() {
        return this.sudoku;
    }

    /**
     * this creats the random sudoku that will be then solved to creat and check
     * playabol sudokus.
     */
    public void makeSudoku() {
        int aaa = 0;
        int bbb = 0;
        int ccc = 0;

        do {
            aaa = (int) (Math.random() * 9);
            bbb = (int) (Math.random() * 9);
            ccc = (int) (Math.random() * 9);
        } 
        while (aaa == bbb || bbb == ccc || aaa == ccc);
        this.message = aaa + " " + bbb + " " + ccc;

        sudoku[0][0] = aaa;
        sudoku[0][1] = bbb;
        sudoku[0][2] = ccc;

    }

}