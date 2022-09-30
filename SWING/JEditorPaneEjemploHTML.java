package SWING;

import javax.swing.*;

public class JEditorPaneEjemploHTML {
    JFrame myFrame = null;

    public static void main(String[] args) {
        new JEditorPaneEjemploHTML().test();
    }

    private void test() {
        myFrame = new JFrame("JEditorPane Ejemplo HTML");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400, 200);
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("Text/HTML");
        myPane.setText("<h1>SCRUM</h1><p>Valoramos más a los individuos y su interacción que a los procesos y las herramientas." + " Valoramos más el Software que funciona que la documentación exhaustiva." + " Valoramos más la colaboración con el cliente que la negociación contractual.</p>");
        myFrame.setContentPane(myPane);
        myFrame.setVisible(true);
    }
}
