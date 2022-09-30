package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserEjemplo01 extends JFrame implements ActionListener {
    JButton b;
    Container c;

    JColorChooserEjemplo01() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Color");
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Selecciona un color", initialcolor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        JColorChooserEjemplo01 ch = new JColorChooserEjemplo01();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
