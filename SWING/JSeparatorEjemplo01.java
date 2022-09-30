package SWING;

import javax.swing.*;

public class JSeparatorEjemplo01 {
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4;

    JSeparatorEjemplo01() {
        JFrame f = new JFrame("Separator Ejemplo");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JSeparatorEjemplo01();
    }
}
