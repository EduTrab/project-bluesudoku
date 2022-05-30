package model;

/**
 * A SudokuSolver can be considered as a computer player. It can try to
 * solve a given sudoku game by using exhausion.
 *
 * <p>SudokuSolver class has 2 fields. GRID_SIZE is the size of the work sudoku
 * grid. sudoku is the sudoku needs to be solved.
 *
 * @author hech@usi.ch
 * @author trabae@usi.ch
 * @version 2022.05.29
 */

public class SudokuSolver {
    private static final int GRID_SIZE = 9;// GRID_SIZE
    private int[][] sudoku = new int[9][9];

    /**
     * Initialize the SudokuSolver by create an array of int
     * according to the grid of the work sudoku.
     * 
     * @param grid The grid of the work sudoku.
     */
    public void initialize(Grid grid) {
        sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            createRowArray(grid, i);
        }
    }

    /**
     * Accessor method to get the GRID_SIZE.
     * 
     * @return the GRID_SIZE
     */
    public static int getGridSize() {
        return GRID_SIZE;
    }

    /**
     * Accessor method to get the sudoku.
     * 
     * @return the sudoku
     */
    public int[][] getSudoku() {
        int[][] returnSudoku;
        returnSudoku = this.sudoku;
        return returnSudoku;
    }

    /**
     * The check if the number which will be inserted is already exist in
     * this row.
     * 
     * @param sudoku the sudoku.
     * @param number the number we want to insert.
     * @param row    the row we want to check.
     * @return false if dont find the number we are checking then return false.
     */
    private boolean isNumberInRow(int[][] sudoku, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (sudoku[row][i] == number) {
                // if sudoku and the row that was pased in at the current colum i that its
                // iterating through if we find the
                // number we are checking return true
                return true;
            }
        }
        return false; // if dont find the number we are checking then return false
    }

    /**
     * The check if the number which will be inserted is already exist in
     * this column.
     * 
     * @param sudoku the sudoku
     * @param number the number we want to insert
     * @param column the column we want to check
     * @return false if dont find the number we are checking then return false
     */
    private boolean isNumberInColumn(int[][] sudoku, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (sudoku[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * The check if the number which will be inserted is already exist in
     * this subgrid.
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
     * Check if the number will be inserted is valid for the object cell.
     * 
     * @param sudoku sudoku
     * @param number the number we want to insert
     * @param row    the row we want to check
     * @param column the column we want to check
     * @return if the number is valid
     */
    private boolean isValidPlacement(int[][] sudoku, int number, int row, int column) {
        return !isNumberInRow(sudoku, number, row)
                && !isNumberInColumn(sudoku, number, column)
                && !isNumberInSubGrid(sudoku, number, row, column);
    }

    /**
     * Try to solve the Sudoku by using exhaution. (try all possible numbers
     * one by one)
     * 
     * @param sudoku The work sudoku
     * @return True if the sudoku is solvable. Otherwise return false.
     */
    public Object[] solveSudoku(int[][] sudoku) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (sudoku[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
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

    /**
     * Convert a single row of the work sudoku to an array of integer.
     * 
     * @param grid      The grid of the work sudoku
     * @param rowNumber The number of the object row
     */
    public void createRowArray(Grid grid, int rowNumber) {
        for (int i = 0; i < 9; i++) {
            int value = grid.getCells().get(i + rowNumber * 9).getValue();
            sudoku[rowNumber][i] = value;
        }
    }
}
