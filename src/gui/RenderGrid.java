package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
        frame.getContentPane().setBackground(new Color(123, 50, 250)); // rgb color this will change color of backgroud
        frame.setMinimumSize(new Dimension(750, 750));
        frame.setPreferredSize(new Dimension(750, 750));

        // Set up the content pane.
        setupPane(frame.getContentPane());

        // Display the window.
        frame.pack();
        frame.setVisible(true);

    }

    private void mainGUI() {
        // Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(123, 50, 250)); // rgb color this will change color of backgroud
        frame.setMinimumSize(new Dimension(750, 750));
        frame.setPreferredSize(new Dimension(750, 750));
        // frame.setLayout(null);

        // Set up the content pane.
        setupMainPane(frame.getContentPane());

        // Display the window.
        frame.pack();
        frame.setVisible(true);

    }

    /**
     * this is the first interface of the user.
     * 
     * @param pane the interface
     */
    public void setupMainPane(Container pane) {
        JPanel listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));

        listPane.setMinimumSize(new Dimension(50, 25));
        listPane.setPreferredSize(new Dimension(50, 25));

        // first button
        JLabel title = new JLabel("BlueSudoku");
        listPane.add(title);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 2d button
        JLabel level = new JLabel("Level");
        listPane.add(level);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 3d button
        JButton easy = new JButton("EASY");
        listPane.add(easy);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 4th button
        JButton medium = new JButton("MEDIUM");
        listPane.add(medium);
        listPane.add(Box.createRigidArea(new Dimension(0, 5)));

        // 5t button
        JButton hard = new JButton("HARD");
        listPane.add(hard);

        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        // Listener
        easy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("menue");
                frame.getContentPane().removeAll();
                gameGUI();
                return;
            }
        });

        medium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("menue");
                frame.getContentPane().removeAll();
                gameGUI();
                return;
            }
        });

        hard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("menue");
                frame.getContentPane().removeAll();
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
        JPanel centerLayoutPanel = new GridLayoutManeger().createGrid();
        // new GridLayout(9,9); // have to spacify amount of rows and colums
        main.add(centerLayoutPanel, BorderLayout.CENTER);

        // Listeners
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aaa) {
                System.out.println("check");
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

}
