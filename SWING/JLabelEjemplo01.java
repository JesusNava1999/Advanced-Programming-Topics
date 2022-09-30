
package SWING;
import javax.swing.*;
public class JLabelEjemplo01 {
    public static void main(String[] args) {
       JFrame f = new JFrame("Label Ejemplo");
        JLabel l1,l2;
        l1 = new JLabel("Primer Label");
        l1.setBounds(50,50,100,30);
        l2 = new JLabel("Segundo Label");
        l2.setBounds(50, 100, 100, 30);
        f.add(l1);
        f.add(l2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}