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

    public SudokuCreator() {
        this.message = "";
    }

    public String getMessage() {
        return this.message;
    }

    public int[][] getSudoku() {
        return this.sudoku;
    }

    public void makeSudoku() {
        int a = 0;
        int b = 0;
        int c = 0;

        do {
            a = (int) (Math.random() * 9);
            b = (int) (Math.random() * 9);
            c = (int) (Math.random() * 9);
        } while (a == b || b == c || a == c);
        this.message = a + " " + b + " " + c;

        sudoku[0][0] = a;
        sudoku[0][1] = b;
        sudoku[0][2] = c;

    }

}