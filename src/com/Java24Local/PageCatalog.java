package com.Java24Local;

import java.net.*;

public class PageCatalog {
    public static void main(String[] arguments) {
        HomePage[] catalog = new HomePage[5];
        try {
            catalog[0] = new HomePage("Mark Evanier",
                "http://www.newsfromme.com", "comic books");
            catalog[1] = new HomePage("Jeff Rients",
                "http://jrients.blogspot.com", "gaming");
            catalog[2] = new HomePage("Rogers Cadenhead",
                "http://workbench.cadenhead.org", "programming");
            catalog[3] = new HomePage("Juan Cole",
                "http://www.juancole.com", "politics");
            catalog[4] = new HomePage("Rafe Colburn",
                "http://www.rc3.org");
            for (int i = 0; i < catalog.length; i++) {
                System.out.println(catalog[i].owner + ": " +
                    catalog[i].address + " -- " +
                    catalog[i].category);
            }
        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
