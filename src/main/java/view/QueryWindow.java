package view;

import javax.swing.*;
import java.awt.*;

public class QueryWindow extends JFrame{
  
    public QueryWindow(String title){
        JFrame frame = new JFrame("Consultas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setSize(900,600);
        JPanel header = new JPanel();
        JLabel query_title = new JLabel(title);
        JLabel description = new JLabel("Acá va la descripción de la ventana.");
        header.add(query_title);
        header.add(description);
        


        frame.getContentPane().add(BorderLayout.NORTH, header);
        frame.getContentPane().add(BorderLayout.SOUTH, new JLabel("Acá van los botones"));
        frame.setVisible(true);
    }
}