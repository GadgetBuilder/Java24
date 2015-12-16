package com.Java24Local;

import java.awt.*;

import javax.swing.*;
 
public class Crisis_Split extends JFrame {

	// Setup first panel
	JPanel DAPanel1 = new JPanel();
	ButtonGroup option = new ButtonGroup();
	JButton panicButton = new JButton("Panic");
    JButton dontPanicButton = new JButton("Don't Panic");

    // Setup second panel
	JPanel DAPanel2 = new JPanel();
	ButtonGroup BG2 = new ButtonGroup();
    JButton blameButton = new JButton("Blame Others");
    JButton mediaButton = new JButton("Notify the Media");
    JButton saveButton = new JButton("Save Yourself");
 
    public Crisis_Split() {
        super("Crisis_Split");
        setSize(550, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        setLayout(layout);
        
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        DAPanel1.setLayout(layout1);    
        DAPanel1.add(panicButton);
        DAPanel1.add(dontPanicButton);
        add(DAPanel1);
 
        FlowLayout layout2 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        DAPanel2.setLayout(layout1);    
        DAPanel2.add(blameButton);
        DAPanel2.add(mediaButton);
        DAPanel2.add(saveButton);
        add(DAPanel2);        

        setVisible(true);
    }
 
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }
 
    public static void main(String[] arguments) {
    	Crisis_Split.setLookAndFeel();
    	Crisis_Split frame = new Crisis_Split();
    }
}



