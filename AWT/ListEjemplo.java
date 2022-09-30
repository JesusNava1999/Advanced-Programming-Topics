
package AWT;

import java.awt.*;

public class ListEjemplo {
    ListEjemplo(){
        Frame f = new Frame();
        List l1 = new List(5);
        l1.setBounds(500,100,75,90);
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");
        f.add(l1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);               
    }
    public static void main(String[] args) {
        new ListEjemplo();
    }
}
