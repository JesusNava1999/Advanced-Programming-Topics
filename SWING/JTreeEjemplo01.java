package SWING;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeEjemplo01 {
    JFrame f;
    JTreeEjemplo01(){
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Estilo");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Letra");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Rojo");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Azul");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("Negro");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Verde");
        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);
        JTree jt = new JTree(style);
        f.add(jt);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTreeEjemplo01();
    }
}
