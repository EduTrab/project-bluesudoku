package gui;

import model.AllWin;
import model.Game;
import model.Grid;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * GameGuiFrame showcasts the gui pane where you can play the game.
 * 
 * <p>GameGuiFrame class has 1 field. the game is the main game 
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */
public class GameGuiFrame extends JFrame {
    private final Game game;
    private final MainGuiFrame mainGuiFrame;

    /**
     * initializes the gamegui.
     * 
     * @param game is the game on wich you will play
     * @param frame to creat the link between the game-main frame
     */
    public GameGuiFrame(Game game, MainGuiFrame frame) {
        super();
        this.mainGuiFrame = frame;
        this.game = game;
    }

    /**
     *  creats and set up the window
     *  Set up the content pane.
     * Display the window.
     */
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

        // // North
        // JLabel title = new JLabel("BlueSudoku", JLabel.CENTER);
        // main.add(title, BorderLayout.NORTH);

        // South
        FlowLayout flowLayout = new FlowLayout();
        JPanel mainSouth = new JPanel();
        mainSouth.setLayout(flowLayout);
        main.add(mainSouth, BorderLayout.SOUTH);

        JButton check = new JButton("CHECK");
        mainSouth.add(check);
        JButton menue = new JButton("MENU");
        mainSouth.add(menue);

        // Center
        final JPanel centerLayoutPanel = new GridLayoutManeger().createGrid(game.getGrid());
        // new GridLayout(9,9); // have to spacify amount of rows and colums
        main.add(centerLayoutPanel, BorderLayout.CENTER);

        

        // Listeners

        final JFrame thisPane = this;
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {

                int[][] sudoku = getRealTimeSuoduku(centerLayoutPanel);
                

                Grid grid = new Grid();
                grid.initializeGrid(sudoku);
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
