package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonEjemplo extends JFrame implements ItemListener {
    public static void main(String[] args) {
        new JToggleButtonEjemplo();
    }

    private JToggleButton button;

    JToggleButtonEjemplo() {
        setTitle("JToggleButton con ItemListener Ejemplo");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void setJToggleButton(){
        button = new JToggleButton("Encender");
        add(button);
    }
    private void setAction() {
        button.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent eve){
        if(button.isSelected()){
            button.setText("Apagado");
        } else {
            button.setText("Encendido");
        }
    }
}
