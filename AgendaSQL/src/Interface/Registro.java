package Interface;

import Clases.Conectar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Registro extends JFrame implements ActionListener {
    JTable tablaDatos;
    JButton ingresar, consultar, mostrar_agenda, eliminar, editar;
    JTextField id, nombre, apellido_1, apellido_2, direccion, telefono, email, provincia;
    JLabel l_id, l_nombre, l_apellido_1, l_apellido_2, l_direccion, l_telefono, l_email, l_fecha_nacimiento, l_provincia;
    JDateChooser fecha;
    Conectar con = new Conectar();
    Connection reg = con.getConnection();

    Registro() {
        //************************************************************************************************************//
        setTitle("Agenda Personal - Jesús Nava");
        //*************************************************J-TABLES***************************************************//
        tablaDatos = new JTable();
        tablaDatos.setBounds(350, 85, 1000, 320);
        add(tablaDatos);
        //*************************************************J-BUTTONS**************************************************//
        ingresar = new JButton("Ingresar");
        ingresar.setBounds(15, 380, 90, 25);
        ingresar.addActionListener(this);
        add(ingresar);
        consultar = new JButton("Consultar");
        consultar.setBounds(120, 380, 90, 25);
        consultar.addActionListener(this);
        add(consultar);
        mostrar_agenda = new JButton("Mostrar");
        mostrar_agenda.setBounds(225, 380, 90, 25);
        mostrar_agenda.addActionListener(this);
        add(mostrar_agenda);
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(350, 50, 90, 25);
        eliminar.addActionListener(this);
        add(eliminar);
        editar = new JButton("Editar");
        editar.setBounds(1260,50,90,25);
        editar.addActionListener(this);
        add(editar);
        //*************************************************TEXT-FIELDS************************************************//
        id = new JTextField("");
        id.setBounds(500,50,135,25);
        id.addActionListener(this);
        add(id);
        nombre = new JTextField("");
        nombre.setBounds(175, 50, 135, 25);
        nombre.addActionListener(this);
        add(nombre);
        apellido_1 = new JTextField("");
        apellido_1.setBounds(175, 90, 135, 25);
        apellido_1.addActionListener(this);
        add(apellido_1);
        apellido_2 = new JTextField("");
        apellido_2.setBounds(175, 130, 135, 25);
        apellido_2.addActionListener(this);
        add(apellido_2);
        direccion = new JTextField("");
        direccion.setBounds(175, 170, 135, 25);
        direccion.addActionListener(this);
        add(direccion);
        telefono = new JTextField("");
        telefono.setBounds(175, 210, 135, 25);
        telefono.addActionListener(this);
        add(telefono);
        email = new JTextField("");
        email.setBounds(175, 250, 135, 25);
        email.addActionListener(this);
        add(email);
        fecha = new JDateChooser();
        fecha.setBounds(175,290,135,25);
        fecha.setDateFormatString("yy/MM/dd HH:mm:ss");
        add(fecha);
        provincia = new JTextField("");
        provincia.setBounds(180, 330, 130, 25);
        provincia.addActionListener(this);
        add(provincia);
        //***************************************************J-LABELS*************************************************//
        l_id = new JLabel("ID:");
        l_id.setBounds(480,50,25,25);
        add(l_id);
        l_nombre = new JLabel("Nombre");
        l_nombre.setBounds(15, 50, 130, 25);
        add(l_nombre);
        l_apellido_1 = new JLabel("Primer Apellido");
        l_apellido_1.setBounds(15, 90, 130, 25);
        add(l_apellido_1);
        l_apellido_2 = new JLabel("Segundo Apellido");
        l_apellido_2.setBounds(15, 130, 130, 25);
        add(l_apellido_2);
        l_direccion = new JLabel("Domicilio");
        l_direccion.setBounds(15, 170, 130, 25);
        add(l_direccion);
        l_telefono = new JLabel("Telefono o Celular");
        l_telefono.setBounds(15, 210, 130, 25);
        add(l_telefono);
        l_email = new JLabel("E-Mail");
        l_email.setBounds(15, 250, 130, 25);
        add(l_email);
        l_fecha_nacimiento = new JLabel("Fecha Nacimiento");
        l_fecha_nacimiento.setBounds(15, 290, 130, 25);
        add(l_fecha_nacimiento);
        l_provincia = new JLabel("Ciudad Natal");
        l_provincia.setBounds(15, 330, 130, 25);
        add(l_provincia);

        setSize(1400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mostrar_agenda) {
            mostrarTabla();
        }
        if (e.getSource() == ingresar){
            if(nombre.getText().equals("")&&apellido_1.getText().equals("")&&apellido_2.getText().equals("")&&direccion.getText().equals("")&&telefono.getText().equals("")&&email.getText().equals("")&&fecha.getDate().toString().equals("")&&provincia.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Campos Vacios");
            } else {
                insertarTabla();
                mostrarTabla();
            }
        }
        if (e.getSource() == consultar){
            buscarTabla();
        }
        if (e.getSource() == eliminar){
            if(id.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Campo Vacio");
            } else {
                eliminarTabla();
            }
            mostrarTabla();
        }
        if(e.getSource()==editar){
            editarTabla();
            JOptionPane.showMessageDialog(null,"Elemento Editado");
            mostrarTabla();
        }
    }

    void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Fecha De Nacimiento");
        modelo.addColumn("Provincia");
        tablaDatos.setModel(modelo);

        String sql = "SELECT * FROM directorio";
        String [] encabezado = {"ID","Nombre","Apellido Paterno","Apellido Materno","Direccion","Telefono","Email","Fecha De Nacimiento","Provincia"};
        modelo.addRow(encabezado);
        String[] datos = new String[9];
        try {
            Statement st = reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                modelo.addRow(datos);
            }
            tablaDatos.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        nombre.setText("");
        apellido_1.setText("");
        apellido_2.setText("");
        direccion.setText("");
        telefono.setText("");
        email.setText("");
        fecha.setDate(null);
        provincia.setText("");
    }

    void insertarTabla() {
        try{
            PreparedStatement pps = reg.prepareStatement("INSERT INTO directorio(ID, Nombre, Apellido_Paterno, Apellido_Materno, Direccion, Telefono, Email, Fecha_Nacimiento, Provincia) VALUES(?,?,?,?,?,?,?,?,?)");
            pps.setString(1,id.getText());
            pps.setString(2,nombre.getText());
            pps.setString(3,apellido_1.getText());
            pps.setString(4,apellido_2.getText());
            pps.setString(5,direccion.getText());
            pps.setString(6,telefono.getText());
            pps.setString(8,((JTextField)fecha.getDateEditor().getUiComponent()).getText());
            pps.setString(7,email.getText());
            pps.setString(9,provincia.getText());
            pps.executeUpdate();
            id.setText("");
            nombre.setText("");
            apellido_1.setText("");
            apellido_2.setText("");
            direccion.setText("");
            telefono.setText("");
            email.setText("");
            fecha.setDate(null);
            provincia.setText("");
            JOptionPane.showMessageDialog(null,"Datos Ingresados Exitosamente");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Datos NO Ingresados "+ex);
        }
    }
    void buscarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Fecha De Nacimiento");
        modelo.addColumn("Provincia");
        tablaDatos.setModel(modelo);
        String[] datos = new String[9];
        try {
            PreparedStatement pps = reg.prepareStatement("SELECT * FROM directorio WHERE ID = ?");
            String [] encabezado = {"ID","Nombre","Apellido Paterno","Apellido Materno","Direccion","Telefono","Email","Fecha De Nacimiento","Provincia"};
            modelo.addRow(encabezado);
            pps.setString(1, id.getText());
            ResultSet rs = pps.executeQuery();
            if(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                modelo.addRow(datos);
            }
            id.setText(rs.getString(1));
            nombre.setText(rs.getString(2));
            apellido_1.setText(rs.getString(3));
            apellido_2.setText(rs.getString(4));
            direccion.setText(rs.getString(5));
            telefono.setText(rs.getString(6));
            email.setText(rs.getString(7));
            fecha.setDate(Date.valueOf(rs.getString(8)));
            provincia.setText(rs.getString(9));
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error " + ex);
        }
    }

    void eliminarTabla(){
        try{
            PreparedStatement pps = reg.prepareStatement("DELETE FROM directorio WHERE ID = ?");
            pps.setString(1, id.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Elemento Eliminado");
            id.setText("");
            mostrarTabla();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error " + ex);
        }
    }

    void editarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Fecha De Nacimiento");
        modelo.addColumn("Provincia");
        tablaDatos.setModel(modelo);
        String[] datos = new String[9];
        try {
            PreparedStatement pps = reg.prepareStatement("UPDATE directorio SET Nombre = ?, Apellido_Paterno = ?, Apellido_Materno = ?, Direccion = ?, Telefono = ?, Email = ?, Fecha_Nacimiento = ?, Provincia = ? WHERE ID = ?");
            String [] encabezado = {"ID","Nombre","Apellido Paterno","Apellido Materno","Direccion","Telefono","Email","Fecha De Nacimiento","Provincia"};
            modelo.addRow(encabezado);
            pps.setString(1, nombre.getText());
            pps.setString(2, apellido_1.getText());
            pps.setString(3, apellido_2.getText());
            pps.setString(4, direccion.getText());
            pps.setString(5, telefono.getText());
            pps.setString(6, email.getText());
            pps.setString(7, ((JTextField)fecha.getDateEditor().getUiComponent()).getText());
            pps.setString(8, provincia.getText());
            pps.setString(9, id.getText());
            pps.executeUpdate();
            nombre.setText("");
            apellido_1.setText("");
            apellido_2.setText("");
            direccion.setText("");
            telefono.setText("");
            email.setText("");
            fecha.setDate(null);
            provincia.setText("");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error " + ex);
        }
    }

    public static void main(String[] args) {
        new Registro();
    }
}
