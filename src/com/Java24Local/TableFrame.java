package com.Java24Local;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 
public class TableFrame extends JFrame {
    public TableFrame() {
        super("Table Frame");
        String[] columnLabels = { "First Name", "Last Name",
            "Job", "Age" };
        Object[][] tableData = {
             // row 1
             {   "Frankie", "Heck", "dental hygienist", 50}
            ,
             // row 2
               { "Mike", "Heck", "quarry manager", 51}
            ,
             // row 3
                {"Axl", "Heck", "slacker", 19}
            ,
             // row 4
               { "Sue", "Heck", "wrestlerette", 16}
            ,
             // row 5
                {"Brick", "Heck", "reader", 12}
            
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
        TableFrame frame = new TableFrame();
    }
}
