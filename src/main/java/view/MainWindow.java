package view;
import java.awt.*;

import javax.swing.*;



public class MainWindow extends JFrame{
    public MainWindow(){
        JFrame frame = new JFrame("Constructora Lu-Fló");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setSize(900,600);
	    
        //Crear un contenedor dentro del frame 
       // Container container = getContentPane();
        //container.setLayout(new BorderLayout());

        //Crear botones
        JButton button1 = new JButton("Proyectos");
        JButton button2 = new JButton("Deducibles");
        JButton button3 = new JButton("Clientes");
        
        //Crear panel
        JPanel button_box = new JPanel();
        button_box.add(button1);
        button_box.add(button2);
        button_box.add(button3);

        //crearimagen
        
        frame.getContentPane().add(BorderLayout.SOUTH, button_box);
        frame.setVisible(true);
    }
  
    /*
    
    public void createJPanel(){
        JPanel main_panel = new JPanel();

    }
    public void createBottons(){
        JButton botton1 = new JButton("Proyectos");
        JButton button2 = new JButton("Deducibles");
        JButton button3 = new JButton("Clientes");
        
    }      
*/
}
