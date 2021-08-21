package view;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;


public class MainWindow extends JFrame{
    public MainWindow() throws IOException{
        JFrame frame = new JFrame("Constructora Lu-Fló");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	        
		frame.setSize(900,600);
        //CrearImagen
        URL url = new URL("https://raw.githubusercontent.com/EdisonFlorez/Lu-Flo_Project/main/src/main/java/view/image.jpg");
        ImageIcon image = new ImageIcon(url);
        Font button_Font = new Font("Faustina", Font.ITALIC, 20);
        //Crear botones
        JButton button1 = new JButton("Proyectos");
        JButton button2 = new JButton("Deducibles");
        JButton button3 = new JButton("Clientes");
        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        button1.setFont(button_Font);
        button1.setForeground(Color.white);
        
        button2.setOpaque(false); 
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        button2.setFont(button_Font);
        button2.setForeground(Color.white);

        button3.setOpaque(false);
        button3.setContentAreaFilled(false);
        button3.setBorderPainted(false);
        button3.setFont(button_Font);
        button3.setForeground(Color.white);

        button1.addMouseListener(new MouseInputAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                String[] column_names = {"Id Proyecto", "Fecha Inicio", 
                                       "Entidad Bancaria", "Serial"};
                String description_query = "Se muestran los registros 5 - 11.";
                try{
                    new QueryWindow("Proyectos",new Tables().getInfoProjects(), column_names, description_query);
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
    
            }
        });

        button2.addMouseListener(new MouseInputAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                String[] column_names = {"Nombre", "Apellidos", "Salario", "Deducible"}; 
                String description_query = "Se muestran los registros con ganancias entre 500000 y 650000.";

            try{
                new QueryWindow("Deducibles",new Tables().getInfoDeductibles(), column_names, description_query);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
                                      
            }
        });

        button3.addMouseListener(new MouseInputAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                String[] column_names = {"Id Proyecto", "Nombre y Apellido"};
                String description_query = "Se muestran los registros pertenecientes a la entidad bancaria: Colpatria.";
                try{
                    new QueryWindow("Clientes",new Tables().getInfoClients(), column_names, description_query);
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
              
            }
        });

        //Crear botonera
        JPanel button_box = new JPanel();
        button_box.add(button1);
        button_box.add(button2);
        button_box.add(button3);
        button_box.setBackground(new Color(40, 40, 40));

        frame.add(new JLabel("", image, JLabel.CENTER));
        frame.add(BorderLayout.SOUTH, button_box);
        frame.setVisible(true);
    }
}
