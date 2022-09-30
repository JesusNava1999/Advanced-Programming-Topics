package SWING;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerEjemplo02 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Spinner Ejemplo");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setSize(250,100);
        SpinnerModel value = new SpinnerNumberModel(5,0,10,1);
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        f.add(spinner);
        f.add(label);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Valor: "+((JSpinner)e.getSource()).getValue());
            }
        });
    }
}
