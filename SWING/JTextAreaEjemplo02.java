/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;
import java.awt.Label;
import java.awt.event.*;
import javax.swing.*;
public class JTextAreaEjemplo02 implements ActionListener{    
    JLabel l1, l2;
    JTextArea area;
    JButton b;
    JTextAreaEjemplo02(){
        JFrame f = new JFrame();
        l1 = new JLabel();
        l1.setBounds(50,50,100,30);
        l2 = new JLabel();
        l2.setBounds(160, 50, 100, 30);
        area = new JTextArea();
        area.setBounds(20,100,300,300);
        b = new JButton("Contador de Palabras");
        b.setBounds(100, 400, 150, 50);
        b.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
        f.setSize(400,450);
        f.setLayout(null);
        f.setVisible(true);        
    }
    public void actionPerformed(ActionEvent e){
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("Palabras: "+words.length);
        l2.setText("Caracteres: "+text.length());
    }
    public static void main(String[] args) {
        new JTextAreaEjemplo02();
    }
}
