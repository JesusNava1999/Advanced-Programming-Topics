package SWING;
import java.awt.event.*;
import javax.swing.*;
public class JComboBoxEjemplo02 {
    JFrame f;
    JComboBoxEjemplo02(){
        f = new JFrame("ComboBox Ejemplo");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setSize(400,100);
        JButton b = new JButton("Mostrar");
        b.setBounds(200,100,90,20);
        String languajes[] = {"C","C++","C#","Java","PHP"};
        final JComboBox cb = new JComboBox(languajes);
        cb.setBounds(50,100,90,20);
        f.add(cb);
        f.add(label);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,350);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Lenguaje de Programacion Seleccionado: " + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }
    public static void main(String[] args) {
        new JComboBoxEjemplo02();
    }
}
