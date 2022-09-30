package SWING;
import javax.swing.*;
public class JTableEjemplo01 {
    JFrame f;
    JTableEjemplo01(){
        f = new JFrame();
        String data [][]={{"101","Pituca","120000"},{"102","Petaca","180000"},{"103","Panfilo","400000"}};
        String column [] = {"ID","NOMBRE","SALARIO"};
        JTable jt = new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setVisible(true);
        f.setSize(300,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTableEjemplo01();
    }
}
