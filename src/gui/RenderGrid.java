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
    // private static final boolean RIGHT_TO_LEFT = false;
    
    MainGuiFrame mainGuiFrame = new MainGuiFrame();


    /**
     * this activates the GUI.
     */
    public void run() { // activates the gui
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mainGuiFrame.mainGUI();
            }
        });
    }

    

}
