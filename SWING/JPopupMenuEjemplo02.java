package SWING;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopupMenuEjemplo02 {
    JPopupMenuEjemplo02(){
        final JFrame f = new JFrame("Popup Menu Ejemplo");
        final JLabel label =  new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
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
        cut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Cortar Presionado MenuItem.");
            }
        });
        copy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Copiado Presionado MenuItem.");
            }
        });
        paste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Pegar Presionado MenuItem.");
            }
        });
        f.add(label);
        f.add(popupmenu);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPopupMenuEjemplo02();
    }
}
