package com.Java24Local;


import java.awt.*;
import java.util.*;
import javax.swing.*;
 
// example arguments to use: "10000/255/218/128" "3000/128/128/255" "13000/0/0/255"
public class PieFrame2 extends JFrame {

    public PieFrame2(String[] arguments) {
        super("Pie Graph 2");
        setLookAndFeel();
        setSize(320, 290);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
 
        Color[] colors = new Color[arguments.length];
        PiePanel pie = new PiePanel(colors.length);
        for (String argument : arguments) {
            StringTokenizer tokens = new StringTokenizer(argument, "/");
            int value = Integer.parseInt(tokens.nextToken());
            int rValue = Integer.parseInt(tokens.nextToken());
            int gValue = Integer.parseInt(tokens.nextToken());
            int bValue = Integer.parseInt(tokens.nextToken());
            Color sliceColor = new Color(rValue, gValue, bValue);
            pie.addSlice(sliceColor, value);
        }
        add(pie);
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
        if (arguments.length < 1) {
            System.out.println("Usage: PieFrame2 value/r/g/b ...");
            System.exit(-1);
        }
        PieFrame2.setLookAndFeel();
        new PieFrame2(arguments);
        
    }
}
