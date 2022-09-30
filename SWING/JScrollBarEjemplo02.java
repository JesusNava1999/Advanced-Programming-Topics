package SWING;


import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBarEjemplo02 {
    JScrollBarEjemplo02(){
        JFrame f = new JFrame("ScrollBar Ejemplo 02");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        final JScrollBar s = new JScrollBar();
        s.setBounds(100,100,50,100);
        f.add(s);
        f.add(label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Valor vertical es: " + s.getValue());
            }
        });
    }

    public static void main(String[] args) {
        new JScrollBarEjemplo02();
    }
}
