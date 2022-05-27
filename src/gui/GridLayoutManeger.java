package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;


import java.awt.GridLayout;

public class GridLayoutManeger {

    public JPanel createGrid() {
        // TODO add param to createGride once it is automated(greats grids input)
        JPanel mainCenter = new JPanel(new GridLayout(9, 9));

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
        }; //TODO automat sudoku insertion

        // initialys JLabel
        JLabel jLabel = new JLabel();
        // != 0 --> JLabel
        // = 0 --> JTextField
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    mainCenter.add(new JTextField("", JTextField.CENTER));
                } else {
                    jLabel = new JLabel(Integer.toString(sudoku[i][j]),JLabel.CENTER);
                    jLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
                    mainCenter.add(jLabel);
                }

            }
        }
        return mainCenter;

    }
}
