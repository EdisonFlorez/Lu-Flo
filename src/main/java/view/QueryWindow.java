package view;

import javax.swing.*;
import java.awt.*;

public class QueryWindow extends JFrame{
  
    public QueryWindow(String title){
        JFrame frame = new JFrame("Consultas");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		frame.setSize(900,600);
        
        JPanel header = new JPanel();
        JLabel query_title = new JLabel(title);
        JLabel description = new JLabel("Acá va la descripción de la ventana.");
        
        

        String[] columnNames = {"First Name",
                                "Last Name",
                                "Sport",
                                "# of Years",
                                "Vegetarian"};

        Object[][] data = {
            {"Kathy", "Smith",
             "Snowboarding", new Integer(5), new Boolean(false)},
            {"John", "Doe",
             "Rowing", new Integer(3), new Boolean(true)},
            {"Sue", "Black",
             "Knitting", new Integer(2), new Boolean(false)},
            {"Jane", "White",
             "Speed reading", new Integer(20), new Boolean(true)},
            {"Joe", "Brown",
             "Pool", new Integer(10), new Boolean(false)}
        };
        
        JTable table_content = new JTable(data, columnNames);
        JScrollPane table_pane = new JScrollPane(table_content);
        
        header.add(query_title);
        header.add(description);
        


        frame.getContentPane().add(BorderLayout.NORTH, header);
        frame.getContentPane().add(BorderLayout.CENTER, table_pane);
        frame.getContentPane().add(BorderLayout.SOUTH, new JLabel("Acá van los botones"));
        frame.setVisible(true);
    }
}