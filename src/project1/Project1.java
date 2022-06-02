/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author mohammed abdelraouf
 */
public class Project1 extends JApplet {
    
    public  static int checker = 0 ; 
    static JFrame frame = new JFrame("Egyption league mangement system");
    static Login_page login = new Login_page();
    static admin_page admin = new admin_page();
     static playerEdit edit = new playerEdit();
     
    private static final int JFXPANEL_WIDTH_INT = 500;
    private static final int JFXPANEL_HEIGHT_INT = 600;
    private static JFXPanel fxContainer;
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        files.createFile(files.players);
        files.createFile(files.teams);
        
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
           public void run() {
                
               
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                }
                
            //    JFrame frame = new JFrame("JavaFX 2 in Swing");
               // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JApplet applet = new Project1();
                applet.init();
                
               // frame.setContentPane(applet.getContentPane());
                
              //  frame.pack();
                //frame.setLocationRelativeTo(null);
              //  frame.setVisible(true);
                
                applet.start();
            }
        });
    }
    
    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        add(fxContainer, BorderLayout.CENTER);
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            
            @Override
            public void run() {
                 login.setVisible(true);
                // frame.setVisible(false);
            }
        });
    }
    
   
            
    
}
