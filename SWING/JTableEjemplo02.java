package SWING;

import javax.swing.*;
import javax.swing.event.*;

public class JTableEjemplo02 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Table Ejemplo");
        String data[][] = {{"101", "Pituca", "120000"}, {"102", "Petaca", "180000"}, {"103", "Panfilo", "400000"}};
        String column[] = {"ID", "NOMBRE", "SALARIO"};
        final JTable jt = new JTable(data, column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String Data = null;
                int[] row = jt.getSelectedRows();
                int[] columns = jt.getSelectedColumns();
                for (int item : row) {
                    for (int value : columns) {
                        Data = (String) jt.getValueAt(item, value);
                    }
                }
                System.out.println("Elemento seleccionado de la tabla: " + Data);
            }
        });
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
