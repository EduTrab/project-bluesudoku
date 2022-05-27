package gui;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;

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
        }; // TODO automat sudoku insertion

        // initialys JLabel
        JLabel jLabel = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2);

        // != 0 --> JLabel
        // = 0 --> JTextField
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    JTextField jTextField = new JTextField("", JTextField.CENTER);
                    jTextField.setBorder(j % 3 == 0 ? border1 : border);
                    mainCenter.add(jTextField);
                } else {
                    jLabel = new JLabel(Integer.toString(sudoku[i][j]), JLabel.CENTER);
                    jLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
                    jLabel.setBorder(j % 3 == 0 ? border1 : border);
                    mainCenter.add(jLabel);
                }

            }
        }

        return mainCenter;

    }
}
