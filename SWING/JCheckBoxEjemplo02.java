package SWING;
import javax.swing.*;
import java.awt.event.ItemListener;
import java.awt.event.*;
public class JCheckBoxEjemplo02 {
      JCheckBoxEjemplo02(){
        JFrame f = new JFrame("CheckBox Ejemplo");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JCheckBox checkBox1 = new JCheckBox("AWT");
        checkBox1.setBounds(80,100,100,50);
        JCheckBox checkBox2 = new JCheckBox("SWING");
        checkBox2.setBounds(80,150,100,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(label);
        checkBox1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("AWT CheckBox: " + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        checkBox2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                label.setText("SWING CheckBox: " + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);        
    }
      public static void main(String[] args) {
        new JCheckBoxEjemplo02();
    }
}
