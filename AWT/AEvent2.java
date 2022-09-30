package AWT;
import java.awt.*;
import java.awt.event.*;
public class AEvent2 extends Frame {
    TextField tf;
    AEvent2(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button ("Click me");
        b.setBounds(100,120,80,30);
        
        Outer o = new Outer(this);
        b.addActionListener(o);
        
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AEvent2();
    }
}
