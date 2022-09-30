package SWING;

import javax.swing.*;

public class OptionPaneEjemplo03 {
    JFrame f;
    OptionPaneEjemplo03(){
        f = new JFrame();
        String name = JOptionPane.showInputDialog(f,"Ingresa tu nombre");
    }

    public static void main(String[] args) {
        new OptionPaneEjemplo03();
    }
}
