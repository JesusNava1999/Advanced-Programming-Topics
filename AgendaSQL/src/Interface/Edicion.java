package Interface;

import Clases.Conectar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Edicion extends JFrame implements ActionListener {
    JTextField ida, nombrea, apellido_1a, apellido_2a, direcciona, telefonoa, emaila, provinciaa;
    JLabel l_ida, l_nombrea, l_apellido_1a, l_apellido_2a, l_direcciona, l_telefonoa, l_emaila, l_fecha_nacimientoa, l_provinciaa;
    JDateChooser fechaa;
    Conectar con = new Conectar();
    Connection reg = con.getConnection();
    Edicion(){
        setTitle("Edicion");
        //*************************************************TEXT-FIELDS************************************************//
        ida = new JTextField("");
        ida.setBounds(175, 50, 135, 25);
        ida.addActionListener(this);
        add(ida);
        nombrea = new JTextField("");
        nombrea.setBounds(175, 90, 135, 25);
        nombrea.addActionListener(this);
        add(nombrea);
        apellido_1a= new JTextField("");
        apellido_1a.setBounds(175, 130, 135, 25);
        apellido_1a.addActionListener(this);
        add(apellido_1a);
        apellido_2a = new JTextField("");
        apellido_2a.setBounds(175, 170, 135, 25);
        apellido_2a.addActionListener(this);
        add(apellido_2a);
        direcciona = new JTextField("");
        direcciona.setBounds(175, 210, 135, 25);
        direcciona.addActionListener(this);
        add(direcciona);
        telefonoa = new JTextField("");
        telefonoa.setBounds(175, 250, 135, 25);
        telefonoa.addActionListener(this);
        add(telefonoa);
        emaila = new JTextField("");
        emaila.setBounds(175,290,135,25);
        emaila.addActionListener(this);
        add(emaila);
        fechaa = new JDateChooser();
        fechaa.setBounds(180, 330, 130, 25);
        fechaa.setDateFormatString("yy/MM/dd HH:mm:ss");
        add(fechaa);
        provinciaa = new JTextField("");
        provinciaa.setBounds(175,370,130,25);
        provinciaa.addActionListener(this);
        add(provinciaa);
        //***************************************************J-LABELS*************************************************//
        l_ida = new JLabel("ID");
        l_ida.setBounds(15, 50, 130, 25);
        add(l_ida);
        l_nombrea = new JLabel("Nombre");
        l_nombrea.setBounds(15, 90, 130, 25);
        add(l_nombrea);
        l_apellido_1a = new JLabel("Primer Apellido");
        l_apellido_1a.setBounds(15, 130, 130, 25);
        add(l_apellido_1a);
        l_apellido_2a = new JLabel("Segundo Apellido");
        l_apellido_2a.setBounds(15, 170, 130, 25);
        add(l_apellido_2a);
        l_direcciona = new JLabel("Domicilio");
        l_direcciona.setBounds(15, 210, 130, 25);
        add(l_direcciona);
        l_telefonoa = new JLabel("Telefono o Celular");
        l_telefonoa.setBounds(15, 250, 130, 25);
        add(l_telefonoa);
        l_emaila = new JLabel("E-Mail");
        l_emaila.setBounds(15, 290, 130, 25);
        add(l_emaila);
        l_fecha_nacimientoa = new JLabel("Fecha Nacimiento");
        l_fecha_nacimientoa.setBounds(15, 330, 130, 25);
        add(l_fecha_nacimientoa);
        l_provinciaa = new JLabel("Ciudad Natal");
        l_provinciaa.setBounds(15,370,130,25);
        add(l_provinciaa);
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {

    }
}
