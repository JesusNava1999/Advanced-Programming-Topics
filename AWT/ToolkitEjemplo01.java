/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;
import java.awt.*;
import java.awt.event.*;
public class ToolkitEjemplo01 {
    public static void main(String[] args) {
        Frame f = new Frame("ToolkitExample");
        Button b = new Button("beep");
        b.setBounds(50,100,60,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Toolkit.getDefaultToolkit().beep();
            }
        });
    }
}
