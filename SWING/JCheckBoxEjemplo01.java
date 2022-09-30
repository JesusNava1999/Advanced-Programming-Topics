package SWING;
import javax.swing.*;
public class JCheckBoxEjemplo01 {
    JCheckBoxEjemplo01(){
        JFrame f = new JFrame("CheckBox Ejemplo");
        JCheckBox checkBox1 = new JCheckBox("Java AWT");
        checkBox1.setBounds(80,100,100,50);
        JCheckBox checkBox2 = new JCheckBox("Java SWING" , true);
        checkBox2.setBounds(80,150,100,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        new JCheckBoxEjemplo01();
    }
}
