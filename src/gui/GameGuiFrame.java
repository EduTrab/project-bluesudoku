package gui;

import model.AllWin;
import model.Cell;
import model.EasyGame;
import model.Game;
import model.HardGame;
import model.MediumGame;
import model.SolvedSudokuGenerator;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Grid;
import model.*;

public class GameGuiFrame extends JFrame {
    private final Game game;
    MainGuiFrame mainGuiFrame;

    public GameGuiFrame(Game game, MainGuiFrame frame) {
        this.mainGuiFrame = frame;
        this.game = game;
    }


    public void gameGUI() {
        // Create and set up the window.
        this.setTitle("BlueSudoku");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1000, 1000));
        this.setPreferredSize(new Dimension(1000, 1000));
        

        // Set up the content pane.
        setupPane(this.getContentPane());

        // Display the window.
        this.setVisible(true);
        this.pack();

    }

    /**
     * how the GUI layout is set up.
     * 
     * @param pane the interface
     */

    public void setupPane(Container pane) {

        // pane.add(new JLabel("test"));

        BorderLayout borderLayout = new BorderLayout();//
        JPanel main = new JPanel();
        main.setLayout(borderLayout);

        // North
        JLabel title = new JLabel("BlueSudoku", JLabel.CENTER);
        main.add(title, BorderLayout.NORTH);

        // South
        FlowLayout flowLayout = new FlowLayout();
        JPanel mainSouth = new JPanel();
        mainSouth.setLayout(flowLayout);
        main.add(mainSouth, BorderLayout.SOUTH);

        JButton check = new JButton("Check");
        mainSouth.add(check);
        JButton menue = new JButton("Menue");
        mainSouth.add(menue);

        // Center
        final JPanel centerLayoutPanel = new GridLayoutManeger().createGrid(game.getGrid());
        // new GridLayout(9,9); // have to spacify amount of rows and colums
        main.add(centerLayoutPanel, BorderLayout.CENTER);

        /*
         * first atempot
         * // West
         * res = true;
         * JLabel result = new JLabel(res + " play again", JLabel.CENTER);
         * main.add(result, BorderLayout.WEST);
         * result.setFont(new Font("Verdana", Font.PLAIN, 25));
         */

        // Listeners

        final JFrame thisPane = this;
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {

                int[][] sudoku = getRealTimeSuoduku(centerLayoutPanel);
                /*
                 * DEBUG
                 * for (int i = 0; i < 9; i++) {
                 * for (int j = 0; j < 9; j++) {
                 * System.out.print(sudoku[i][j] + " ");
                 * }
                 * System.out.println();
                 * }
                 */
                // check if the grid is correct

                Grid grid = new Grid();
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        Cell cell = new Cell(i, j, sudoku[i][j]);
                        grid.addCell(cell);
                    }
                }
                AllWin allWin = new AllWin();
                allWin.testAll(grid);
                boolean res = allWin.isIfwin();


                JOptionPane.showMessageDialog(thisPane, res + " play again");

            }
        });

        menue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                getContentPane().removeAll();
                setVisible(false);
                mainGuiFrame.setVisible(true);
                mainGuiFrame.mainGUI();
                return;
            }
        });


        pane.add(main);
    }
    private int[][] getRealTimeSuoduku(JPanel centerLayoutPanel) {

        int[][] tempSudoku = new int[9][9];
        int pos = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                pos++;// allows us to reach every element in array 2D

                int var = 0;
                if (centerLayoutPanel.getComponent(pos) instanceof JTextField) {
                    JTextField textField = (JTextField) centerLayoutPanel.getComponent(pos);
                    // System.out.println(textField.getText() + " JTextField");
                    // try catch converts iknistial string to an int
                    try {
                        var = Integer.parseInt(textField.getText());
                    } catch (NumberFormatException exeption) {
                        var = 0;
                    }
                } else {
                    JLabel jlabel = (JLabel) centerLayoutPanel.getComponent(pos);
                    // System.out.println(jLabel.getText() + " JLabel");
                    try { // This try catch might be unnecessary
                        var = Integer.parseInt(jlabel.getText());
                    } catch (NumberFormatException exeption) {
                        var = 0;
                    }
                }
                tempSudoku[i][j] = var;
            }
        }
        return tempSudoku;
    }
    
}
