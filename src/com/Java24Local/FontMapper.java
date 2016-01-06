package com.Java24Local;

import java.awt.*;
import java.util.*;

public class FontMapper {
    public FontMapper() {
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);
        Font da = new Font("DA", Font.ROMAN_BASELINE, 10);
        HashMap<String, Font> fonts = new HashMap<>();
        fonts.put("smallprint", courier);
        fonts.put("body", times);
        fonts.put("headline", verdana);
        fonts.put("footer", da);
        for (Map.Entry<String, Font> entry : fonts.entrySet()) {
            String key = entry.getKey();
            Font value = entry.getValue();
            System.out.println(key + ": " + value.getSize() + "-pt "
                + value.getFontName());
        }
    }
     
    public static void main(String[] arguments) {
        new FontMapper();        
    }
}
