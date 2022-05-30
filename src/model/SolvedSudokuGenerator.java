package model;

import java.util.Arrays;

public class SolvedSudokuGenerator {

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

    public Grid makeSudoku() {
        int aaa = 0;
        int bbb = 0;
        int ccc = 0;

        do {
            aaa = (int) (Math.random() * 9);
            bbb = (int) (Math.random() * 9);
            ccc = (int) (Math.random() * 9);
        } while (aaa == bbb || bbb == ccc || aaa == ccc);
        // this would show what a b adn c where randomly generated System.out.println(a + " " + b + " " + c);

        sudoku[0][0] = aaa;
        sudoku[0][1] = bbb;
        sudoku[0][2] = ccc;
        // this would show the sudoku the random sudoku generator would have to solve:
        // --> System.out.println(Arrays.deepToString(sudoku));

        // a system out print would show the solved sudoku:
        Arrays.deepToString((int[][]) new SudokuSolver().solveSudoku(sudoku)[1]);

        Grid grid = new Grid();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Cell cell = new Cell(i, j, sudoku[i][j]);
                grid.addCell(cell);
            }
        }
        return grid;
    }

}
