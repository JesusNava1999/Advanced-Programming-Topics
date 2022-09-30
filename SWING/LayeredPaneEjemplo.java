package SWING;

import javax.swing.*;
import java.awt.*;

public class LayeredPaneEjemplo extends JFrame {
    public LayeredPaneEjemplo() {
        super("LayeredPaneEjemplo");
        setSize(200, 200);
        JLayeredPane pane = getLayeredPane();
        //Creating Buttons
        JButton top = new JButton();
        top.setBackground(Color.WHITE);
        top.setBounds(20, 20, 50, 50);
        JButton middle = new JButton();
        middle.setBackground(Color.RED);
        middle.setBounds(40, 40, 50, 50);
        JButton bottom = new JButton();
        bottom.setBackground(Color.cyan);
        bottom.setBounds(60,60,50,50);
        //Adding Buttons On Pane
        pane.add(bottom, new Integer(1));
        pane.add(middle, new Integer(2));
        pane.add(top, new Integer(3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LayeredPaneEjemplo panel = new LayeredPaneEjemplo();
        panel.setVisible(true);
    }
}
