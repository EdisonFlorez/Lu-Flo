package view;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;


public class Ventana extends JFrame{
    public Ventana() throws MalformedURLException {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        URL url = new URL("https://i.pinimg.com/564x/64/d6/bc/64d6bc48df6c192d0391c8ed51c99079.jpg");
        ImageIcon ii = new ImageIcon("\\otra.jpg");
        c.add(new JLabel("", ii, JLabel.CENTER));
        setSize(650 ,500);
        setVisible(true);
}

}
