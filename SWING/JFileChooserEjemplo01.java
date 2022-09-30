package SWING;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JFileChooserEjemplo01 extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file;
    JMenuItem open;
    JTextArea ta;

    JFileChooserEjemplo01() {
        open = new JMenuItem("Abrir Archivo");
        open.addActionListener(this);
        file = new JMenu("Archivo");
        file.add(open);
        mb = new JMenuBar();
        mb.setBounds(0, 0, 800, 20);
        mb.add(file);
        ta = new JTextArea(800, 800);
        ta.setBounds(0, 20, 800, 800);
        add(mb);
        add(ta);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            JFileChooser fc = new JFileChooser();
            int i = fc.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                String filepath = f.getPath();
                try {
                    BufferedReader br = new BufferedReader(new FileReader(filepath));
                    String s1 = "";
                    String s2 = "";
                    while ((s1 = br.readLine()) != null){
                        s2+=s1+"\n";
                    }
                    ta.setText(s2);
                    br.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        JFileChooserEjemplo01 om = new JFileChooserEjemplo01();
        om.setSize(500,500);
        om.setLayout(null);
        om.setVisible(true);
        om.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
