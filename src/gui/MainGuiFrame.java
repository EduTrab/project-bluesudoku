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

public class MainGuiFrame extends JFrame{
    private static final boolean RIGHT_TO_LEFT = false;

    private Game game;
    GameGuiFrame gameGuiFrame;

   
    
    public void mainGUI() {
        // Create and set up the window.
        this.setTitle("BlueSudoku");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(750, 750));
        this.setPreferredSize(new Dimension(750, 750));
        // frame.setLayout(null);

        // Set up the content pane.
        setupMainPane(this.getContentPane());

        // Display the window.
        this.setVisible(true);
        this.pack();

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

        final MainGuiFrame refToMain = this;

        // Listener
        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                getContentPane().removeAll();
                game = new EasyGame();
                ((EasyGame) game).initialize();
                gameGuiFrame = new GameGuiFrame(game, refToMain);
                gameGuiFrame.gameGUI();
                return;
            }
        });

        medium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                getContentPane().removeAll();
                game = new MediumGame();
                ((MediumGame) game).initialize();
                gameGuiFrame = new GameGuiFrame(game, refToMain);
                gameGuiFrame.gameGUI();
                return;
            }
        });

        hard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                getContentPane().removeAll();
                game = new HardGame();
                ((HardGame) game).initialize();
                gameGuiFrame = new GameGuiFrame(game, refToMain);
                gameGuiFrame.gameGUI();
                return;
            }
        });

        solvedSudkuGenerator.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                getContentPane().removeAll();
                game = new HardGame();
                ((HardGame) game).initialize();
                game.setGrid(new SolvedSudokuGenerator().makeSudoku());
                gameGuiFrame = new GameGuiFrame(game, refToMain);
                gameGuiFrame.gameGUI();
                return;
            }
        });

        pane.add(listPane);

    }
}