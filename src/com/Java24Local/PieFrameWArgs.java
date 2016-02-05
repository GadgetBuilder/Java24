package com.Java24Local;


import javax.swing.*;
import java.awt.*;
 
public class PieFrameWArgs extends JFrame {
    Color uneasyBeingGreen = new Color(0xCC, 0xCC, 0x99);
    Color zuzusPetals = new Color(0xCC, 0x66, 0xFF);
    Color zootSuit = new Color(0x66, 0x66, 0x99);
    Color sweetHomeAvocado = new Color(0x66, 0x99, 0x66);
    Color shrinkingViolet = new Color(0x66, 0x66, 0x99);
    Color miamiNice = new Color(0x33, 0xFF, 0xFF);
    Color inBetweenGreen = new Color(0x00, 0x99, 0x66);
    Color norwegianBlue = new Color(0x33, 0xCC, 0xCC);
    Color purpleRain = new Color(0x66, 0x33, 0x99);
    Color freckle = new Color(0x99, 0x66, 0x33);
 
    public PieFrameWArgs(String[] args) {
        super("Pie Graph with Args");
        setLookAndFeel();
        setSize(420, 390);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
 
        PiePanel pie = new PiePanel(10);
        pie.addSlice(Color.getColor(args[0]), Float.parseFloat(args[1]));
//        pie.addSlice(uneasyBeingGreen, 1350);
        pie.addSlice(zuzusPetals, 1221);
        pie.addSlice(zootSuit, 316);
        pie.addSlice(sweetHomeAvocado, 251);
        pie.addSlice(shrinkingViolet, 201);
        pie.addSlice(miamiNice, 193);
        pie.addSlice(inBetweenGreen, 173);
        pie.addSlice(norwegianBlue, 164);
        pie.addSlice(purpleRain, 143);
        pie.addSlice(freckle, 127);
        add(pie);
        System.out.println("Arg 0 is " + args[0]);
    }
   
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }
 
    public static void main(String[] args) {
        PieFrameWArgs pf = new PieFrameWArgs(args);
        System.out.println("Arg 0 is " + args[0]);
        
    }
}
