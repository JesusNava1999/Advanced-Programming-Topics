package AWT;
import java.awt.*;
import java.awt.event.*;
public class LabelEjemplo extends Frame implements ActionListener {
    TextField tf;
    Label l;
    Button b;
    LabelEjemplo(){
        tf = new TextField();
        tf.setBounds(50,50,150,20);
        l = new Label();
        l.setBounds(50,100,250,20);
        b = new Button("Busca IP");
        b.setBounds(50,150,80,30);
        b.addActionListener(this);
        add(b);
        add(tf);
        add(l);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP de " + host + " es: " + ip);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        new LabelEjemplo();
    }
}
