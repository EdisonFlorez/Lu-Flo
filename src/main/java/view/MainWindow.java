import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame{
    public MainWindow(){
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel main_panel = new JPanel();
        main_panel.add(new JLabel("label"));
        c.add(main_panel);
        setSize(700, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainWindow();
    }
    
    
    public void createJPanel(){
        JPanel main_panel = new JPanel();

    }
    public void createBottons(){
        JButton botton1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        
        
    } 
}