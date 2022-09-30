package SWING;

import javax.swing.*;
import java.awt.*;

public class JPanelEjemplo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Ejemplo");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame Swing");
        JButton button = new JButton();
        button.setText("Boton");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(200,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
