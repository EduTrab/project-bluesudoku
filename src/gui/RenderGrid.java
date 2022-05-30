package gui;




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
