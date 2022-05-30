package gui;

import model.EasyGame;
import model.Game;
import model.HardGame;
import model.MediumGame;
import model.SolvedSudokuGenerator;

import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * MainGuiFrame showcasts the gui pane where you can choos what game you want to
 * play.
 * 
 * <p>GameGuiFrame class has 1 field. the game is the main game
 *
 * @author trabae@usi.ch
 * @author hech@usi.ch
 * @version 2022.05.29
 */

public class MainGuiFrame extends JFrame {
    private static final boolean RIGHT_TO_LEFT = false;

    /**
     * creats and set up the window
     * Set up the content pane.
     * Display the window.
     */
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
        pane.setLayout(new GridBagLayout());

        JPanel listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));

        // first button
        JLabel title = new JLabel("BlueSudoku");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("Verdana", Font.PLAIN, 25));
        listPane.add(title);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 2d button
        JLabel level = new JLabel("Level");
        level.setFont(new Font("Verdana", Font.PLAIN, 20));
        level.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(level);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 3d button
        JButton easy = new JButton("EASY");
        listPane.setFont(new Font("Verdana", Font.PLAIN, 20));
        easy.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(easy);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));
        //

        // 4th button
        JButton medium = new JButton("MEDIUM");
        medium.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(medium);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));
        //

        // 5t button
        JButton hard = new JButton("HARD");
        hard.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(hard);

        // 6th button
        JButton solvedSudkuGenerator = new JButton("SOLVED SUDOKU GENERATO");
        solvedSudkuGenerator.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(solvedSudkuGenerator);

        // Listener
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                action(aaa, "Easy");
            }
        });

        medium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                action(aaa, "Medium");
            }
        });

        hard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                action(aaa, "Hard");
            }
        });

        solvedSudkuGenerator.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                action(aaa, "Solved");
            }
        });

        pane.add(listPane);

    }

    private void initGuiFrame(Game game) {
        GameGuiFrame gameGuiFrame = new GameGuiFrame(game, this);
        gameGuiFrame.gameGUI();
    }

    /**
     *  initializes the correct gome mode.
     * @param aaa is an actionEvent
     * @param difficulty the mode of game that you want to play
     */
    public void action(ActionEvent aaa, String difficulty) {
        getContentPane().removeAll();
        Game game;
        switch (difficulty) {
            case "Easy":
                game = new EasyGame();
                ((EasyGame) game).initialize();
                break;
            case "Medium":
                game = new MediumGame();
                ((MediumGame) game).initialize();
                break;
            case "Hard":
                game = new HardGame();
                ((HardGame) game).initialize();
                break;
            case "Solved":
                game = new HardGame();
                ((HardGame) game).initialize();
                game.setGrid(new SolvedSudokuGenerator().makeSudoku());
                break;
            default:
                game = new EasyGame();
                ((EasyGame) game).initialize();
                break;
        }
        initGuiFrame(game);
    }
}
