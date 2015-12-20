package com.Java24Local;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class StockPriceTable extends JFrame {
    public StockPriceTable() {
        super("Table Frame");
        String[] columnLabels = { "Stock Name", "High Price", "Low Price", "Volume" };
        Object[][] tableData = {
             // row 1
             {   "Company1", 80.50, 20.50, 50_10}
            ,
             // row 2
               { "Company2", 90.0, 30.32, 51}
            ,
             // row 3
                {"Company3", 70.35, 10.76, 19}
            ,
             // row 4
               { "Company4", 120.25, 118.42, 16}
            ,
             // row 5
                {"Company5", 150.75, 80.96, 12}
            
        };

        JTable table = new JTable(tableData, columnLabels);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        add(scrollPane);
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
     
    public static void main(String[] arguments) {
        StockPriceTable frame = new StockPriceTable();
    }
}
