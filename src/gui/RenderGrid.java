package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.AllWin;
import model.Cell;
import model.EasyGame;
import model.Game;
import model.Grid;
import model.HardGame;
import model.MediumGame;
import model.SolvedSudokuGenerator;
import model.SudokuSolver;

// import javax.print.attribute.standard.JobHoldUntil;
// import java.awt.GridLayout;

/**
 * RenderGrid.
 * 
 * @author hech@usi.ch
 * @author trabae@usi.ch
 * @version 27.05.2022
 */

public class RenderGrid {
    final boolean RIGHT_TO_LEFT = false;
    private JFrame frame = new JFrame("BlueSudoku");
    private Game game;

    /**
     * this activates the GUI.
     */
    public void run() { // activates the gui
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mainGUI();
            }
        });
    }

    private void gameGUI() {
        // Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(750, 750));
        frame.setPreferredSize(new Dimension(750, 750));

        // Set up the content pane.
        setupPane(frame.getContentPane());

        // Display the window.
        frame.setVisible(true);
        frame.pack();

    }

    private void mainGUI() {
        // Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(750, 750));
        frame.setPreferredSize(new Dimension(750, 750));
        // frame.setLayout(null);

        // Set up the content pane.
        setupMainPane(frame.getContentPane());

        // Display the window.
        frame.setVisible(true);
        frame.pack();

    }

    /**
     * this is the first interface of the user.
     * 
     * @param pane the interface
     */
    public void setupMainPane(Container pane) {
        JPanel listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));

        // first button
        JLabel title = new JLabel("BlueSudoku");
        title.setFont(new Font("Verdana", Font.PLAIN, 25));
        listPane.add(title);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 2d button
        JLabel level = new JLabel("Level");
        level.setFont(new Font("Verdana", Font.PLAIN, 20));
        listPane.add(level);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 3d button
        JButton easy = new JButton("EASY");
        listPane.setFont(new Font("Verdana", Font.PLAIN, 20));
        listPane.add(easy);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 4th button
        JButton medium = new JButton("MEDIUM");
        listPane.add(medium);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 5t button
        JButton hard = new JButton("HARD");
        listPane.add(hard);

        // 6th button
        JButton solvedSudkuGenerator = new JButton("solved Sudoku generator");
        listPane.add(solvedSudkuGenerator);

        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        // Listener
        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println(frame.getHeight());
                System.out.println(frame.getWidth());
                System.out.println("menue");
                frame.getContentPane().removeAll();
                game = new EasyGame();
                ((EasyGame) game).initialize();
                gameGUI();
                return;
            }
        });

        medium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("menue");
                frame.getContentPane().removeAll();
                game = new MediumGame();
                ((MediumGame) game).initialize();
                gameGUI();
                return;
            }
        });

        hard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("menue");
                frame.getContentPane().removeAll();
                game = new HardGame();
                ((HardGame) game).initialize();
                gameGUI();
                return;
            }
        });

        solvedSudkuGenerator.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("menue");
                frame.getContentPane().removeAll();
                game = new HardGame();
                ((HardGame) game).initialize();
                game.setGrid(new SolvedSudokuGenerator().makeSudoku());
                gameGUI();
                return;
            }
        });

        pane.add(listPane);

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
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("check");

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

                System.out.println(res + " play again");

                JOptionPane.showMessageDialog(frame, res + " play again");

            }
        });

        menue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("menue");
                frame.getContentPane().removeAll();
                mainGUI();
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
                    } catch (NumberFormatException e) {
                        var = 0;
                    }
                } else {
                    JLabel jLabel = (JLabel) centerLayoutPanel.getComponent(pos);
                    // System.out.println(jLabel.getText() + " JLabel");
                    try { // This try catch might be unnecessary
                        var = Integer.parseInt(jLabel.getText());
                    } catch (NumberFormatException e) {
                        var = 0;
                    }
                }
                tempSudoku[i][j] = var;
            }
        }
        return tempSudoku;
    }

}
