
package SWING;
import javax.swing.JButton;
import javax.swing.JFrame;
public class JButtonEjemplo01 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Ejemplo");
        JButton b = new JButton("Click AQUÏ");
        b.setBounds(50,100,95,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
