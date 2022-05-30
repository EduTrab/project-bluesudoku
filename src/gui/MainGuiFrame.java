package gui;

import model.EasyGame;
import model.Game;
import model.HardGame;
import model.MediumGame;
import model.SolvedSudokuGenerator;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
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
        this.setContentPane(new JPanel() {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                graphics.drawImage(new ImageIcon("src/gui/assets/background.jpg").getImage(),
                    0,0,getWidth(),getHeight(),null);
            }
        });
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
        listPane.setOpaque(false);
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));

        // first button
        JLabel title = new JLabel("BlueSudoku");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font("Verdana", Font.BOLD, 32));
        listPane.add(title);
        listPane.add(Box.createRigidArea(new Dimension(0, 15)));

        // 2d button
        JLabel level = new JLabel("Level");
        initComponent(level, listPane);
        

        // 3d button
        JButton easy = new JButton("EASY");
        initComponent(easy, listPane);
        //

        // 4th button
        JButton medium = new JButton("MEDIUM");
        initComponent(medium, listPane);
        //

        // 5t button
        JButton hard = new JButton("HARD");
        initComponent(hard, listPane);

        // 6th button
        JButton solvedSudkuGenerator = new JButton("SOLVED SUDOKU GENERATO");
        solvedSudkuGenerator.setAlignmentX(Component.CENTER_ALIGNMENT);
        listPane.add(solvedSudkuGenerator);
        initComponent(solvedSudkuGenerator, listPane);


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

    private void initComponent(JComponent component, JPanel container) {
        component.setFont(new Font("Verdana", Font.PLAIN, 20));
        component.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(component);
        container.add(Box.createRigidArea(new Dimension(0, 5)));
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
