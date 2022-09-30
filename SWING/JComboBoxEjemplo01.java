package SWING;
import javax.swing.*;
public class JComboBoxEjemplo01 {
    JFrame f;
    JComboBoxEjemplo01(){
        f = new JFrame("ComboBox Ejemplo");
        String estado[]={"Guadalajara","Mexico","Mexicali","Acapulco","Guanajuato"};
        JComboBox cb = new JComboBox(estado);
        cb.setBounds(50,50,120,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JComboBoxEjemplo01();
    }
}