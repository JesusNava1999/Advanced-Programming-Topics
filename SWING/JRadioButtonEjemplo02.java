package SWING;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JRadioButtonEjemplo02 extends JFrame implements ActionListener {
    JRadioButton rb1, rb2;
    JButton b;
    JRadioButtonEjemplo02(){
        rb1 = new JRadioButton("Hombre");
        rb1.setBounds(100,50,100,30);
        rb2 = new JRadioButton("Mujer");
        rb2.setBounds(100,100,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        b = new JButton("Click");
        b.setBounds(100,150,80,30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(rb1.isSelected()){
            JOptionPane.showMessageDialog(this,"Tu eres Hombre");
        }
        if(rb2.isSelected()){
            JOptionPane.showMessageDialog(this,"Tu eres Mujer");
        }
    }

    public static void main(String[] args) {
        new JRadioButtonEjemplo02();
    }
}
