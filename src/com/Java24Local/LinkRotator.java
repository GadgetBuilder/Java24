package com.Java24Local;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.*;
  
public class LinkRotator extends JFrame
    implements Runnable, ActionListener {
  
    String[] pageTitle = new String[6];
    URI[] pageLink = new URI[6];
    int current = 0;
    Thread runner;
    JLabel siteLabel = new JLabel();
  
    public LinkRotator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(siteLabel);
        pageTitle = new String[] {
            "Oracle's Java site",
            "Cafe au Lait",
            "JavaWorld",
            "Java in 24 Hours",
            "Sams Publishing",
            "Workbench"
        };
        pageLink[0] = getURI("http://www.oracle.com/technetwork/java");
        pageLink[1] = getURI("http://www.ibiblio.org/javafaq");
        pageLink[2] = getURI("http://www.javaworld.com");
        pageLink[3] = getURI("http://www.java24hours.com");
        pageLink[4] = getURI("http://www.samspublishing.com");
        pageLink[5] = getURI("http://workbench.cadenhead.org");
        Button visitButton = new Button("Visit Site");
        visitButton.addActionListener(this);
        add(visitButton);
        setVisible(true);
        start();
    }
  
    private URI getURI(String urlText) {
        URI pageURI = null;
        try {
            pageURI = new URI(urlText);
        } catch (URISyntaxException ex) {
            // do nothing
        }
        return pageURI;
    }
  
    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }
  
    public void run() {
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread) {
            current++;
            if (current > 5) {
                current = 0;
            }
            siteLabel.setText(pageTitle[current]);
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                // do nothing
            }
        }
    }
  
    public void actionPerformed(ActionEvent event) {
        Desktop desktop = Desktop.getDesktop();
        if (pageLink[current] != null) {
            try {
                desktop.browse(pageLink[current]);
                runner = null;
                System.exit(0);
            } catch (IOException exc) {
                // do nothing
            }
        }
    }
     
    public static void main(String[] arguments) {
        new LinkRotator();
    }
}
