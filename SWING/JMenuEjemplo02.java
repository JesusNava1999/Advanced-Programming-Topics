package SWING;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuEjemplo02 implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem cut,copy,paste,selectAll;
    JTextArea ta;
    JMenuEjemplo02(){
        f = new JFrame();
        f.setTitle("NotePad");
        cut = new JMenuItem("Cortar");
        copy = new JMenuItem("Copias");
        paste = new JMenuItem("Pegar");
        selectAll = new JMenuItem("Seleccionar Todo");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        mb = new JMenuBar();
        file = new JMenu("Archivo");
        edit = new JMenu("Editar");
        help = new JMenu("Ayuda");
        edit.add(cut); edit.add(copy); edit.add(paste); edit.add(selectAll);
        mb.add(file); mb.add(edit); mb.add(help);
        ta = new JTextArea();
        ta.setBounds(5,5,360,320);
        f.add(mb); f.add(ta);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==cut){
            ta.cut();
        }
        if(e.getSource()==copy){
            ta.copy();
        }
        if(e.getSource()==paste){
            ta.paste();
        }
        if(e.getSource()==selectAll){
            ta.selectAll();
        }
    }

    public static void main(String[] args) {
        new JMenuEjemplo02();
    }
}
