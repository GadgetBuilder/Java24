package com.Java24Local;

import javax.swing.*;

public class SalutionFrame extends JFrame {
	public SalutionFrame() {
		super("Salution mondo!");
		setLookAndFeel();
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.NimbusLookAndFeel"
					);
		} catch (Exception exc) {
			//ignore error
		}
//		public static void main(String[] arguments) {
		public static void main(String[] args) {
			SalutionFrame frame = new SalutionFrame();
		}
	}

}
