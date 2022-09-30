package AWT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swin extends JFrame implements ActionListener {
    private JLabel label1;
    JButton boton1;
    public Swin(){
        setLayout(null);
        label1 = new JLabel("Hola Mundo");
        label1.setBounds(10,20,200,30);
        add(label1);

        boton1 = new JButton("Click");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Swin formulario1 = new Swin();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
    }
}
