package SWING;
import javax.swing.*;
public class JListEJemplo01 {
    JListEJemplo01(){
        JFrame f = new JFrame();
        DefaultListModel l1 = new DefaultListModel();
        l1.addElement("Item 1");
        l1.addElement("Item 2");
        l1.addElement("Item 3");
        l1.addElement("Item 4");
        JList list = new JList(l1);
        list.setBounds(100,100,75,75);
        f.add(list);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JListEJemplo01();
    }
}
