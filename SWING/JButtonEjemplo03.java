package SWING;
import javax.swing.*;
public class JButtonEjemplo03 {
    JButtonEjemplo03(){
        JFrame f = new JFrame("Button Ejemplo");
        JButton b = new JButton(new ImageIcon("D:\\images.jpg"));
        b.setBounds(100,150,200,200);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonEjemplo03();
    }  
}
