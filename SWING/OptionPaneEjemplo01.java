package SWING;

import javax.swing.*;

public class OptionPaneEjemplo01 {
    JFrame f;
    OptionPaneEjemplo01(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Hola, Java SWING.");
    }

    public static void main(String[] args) {
        new OptionPaneEjemplo01();
    }
}
