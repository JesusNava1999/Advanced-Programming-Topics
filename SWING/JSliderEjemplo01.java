package SWING;

import javax.swing.*;

public class JSliderEjemplo01 extends JFrame {
    public JSliderEjemplo01() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JSliderEjemplo01 frame = new JSliderEjemplo01();
        frame.pack();
        frame.setVisible(true);
    }
}
