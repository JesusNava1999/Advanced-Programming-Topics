package SWING;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;

public class JPopupMenuEjemplo01 {
    JPopupMenuEjemplo01() {
        final JFrame f = new JFrame("PopupMenu Ejemplo");
        final JPopupMenu popupmenu = new JPopupMenu("Editar");
        JMenuItem cut = new JMenuItem("Cortar");
        JMenuItem copy = new JMenuItem("Copiar");
        JMenuItem paste = new JMenuItem("Pegar");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(f, e.getX(), e.getY());
            }
        });
        f.add(popupmenu);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPopupMenuEjemplo01();
    }
}
