package com.Java24Local;

import java.awt.*;
import javax.swing.*;
 
public class NewMadness extends JFrame {

    // set up row 1
    JPanel row1 = new JPanel();
//    String[] pickStrings = { "Quick Pick", "Personal" };
    JComboBox pick = new JComboBox();
    
    


    // set up row 2
    JPanel row2 = new JPanel();
    JLabel numbersLabel = new JLabel("Your picks: ", JLabel.RIGHT);
    JTextField[] numbers = new JTextField[6];
    JLabel winnersLabel = new JLabel("Winners: ", JLabel.RIGHT);
    JTextField[] winners = new JTextField[6];
    // set up row 3
    JPanel row3 = new JPanel();
    ButtonGroup option = new ButtonGroup();
    JCheckBox stop = new JCheckBox("Stop", false);
    JCheckBox play = new JCheckBox("Play", false);
    JCheckBox reset = new JCheckBox("Reset", false);

    // set up row 4
    JPanel row4 = new JPanel();
    JLabel got3Label = new JLabel("3 of 6: ", JLabel.RIGHT);
    JTextField got3 = new JTextField("0");
    JLabel got4Label = new JLabel("4 of 6: ", JLabel.RIGHT);
    JTextField got4 = new JTextField("0");
    JLabel got5Label = new JLabel("5 of 6: ", JLabel.RIGHT);
    JTextField got5 = new JTextField("0");
    JLabel got6Label = new JLabel("6 of 6: ", JLabel.RIGHT);
    JTextField got6 = new JTextField("0", 10);
    JLabel drawingsLabel = new JLabel("Drawings: ", JLabel.RIGHT);
    JTextField drawings = new JTextField("0");
    JLabel yearsLabel = new JLabel("Years: ", JLabel.RIGHT);
    JTextField years = new JTextField();
 
    public NewMadness() {
        super("Lotto Madness");
         
        setSize(550, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        setLayout(layout);
        
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER,
            10, 10);
        row1.setLayout(layout1);
        pick.addItem("Quick Pick");
        pick.addItem("Personal");
        add(pick);
        add(row1);
 
        GridLayout layout2 = new GridLayout(2, 7, 10, 10);
        row2.setLayout(layout2);
        row2.add(numbersLabel);
        for (int i = 0; i < 6; i++) {
            numbers[i] = new JTextField();
            row2.add(numbers[i]);
        }
        row2.add(winnersLabel);
        for (int i = 0; i < 6; i++) {
            winners[i] = new JTextField();
            winners[i].setEditable(false);
            row2.add(winners[i]);
        }
        add(row2);
 
        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER,
            10, 10);
        option.add(stop);
        option.add(play);
        option.add(reset);
        row3.setLayout(layout3);
        row3.add(stop);
        row3.add(play);
        row3.add(reset);
        add(row3);
 
        GridLayout layout4 = new GridLayout(2, 3, 20, 10);
        row4.setLayout(layout4);
        row4.add(got3Label);
        got3.setEditable(false);
        row4.add(got3);
        row4.add(got4Label);
        got4.setEditable(false);
        row4.add(got4);
        row4.add(got5Label);
        got5.setEditable(false);
        row4.add(got5);
        row4.add(got6Label);
        got6.setEditable(false);
        row4.add(got6);
        row4.add(drawingsLabel);
        drawings.setEditable(false);
        row4.add(drawings);
        row4.add(yearsLabel);
        years.setEditable(false);
        row4.add(years);
        add(row4);
         
        setVisible(true);
    }
     
//    private JComboBox JComboBox(String[] pickStrings2) {
//		// TODO Auto-generated method stub
//		return null;
//	}

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
        NewMadness.setLookAndFeel();
        NewMadness frame = new NewMadness();
    }
}
