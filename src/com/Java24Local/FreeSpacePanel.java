package com.Java24Local;

import java.io.IOException;
import java.nio.file.*;
import javax.swing.*;

public class FreeSpacePanel extends JPanel {
    JLabel spaceLabel = new JLabel("Disk space: ");
    JLabel space = new JLabel();

    public FreeSpacePanel() {
        super();
        add(spaceLabel);
        add(space);
        try {
            setValue();
        } catch (IOException ioe) {
            space.setText("Error");
        }
    }

    private final void setValue() throws IOException {
        // get the current file storage pool
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);
        // find the free storage space
        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();
        // get this as a percentage (with two digits)
        double percent = (double)freeSpace / (double)totalSpace * 100;
        percent = (int)(percent * 100) / (double)100;
        // set the label's text
//        space.setText(freeSpace + " free out of " + totalSpace + " ("
//            + percent + "%)");
        space.setText(getValueWithCommas(freeSpace) + " free out of " +
                getValueWithCommas(totalSpace) + " (" + percent + "%)");

        }
        private String getValueWithCommas(long value) {
            String input = "" + value;
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if ((input.length()- i) % 3 == 0) {
                    /* The mod operator % produces the remainder of a division,
                       so it can be used to display a comma preceding the 3rd
                       digit, 6th digit, 9th digit and so on. */
                    output.append(",");
                }
                output.append(input.charAt(i));
            }
            return output.toString();
        }
     
}
