package SWING;
import javax.swing.*;
import java.awt.event.*;
public class JPasswordEjemplo02 {
    public static void main(String[] args) {
          JFrame f = new JFrame ("Password Field Ejemplo");
          final JLabel label = new JLabel();
          label.setBounds(20, 150, 200, 50);
          final JPasswordField value = new JPasswordField();
          value.setBounds(20,20,80,30);
          JLabel l1 = new JLabel("Usuario");
          l1.setBounds(20,20,150,30);
          JLabel l2 = new JLabel("Contraseña");
          l2.setBounds(20,20,150,30);
          JButton b = new JButton("Inicio Sesion");
          b.setBounds(100,120,150,30);
          final JTextField text = new JTextField();
          text.setBounds(100,20,100,30);
          f.add(value);
          f.add(l1);
          f.add(label);
          f.add(l2);
          f.add(b);
          f.add(text);
          f.setSize(300,300);
          f.setLayout(null);
          f.setVisible(true);        
          b.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                  String data = "Usuario: " + text.getText();
                  data += " Contraseña: " + new String(value.getPassword());
                  label.setText(data);
              }
          });
    }
}
