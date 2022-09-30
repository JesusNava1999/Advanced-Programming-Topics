package SWING;

import javax.swing.*;

public class JEditorPaneEjemplo {
    JFrame myFrame = null;

    public static void main(String[] args) {
        new JEditorPaneEjemplo().test();
    }

    private void test(){
        myFrame = new JFrame("JEditorPane Ejemplo");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400,200);
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("Text/Plain");
        myPane.setText("La gestion de proyectos ágil no se formula sobre la necesidad de anticipación, sino sobre la de adaptación continua"+ " Valoramos más a los individuos y su interacción que a los procesos y las herramientas." + " Valoramos más el Software que funciona que la documentación exhaustiva.");
        myFrame.setContentPane(myPane);
        myFrame.setVisible(true);
    }
}
