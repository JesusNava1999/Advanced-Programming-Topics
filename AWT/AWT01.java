package AWT;

import java.awt.*;

public class AWT01 extends Frame {
    AWT01() {
        Button b = new Button("Presiona aquí");
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AWT01 f = new AWT01();
    }
}
