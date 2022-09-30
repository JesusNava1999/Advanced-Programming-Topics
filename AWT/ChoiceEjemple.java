package AWT;
import java.awt.Choice;
import java.awt.Frame;
public class ChoiceEjemple {
    ChoiceEjemple(){
        Frame f = new Frame();
        Choice c = new Choice();
        c.setBounds(100,100,150,75);
        c.add("Pasta");
        c.add("Hilo");
        c.add("Enjuague");
        c.add("Esmalte");
        c.add("Blanqueador");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ChoiceEjemple();
    }
}
