package SWING;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class JTextPaneEjemplo {
    public static void main(String[] args) throws BadLocationException {
        JFrame frame = new JFrame("JTextPane Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = frame.getContentPane();
        JTextPane pane = new JTextPane();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);
        //Se Fijan atributos y después del texto
        pane.setCharacterAttributes(attributeSet, true);
        pane.setText("Bienvenidos");

        attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setForeground(attributeSet, Color.red);
        StyleConstants.setBackground(attributeSet, Color.blue);

        Document doc = pane.getStyledDocument();
        doc.insertString(doc.getLength(), "a Java ", attributeSet);

        attributeSet = new SimpleAttributeSet();
        doc.insertString(doc.getLength(), "Swing", attributeSet);

        JScrollPane scrollPane = new JScrollPane(pane);
        cp.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
