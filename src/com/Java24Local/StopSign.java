package com.Java24Local;

import javax.swing.*;

import java.awt.*;
public class StopSign extends JFrame {
 
public void paint(Graphics gr){
	super.paint(gr);
	int[] xPoints = {90, 180, 300, 390, 390, 300, 180, 90 };
	int[] yPoints = {180, 90, 90,  180,  300, 390, 390, 300 };
	int numPoints = 8;
	gr.drawPolygon(xPoints, yPoints, xPoints.length);
	gr.setColor(Color.RED);
	gr.fillPolygon(xPoints, yPoints, numPoints);
	int[] xPoints1 = {100, 190, 290, 380, 380, 290, 190, 100 };
	int[] yPoints1 = {190, 100, 100,  190,  290, 380, 380, 290 };
	int numPoints1 = 8;
	gr.drawPolygon(xPoints1, yPoints1, xPoints1.length);
	gr.setColor(Color.white);
	gr.fillPolygon(xPoints1, yPoints1, numPoints1);
	int[] xPoints2 = {120, 200, 280, 360, 360, 280, 200, 120 };
	int[] yPoints2 = {200, 120, 120,  200,  280, 360, 360, 280 };
	int numPoints2 = 8;
	gr.drawPolygon(xPoints2, yPoints2, xPoints2.length);
	gr.setColor(Color.red);
	gr.fillPolygon(xPoints2, yPoints2, numPoints2);
	gr.setColor(Color.white);
	gr.setFont(new Font("Arial", Font.BOLD, 85)); 
	gr.drawString(" Stop", 125, 260);
}
 

public static void main(String[] args){
	StopSign frame = new StopSign();
	frame.setSize(500,500);
	frame.setVisible(true);
 
}
}

