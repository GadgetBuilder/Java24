package com.Java24Local;

import java.awt.*;
import javax.swing.*;

public class FreeSpaceFrame extends JFrame {
    public FreeSpaceFrame() {
        super("Disk Free Space");
        setLookAndFeel();
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        FreeSpacePanel freePanel = new FreeSpacePanel();
        add(freePanel);
        setVisible(true);
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
        FreeSpaceFrame frame = new FreeSpaceFrame();
    }
}

