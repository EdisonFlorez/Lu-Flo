package view;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;


public class Ventana extends JFrame{
    public Ventana() throws MalformedURLException {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        URL url = new URL("https://raw.githubusercontent.com/EdisonFlorez/Lu-Flo_Project/main/src/main/java/view/index.jpeg");
        ImageIcon ii = new ImageIcon(url);
        c.add(new JLabel("", ii, JLabel.CENTER));
        setSize(650 ,500);
        setVisible(true);
}

}
