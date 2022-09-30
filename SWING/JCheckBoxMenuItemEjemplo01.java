package SWING;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JCheckBoxMenuItemEjemplo01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenu Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Archivo");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenuItem menuItem1 = new JMenuItem("Abrir", KeyEvent.VK_N);
        fileMenu.add(menuItem1);

        JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Option_1");
        caseMenuItem.setMnemonic(KeyEvent.VK_C);
        fileMenu.add(caseMenuItem);

        ActionListener aListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                AbstractButton aButton = (AbstractButton) event.getSource();
                boolean selected = aButton.getModel().isSelected();
                String newLabel;
                Icon newIcon;
                if(selected){
                    newLabel = "Valor - 1";
                } else {
                    newLabel = "Valor - 2";
                }
                aButton.setText(newLabel);
            }
        };
        caseMenuItem.addActionListener(aListener);
        frame.setJMenuBar(menuBar);
        frame.setSize(350,250);
        frame.setVisible(true);
    }
}
