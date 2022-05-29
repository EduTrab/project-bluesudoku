package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

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
    public JPanel createGrid() {
        // TODO add param to createGride once it is automated(greats grids input)
        JPanel mainCenter = new JPanel(new GridLayout(9, 9));

        int[][] sudoku = {
                { 0, 9, 7, 3, 8, 1, 2, 4, 5 },
                { 8, 1, 3, 4, 2, 5, 7, 6, 9 },
                { 2, 4, 5, 6, 7, 9, 1, 8, 3 },
                { 9, 3, 4, 5, 1, 8, 6, 7, 2 },
                { 7, 6, 8, 9, 3, 2, 4, 5, 1 },
                { 5, 2, 1, 7, 4, 6, 9, 3, 8 },
                { 1, 7, 9, 8, 6, 3, 5, 2, 4 },
                { 3, 5, 6, 2, 9, 4, 8, 1, 7 },
                { 4, 8, 2, 1, 5, 7, 3, 9, 6 }
        }; // TODO automat sudoku insertion

        // initialys JLabel
        JLabel jlabel = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2);

        // != 0 --> JLabel
        // = 0 --> JTextField
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    JTextField jtextFieldField = new JTextField("", JTextField.CENTER);
                    jtextFieldField.setBorder(j % 3 == 0 ? border1 : border);
                    mainCenter.add(jtextFieldField);
                } else {
                    jlabel = new JLabel(Integer.toString(sudoku[i][j]), JLabel.CENTER);
                    jlabel.setFont(new Font("Verdana", Font.PLAIN, 25));
                    jlabel.setBorder(j % 3 == 0 ? border1 : border);
                    mainCenter.add(jlabel);
                }

            }
        }

        return mainCenter;

    }
}
