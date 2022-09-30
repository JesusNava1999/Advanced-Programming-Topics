/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;
import java.awt.*;
public class ToolkitEjemplo02 {
    ToolkitEjemplo02(){
        Frame f = new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\descarga.jpg");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);      
    }
    public static void main(String[] args) {
        new ToolkitEjemplo02();
    }
}
