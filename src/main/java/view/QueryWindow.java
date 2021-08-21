package view;

import javax.swing.*;
import java.awt.*;

public class QueryWindow extends JFrame{
    
    public QueryWindow(){}
    public QueryWindow(String title, Object[][] data, String[] column_names, String description_query){
        JFrame frame = new JFrame("Consulta " + title);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		frame.setSize(900,600);
        
        JPanel header = new JPanel();
        JLabel description = new JLabel(description_query);
     

        JTable table_content = new JTable(data, column_names);
        JScrollPane table_pane = new JScrollPane(table_content);
        
        header.add(description);
        
        frame.add(BorderLayout.NORTH, header);
        frame.add(BorderLayout.CENTER, table_pane);
        frame.add(BorderLayout.SOUTH, new JLabel("Acá van los botones"));
        frame.setVisible(true);
    }
}