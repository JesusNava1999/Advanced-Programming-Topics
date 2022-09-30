/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AWT;
import java.awt.*;
/**
 *
 * @author AsusHP
 */
public class PanelEjemplo {
    PanelEjemplo(){
        Frame f = new Frame();
        Panel panel = new Panel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.gray);
        Button b1 = new Button("Boton 1");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);
        Button b2 = new Button("Boton 2");
        b2.setBounds(50, 100, 80, 30);
        b2.setBackground(Color.green);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new PanelEjemplo();
    }
}
