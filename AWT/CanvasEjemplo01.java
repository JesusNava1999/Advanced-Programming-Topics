
package AWT;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class CanvasEjemplo01 {
    public CanvasEjemplo01() {
        Frame f = new Frame("Canvas Ejemplo");
        f.add(new MiCanvas());
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CanvasEjemplo01();
    }
}

class MiCanvas extends Canvas {
    public MiCanvas() {
        setBackground(Color.gray);
        setSize(300, 200);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(75, 75, 150, 75);
    }
}