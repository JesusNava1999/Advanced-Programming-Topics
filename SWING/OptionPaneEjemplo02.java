package SWING;

import javax.swing.*;

public class OptionPaneEjemplo02 {
    JFrame f;
    OptionPaneEjemplo02(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Actualización completada.","Alert",JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String[] args) {
        new OptionPaneEjemplo02();
    }
}
