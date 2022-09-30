

package AWT;
import java.awt.*;
import java.awt.event.*;
public class DialogEjemplo {
    private static Dialog d;
    DialogEjemplo(){
        Frame f = new Frame();
        d = new Dialog(f, "Dialog Ejemplo", true);
        d.setLayout(new FlowLayout());
        Button b = new Button ("OK");
        b.addActionListener((ActionEvent e) -> {
            DialogEjemplo.d.setVisible(false);
        });
        d.add(new Label("Click boton para continuar. "));
        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
    }
    public static void main(String[] args) {
        new DialogEjemplo();
    }
}
