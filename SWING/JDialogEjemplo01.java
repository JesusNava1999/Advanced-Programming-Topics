package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogEjemplo01 {
    private static JDialog d;

    JDialogEjemplo01() {
        JFrame f = new JFrame();
        d = new JDialog(f, "Dialog Ejemplo", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("Si");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialogEjemplo01.d.setVisible(false);
            }
        });
        d.add( new JLabel("Presiona para continuar"));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new JDialogEjemplo01();
    }
}
