package model;

import java.util.Arrays;

/**
 * sudokusolver
 *
 * @author trabae@usi.ch
 * @author trabae@usi.ch
 * @version 27.05.2022
 */

// this still has a few bugs need to fix it
public class SudokuSolver {
    // size of grid
    private static final int GridSize = 9;// GRID_SIZE
    private int[][] sudoku;

    /**
     * .
     */
    public SudokuSolver() {

    }

    /**
     * .
     * 
     * @return the GridSize
     */
    public int getGridSize() {
        return this.GridSize;
    }

    /**
     * .
     * 
     * @return the sudoku
     */
    public int[][] getSudoku() {
        return this.sudoku;
    }

    /**
     * .
     * 
     * @return return if the sudoku is solvebol or not
     */
    public boolean solveResult(Grid grid) {

        // this will be our starting sudoku grd
        int[][] sudoku = new int[9][9];
        for(int i = 0; i < 8; i++){
            Arrays.fill(sudoku,this.createRowArray(grid, i));
        }

        return (boolean) solveSudoku(sudoku)[0];

    }

    // need some halper methods check if the number we are inputting already existes
    // in that row colum or subGrid
    // if it dose we can not place that number there --> return false
    // to do this we need 3 halper methodes check row column and subgrid

    // to see if number laready exists in row
    /**
     * .
     * 
     * @param sudoku the sudoku
     * @param number the number we want to insert
     * @param row    the row we want to check
     * @return false if dont find the number we are checking then return false
     */
    private boolean isNumberInRow(int[][] sudoku, int number, int row) {
        // boolean allows to return true if
        // number already exists in row and
        // false
        // if it dose not
        // params are the 1) sudoku (2
        // dimensional array) 2) int for number
        // we
        // want to check is in the row 3) int
        // for the row number we where in
        for (int i = 0; i < GridSize; i++) {
            if (sudoku[row][i] == number) {
                // if sudoku and the row that was pased in at the current colum i that its
                // iterating through if we find the
                // number we are checking return true
                return true;
            }
        }
        return false; // if dont find the number we are checking then return false
    }

    // to see if number laready exists in column similar thig as in row
    /**
     * .
     * 
     * @param sudoku the sudoku
     * @param number the number we want to insert
     * @param column the column we want to check
     * @return false if dont find the number we are checking then return false
     */
    private boolean isNumberInColumn(int[][] sudoku, int number, int column) {
        for (int i = 0; i < GridSize; i++) {
            if (sudoku[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    // to see if number laready exists in subGrid
    /**
     * .
     * 
     * @param sudoku the sudoku
     * @param number the nummber we want to insert
     * @param row    the row we want to check
     * @param column the colum we want to check
     * @return
     */
    private boolean isNumberInSubGrid(int[][] sudoku, int number, int row, int column) {
        int localRow = row - row % 3;
        int localColumn = column - column % 3;

        for (int i = localRow; i < localRow + 3; i++) {
            for (int j = localColumn; j < localColumn + 3; j++) {
                if (sudoku[i][j] == number) {
                    return true;
                }

            }

        }
        return false;
    }

    /**
     * .
     * 
     * @param sudoku sudoku
     * @param number the number we want to insert
     * @param row    the row we want to check
     * @param column the columnwe want to check
     * @return if the number is valid
     */
    private boolean isValidPlacement(int[][] sudoku, int number, int row, int column) {
        return !isNumberInRow(sudoku, number, row) &&
                !isNumberInColumn(sudoku, number, column) &&
                !isNumberInSubGrid(sudoku, number, row, column);
    }

    /**
     * .
     * 
     * @param sudoku the sudoku
     * @return solved sudoku
     */
    public Object[] solveSudoku(int[][] sudoku) {
        for (int row = 0; row < GridSize; row++) {
            for (int column = 0; column < GridSize; column++) {
                if (sudoku[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= GridSize; numberToTry++) {
                        if (isValidPlacement(sudoku, numberToTry, row, column)) {
                            sudoku[row][column] = numberToTry;

                            if ((boolean) solveSudoku(sudoku)[0]) { // recursion
                                return new Object[] { true, sudoku };
                            } else {
                                sudoku[row][column] = 0;
                            }
                        }
                    }
                    return new Object[] { false, sudoku };
                    // sudoku not solvable
                }
            }
        }
        return new Object[] { true, sudoku };
    }

    public int[] createRowArray(Grid grid, int rowNumber) {
        int[] rowArray = new int[9];
        for (int i = 0; i < 8; i++) {
            int value = grid.getCells().get(i + rowNumber * 9).getValue();
            Arrays.fill(rowArray, value);
        }
        return rowArray;
    }
}
