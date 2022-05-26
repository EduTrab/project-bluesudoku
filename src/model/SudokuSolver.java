package model;

// this still has a few bugs need to fix it
public class SudokuSolver {
    // size of grid
    private final int GridSize = 9;
    private int[][] sudoku;
    
    public SudokuSolver () {
        
    }
    
    public int getGridSize() {
        return this.GridSize;
    }
    
    public int[][] getSudoku() {
        return this.sudoku;
    }

    public boolean solveResult() {

        // this will be our starting sudoku grd
        int[][] sudoku = {
                { 7, 0, 2, 0, 5, 0, 6, 0, 0 },
                { 0, 0, 0, 0, 0, 3, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 9, 5, 0, 0 },
                { 8, 0, 0, 0, 0, 0, 0, 9, 0 },
                { 0, 4, 3, 0, 0, 0, 7, 5, 0 },
                { 0, 9, 0, 0, 0, 0, 0, 0, 8 },
                { 0, 0, 9, 7, 0, 0, 0, 0, 5 },
                { 0, 0, 0, 2, 0, 0, 0, 0, 0 },
                { 0, 0, 7, 0, 4, 0, 2, 0, 3 }
        };

        return (boolean) solveSudoku(sudoku)[0];
        

    }

    // need some halper methods check if the number we are inputting already existes
    // in that row colum or subGrid
    // if it dose we can not place that number there --> return false
    // to do this we need 3 halper methodes check row column and subgrid

    // to see if number laready exists in row
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
    private boolean isNumberInColumn(int[][] sudoku, int number, int column) {
        for (int i = 0; i < GridSize; i++) {
            if (sudoku[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    // to see if number laready exists in subGrid
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

    private boolean isValidPlacement(int[][] sudoku, int number, int row, int column) {
        return !isNumberInRow(sudoku, number, row) &&
                !isNumberInColumn(sudoku, number, column) &&
                !isNumberInSubGrid(sudoku, number, row, column);
    }

    public Object[] solveSudoku(int[][] sudoku) {
        for (int row = 0; row < GridSize; row++) {
            for (int column = 0; column < GridSize; column++) {
                if (sudoku[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= GridSize; numberToTry++) {
                        if (isValidPlacement(sudoku, numberToTry, row, column)) {
                            sudoku[row][column] = numberToTry;

                            if ((boolean) solveSudoku(sudoku)[0]) { // recursion
                                return new Object[]{true, sudoku};
                            } else {
                                sudoku[row][column] = 0;
                            }
                        }
                    }
                    return new Object[]{false, sudoku};
                     // sudoku not solvable
                }
            }
        }
        return new Object[]{true, sudoku};
    }

}
