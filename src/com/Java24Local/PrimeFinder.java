package com.Java24Local;

import java.awt.*;
import javax.swing.*;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import java.awt.event.*;
 
public class PrimeFinder extends JFrame implements Runnable, ActionListener {
    Thread go;
    JLabel howManyLabel;
    JTextField howMany;
    JButton display;
    JButton stop;
    JTextArea primes;
 
    public PrimeFinder() {
        super("Find Prime Numbers");
        setLookAndFeel();
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        
        howManyLabel = new JLabel("Quantity: ");
        howMany = new JTextField("400", 10);
        display = new JButton("Display primes");
        stop = new JButton("Stop Calculating");
        primes = new JTextArea(8, 40);
         
        display.addActionListener(this); 
        stop.addActionListener(this); 
        JPanel topPanel = new JPanel();
        topPanel.add(howManyLabel);
        topPanel.add(howMany);
        topPanel.add(display);
        topPanel.add(stop);
        add(topPanel, BorderLayout.NORTH);
        
//        stop.addActionListener(new ActionListener(this));
         
        primes.setLineWrap(true);
        JScrollPane textPane = new JScrollPane(primes);
        add(textPane, BorderLayout.CENTER);
         
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent event) {
        if (event.getSource()==display){
        	display.setEnabled(false);
        	stop.setEnabled(true);
        	if (go == null) {
            primes.setText(null);
        	go = new Thread(this);
            go.start();
        	}
        }
        if (event.getSource()==stop){
        	if (go != null) {
        	go.stop();
        	go = null;
        	display.setEnabled(true);
        	stop.setEnabled(false);
        	}
        }
     }
    

 
    public void run() {
        int quantity = Integer.parseInt(howMany.getText());
        int numPrimes = 0;
        // candidate: the number that might be prime
        int candidate = 2;
        primes.append("First " + quantity + " primes:");
        while (numPrimes < quantity) {
            if (isPrime(candidate)) {
                primes.append(candidate + " ");
                numPrimes++;
            }
            candidate++;
            try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
 
    public static boolean isPrime(int checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
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

    public static void main(String[] arguments) {
        new PrimeFinder();
    }
}
