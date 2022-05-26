package model;

import java.util.Arrays;

public class SudokuCreater {

    // crea sudoku mettici dentro cosa randoica
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


    public void makeSudoku() {
        int a = 0;
        int b = 0;
        int c = 0;

        do {
            a = (int) (Math.random() * 9);
            b = (int) (Math.random() * 9);
            c = (int) (Math.random() * 9);
        }
        while (a == b || b == c || a == c);
        System.out.println(a + " " + b + " " + c);

        sudoku[0][0] = a;
        sudoku[0][1] = b;
        sudoku[0][2] = c;
        System.out.println(Arrays.deepToString(sudoku));

        System.out.println(Arrays.deepToString((int[][]) new SudokuSolver().solveSudoku(sudoku)[1]));
        
    }

}