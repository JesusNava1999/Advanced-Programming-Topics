package SWING;

import javax.swing.*;
import java.awt.*;

public class JDesktopPaneEjemplo extends JFrame {
    public JDesktopPaneEjemplo() {
        CustomDesktopPane desktopPane = new CustomDesktopPane();
        Container contentPane = getContentPane();
        contentPane.add(desktopPane, BorderLayout.CENTER);
        desktopPane.display(desktopPane);

        setTitle("JDesktopPane Ejemplo");
        setSize(300, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JDesktopPaneEjemplo();
    }
}

class CustomDesktopPane extends JDesktopPane {
    int numFrames = 3, x = 30, y = 30;
    public void display(CustomDesktopPane dp){
        for (int i = 0; i < numFrames ; i++) {
            JInternalFrame jframe = new JInternalFrame("Interno Frame "+ i ,true,true,true,true);
            jframe.setBounds(x,y,250,85);
            Container c1 = jframe.getContentPane();
            c1.add(new JLabel("Viva Swing"));
            dp.add(jframe);
            jframe.setVisible(true);
            y+=75;
        }
    }
}
