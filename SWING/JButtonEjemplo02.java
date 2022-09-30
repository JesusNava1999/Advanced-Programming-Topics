
package SWING;
import java.awt.event.*;
import javax.swing.*;
public class JButtonEjemplo02 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Ejemplo");
        final JTextField tf = new JTextField();
       tf.setBounds(50,50,180,20);
       JButton b = new JButton("Click Aquí");
       b.setBounds(50,100,95,30);
       b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               tf.setText("Utilizando Java Swing y AWT");
           }
       });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
  
}
