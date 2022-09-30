package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserEjemplo02 extends JFrame implements ActionListener {
    JFrame f;
    JButton b;
    JTextArea ta;
    JColorChooserEjemplo02(){
        f = new JFrame("Seleccionador de Color Ejemplo");
        b = new JButton("Paleta Color");
        b.setBounds(200,250,200,30);
        ta = new JTextArea();
        ta.setBounds(10,10,300,200);
        b.addActionListener(this);
        f.add(b);
        f.add(ta);
        f.setLayout(null);
        f.setSize(450,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this,"Seleccionar",Color.CYAN);
        ta.setBackground(c);
    }

    public static void main(String[] args) {
        new JColorChooserEjemplo02();
    }
}
