package SWING;

import javax.swing.*;
import java.awt.*;

public class JSeparatorEjemplo02 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Separador Ejemplo");
        f.setLayout(new GridLayout(0,1));
        JLabel label1 = new JLabel("Arriba Separador");
        f.add(label1);
        JSeparator sep = new JSeparator();
        f.add(sep);
        JLabel label2 = new JLabel("Inferior Separador");
        f.add(label2);
        f.setSize(400,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
