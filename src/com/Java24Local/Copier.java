package com.Java24Local;

import java.io.*;

public class Copier {
    public static void main(String[] arguments) {
        if (arguments.length < 2)
            System.out.println("Usage: Copier filename1 filename2");
        else {
            try {
                File inFile = new File(arguments[0]);
                FileInputStream in = new FileInputStream(inFile);
                File outFile = new File(arguments[1]);
                FileOutputStream out = new FileOutputStream(outFile);
                boolean eof = false;
                while (!eof) {
                    int input = in.read();
                    if (input == -1) {
                        eof = true;
                    }
                    else {
                        out.write(input);
                    }
                }
                in.close();
                out.close();
            } catch (IOException e) {
                System.out.println("Error -- " + e.toString());
            }
        }
    }
}
