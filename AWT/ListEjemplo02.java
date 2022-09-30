
package AWT;

import java.awt.*;
import java.awt.event.*;


public class ListEjemplo02 {
    ListEjemplo02 (){
        Frame f = new Frame();
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(500, 100);
        Button b = new Button("Mostrar");  
        b.setBounds(200,150,80,30);
        final List l1 = new List(4, false);
        l1.setBounds(100,100,70,70);
        l1.add("C");
        l1.add("C++");
        l1.add("Java");
        l1.add("PHP");
        final List l2 = new List(4, true);
        l2.setBounds(100,200,70,70);
        l2.add("Turbo C++");
        l2.add("Spring");
        l2.add("Hibernate");
        l2.add("CodeIgniter");
        f.add(l1);
        f.add(l2);
        f.add(label);
        f.add(b);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String data = "Lenguaje de porgramación seleccionado: "+l1.getItem(l1.getSelectedIndex());
            data += "\t Framework Seleccionado: ";
            for (String frame:l2.getSelectedItems()){
                data += frame + " ";
            }
            label.setText(data);            
    }
    });
}
    public static void main(String[] args) {
        new ListEjemplo02();
    }
}
