package com.Java24Local;

import javax.swing.*;
import java.awt.*;

public class PlaybackWToolBar extends JFrame {
	public PlaybackWToolBar() {
		super("Playback");
		setLookAndFeel();
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        // build toolbar buttons
        ImageIcon image1 = new ImageIcon("newfile.gif");
        JButton button1 = new JButton(image1);
        ImageIcon image2 = new ImageIcon("openfile.gif");
        JButton button2 = new JButton(image2);
        ImageIcon image3 = new ImageIcon("savefile.gif");
        JButton button3 = new JButton(image3);
         
        // build toolbar
        JToolBar bar = new JToolBar();
        bar.add(button1);
        bar.add(button2);
        bar.add(button3);
		
        JPanel buttonRow = new JPanel();
        JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		buttonRow.add(play);
		buttonRow.add(stop);
		buttonRow.add(pause);
        
		FlowLayout buttonsFlo = new FlowLayout();
		buttonRow.setLayout(buttonsFlo);
		
		BorderLayout border = new BorderLayout();
        setLayout(border);
        add("South", bar);
        add("Center", buttonRow);
		
		setVisible(true);
	}


	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
					);
		} catch (Exception exec) {
			// ignore error
		}
	}	
	
	
	public static void main (String[] args) {
		PlaybackWToolBar frame = new PlaybackWToolBar();
		
	}

}
