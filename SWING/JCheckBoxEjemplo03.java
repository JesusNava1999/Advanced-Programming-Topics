package SWING;

import javax.swing.*;
import java.awt.event.ItemListener;
import java.awt.event.*;

public class JCheckBoxEjemplo03 extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2, cb3;
    JButton b;

    JCheckBoxEjemplo03() {
        l = new JLabel("Sistema de Pedidos");
        l.setBounds(50, 50, 300, 20);
        cb1 = new JCheckBox("Hilo Dental");
        cb1.setBounds(100, 100, 150, 20);
        cb2 = new JCheckBox("Cepillo Dental");
        cb2.setBounds(100, 150, 150, 20);
        cb3 = new JCheckBox("Kanka Dental");
        cb3.setBounds(100, 200, 150, 20);
        b = new JButton("Ordenar");
        b.setBounds(100, 250, 100, 30);
        b.addActionListener(this);
        add(l);
        add(cb1);
        add(cb2);
        add(cb3);
        add(b);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (cb1.isSelected()) {
            amount += 100;
            msg = "Hilo Dental: 100\n";
        }
        if (cb2.isSelected()) {
            amount += 30;
            msg += "Cepillo Dental 30\n";
        }
        if (cb3.isSelected()){
            amount += 10;
            msg += "Kanka Dental: 10\n";
        }
        msg += "-------------------------------\n";
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
    }

    public static void main(String[] args) {
        new JCheckBoxEjemplo03();
    }
}
