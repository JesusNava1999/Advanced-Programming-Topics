package AWT;
import java.awt.*;
import java.awt.event.*;
public class CheckBoxEjemplo02 {
    CheckBoxEjemplo02(){
        Frame f = new Frame("CheckBox Ejmplo");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        Checkbox checkbox1 = new Checkbox("Java AWT");
        checkbox1.setBounds(100, 100, 150, 50);
        Checkbox checkbox2 = new Checkbox("Java SWING");
        checkbox2.setBounds(100, 150, 150, 50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label);
        checkbox1.addItemListener(new ItemListener(){
          public void itemStateChanged(ItemEvent e) {
              label.setText("Java AWT Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
          } 
        });
        checkbox2.addItemListener(new ItemListener(){
          public void itemStateChanged(ItemEvent e) {
              label.setText("Java SWING Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
          } 
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxEjemplo02();
    }
}
