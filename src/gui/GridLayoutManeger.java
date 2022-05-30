package gui;

import model.Grid;

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
     * creats the grid you play on.
     * initialys JLabel.
     * assigns JTestFiels and JLabels in the sudoku.
     * @param grid the grid you play on
     * @return mainCenter
     */
    public JPanel createGrid(Grid grid) {
        
        JPanel mainCenter = new JPanel(new GridLayout(9, 9));

        int[][] sudoku = new int[9][9];
        int pos = 0;
        for (int i = 0; i < grid.getCells().size(); i++) {
            sudoku[pos][i % 9] = grid.getCells().get(i).getValue();
            if (i % 9 == 8) {
                pos++;
            }
        }
        

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
