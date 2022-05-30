package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import model.Grid;

/**
 * GridLayoutManeger.
 * 
 * @author hech@usi.ch
 * @author trabae@usi.ch
 * @version 27.05.2022
 */

public class GridLayoutManeger {

    /**
     * TODO.
     * 
     * @return MainCenter
     */
    public JPanel createGrid(Grid grid) {
        // TODO add param to createGride once it is automated(greats grids input)
        JPanel mainCenter = new JPanel(new GridLayout(9, 9));

        int[][] sudoku = new int[9][9];
        int pos = 0;
        for (int i = 0; i < grid.getCells().size(); i++) {
            sudoku[pos][i % 9] = grid.getCells().get(i).getValue();
            if (i % 9 == 8) {
                pos++;
            }
        }
        /*
         * int[][] sudoku = {
         * { 0, 9, 7, 3, 8, 1, 2, 4, 5 },
         * { 8, 1, 3, 4, 2, 5, 7, 6, 9 },
         * { 2, 4, 5, 6, 7, 9, 1, 8, 3 },
         * { 9, 3, 4, 5, 1, 8, 6, 7, 2 },
         * { 7, 6, 8, 9, 3, 2, 4, 5, 1 },
         * { 5, 2, 1, 7, 4, 6, 9, 3, 8 },
         * { 1, 7, 9, 8, 6, 3, 5, 2, 4 },
         * { 3, 5, 6, 2, 9, 4, 8, 1, 7 },
         * { 4, 8, 2, 1, 5, 7, 3, 9, 6 }
         * }; // TODO automat sudoku insertion
         */

        // initialys JLabel
        JLabel jlabel = new JLabel();
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK, 2);

        // != 0 --> JLabel
        // = 0 --> JTextField
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    JTextField jtextFieldField = new JTextField("");
                    jtextFieldField.setHorizontalAlignment(JTextField.CENTER);
                    jtextFieldField.setFont(new Font("Verdana", Font.PLAIN, 25));
                    jtextFieldField.setBorder(j % 3 == 0 ? border2 : border1);
                    mainCenter.add(jtextFieldField);
                } else {
                    jlabel = new JLabel(Integer.toString(sudoku[i][j]), JLabel.CENTER);
                    setFontAndBorder(jlabel, j, border2, border1);
                    mainCenter.add(jlabel);
                }

            }
        }

        return mainCenter;

    }
    
    public void setFontAndBorder(JLabel jtext, int x, Border border1, Border border2) {
        jtext.setFont(new Font("Verdana", Font.PLAIN, 25));
        jtext.setBorder(x % 3 == 0 ? border2 : border1);
    }
}
