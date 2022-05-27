package gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;


public class RenderGrid {
    private JFrame frame = new JFrame("BlueSudoku");
    public void run() { // activates the gui
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                askInfoGUI();
            }
        });
    }

    private void askInfoGUI() {
        // Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(123,50,250)); // rgb color this will change color of backgroud
        frame.setMinimumSize(new Dimension(1000, 1000));
        frame.setPreferredSize(new Dimension(1000, 1000));
        
        
        
        // Set up the content pane.
        setupPane(frame.getContentPane());
        
        // Display the window.
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public void setupPane(Container pane) {

        // pane.add(new JLabel("test"));
        
        BorderLayout borderLayout = new BorderLayout();//
        JPanel main = new JPanel();
        main.setLayout(borderLayout);
        
        //North
        JLabel title = new JLabel("BlueSudoku", JLabel.CENTER);
        main.add(title, BorderLayout.NORTH);

        //South
        FlowLayout flowLayout = new FlowLayout();
        JPanel mainSouth = new JPanel();
        mainSouth.setLayout(flowLayout);
        main.add(mainSouth, BorderLayout.SOUTH);
        
        mainSouth.add(new JButton("Button 1"));
        mainSouth.add(new JButton("Button 2"));

        //Center
        JPanel centerLayoutPanel = new GridLayoutManeger().createGrid();
        //new GridLayout(9,9); // have to spacify amount of rows and colums
        main.add(centerLayoutPanel, BorderLayout.CENTER);






        pane.add(main);
    }

}
