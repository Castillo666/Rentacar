/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Conexion.Conexion;
import static Conexion.Conexion.getConexion;
import Entidades.Cliente;
import Operaciones.ClientesOp;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author marip
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    Connection conexion = getConexion();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        chooserFoto = new javax.swing.JFileChooser();
        btnVlver = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 26, -1, -1));

        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("Cédula");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 85, -1, -1));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 126, -1, -1));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 82, 182, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 126, 180, -1));

        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setText("Direccion");
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 217, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 182, 180, 90));

        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 294, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 346, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Foto Licencia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 515, -1, -1));

        btnFoto.setBackground(new java.awt.Color(255, 255, 255));
        btnFoto.setForeground(new java.awt.Color(0, 0, 102));
        btnFoto.setText("Elegir Foto");
        btnFoto.setBorderPainted(false);
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 511, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 102));
        btnRegistrar.setText("Registrar Cliente");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 180, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 343, 180, -1));
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 385, 166, 117));
        getContentPane().add(chooserFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 549, 0, 0));

        btnVlver.setBackground(new java.awt.Color(255, 255, 255));
        btnVlver.setForeground(new java.awt.Color(0, 0, 102));
        btnVlver.setText("Volver");
        btnVlver.setBorderPainted(false);
        btnVlver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVlverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVlver, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        lblFondo.setBackground(new java.awt.Color(0, 0, 102));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File fichero;
    
    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
         int resultado;

        Clientes ventana = new Clientes();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        ventana.chooserFoto.setFileFilter(filtro);
        resultado= ventana.chooserFoto.showOpenDialog(null);


if (JFileChooser.APPROVE_OPTION == resultado){


        fichero = ventana.chooserFoto.getSelectedFile();
        try{
               ImageIcon icon = new ImageIcon(fichero.toString());
               Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblFoto.getWidth(),
                       lblFoto.getHeight(), Image.SCALE_DEFAULT));
               lblFoto.setText("A");
               lblFoto.setIcon( icono );
        }catch(Exception ex){

           JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
         
        }
    
 }
        
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
              /*
        Conexion.getConexion();
        Conexion con = new Conexion();
       
     
        try {
            if (con.existeCliente(txtCedula.getText()) == 1) {
                
               Cliente cliente = new Cliente();        
                cliente.setDireccion(txtDireccion.getText());
                cliente.setCedula(Integer.parseInt(txtCedula.getText()));
                cliente.setCorreo(txtCorreo.getText());
                cliente.setNombreCompleto(txtNombre.getText());
                cliente.setTelefono(txtTelefono.getText());
        
        String resp = ClientesOp.registrarCliente(cliente, fichero);
        
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        */
        if(!txtNombre.getText().isEmpty()&!txtDireccion.getText().isEmpty()&!txtCorreo.getText().isEmpty()&!txtTelefono.getText().isEmpty()&!txtCedula.getText().isEmpty()){
            if(!lblFoto.getText().isEmpty()){
                try {
                    String sql = "Select (cedula) from esquema.cliente Where cedula = '"+txtCedula.getText()+"'";
                    PreparedStatement stmt = conexion.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
            
                    if(Conexion.existeCliente(txtCedula.getText())==0){
                        JOptionPane.showMessageDialog(null, "El cliente ya existe");
                    }
                    else{
                        Cliente cliente = new Cliente();        
                        cliente.setDireccion(txtDireccion.getText());
                        cliente.setCedula(Integer.parseInt(txtCedula.getText()));
                        cliente.setCorreo(txtCorreo.getText());
                        cliente.setNombreCompleto(txtNombre.getText());
                        cliente.setTelefono(txtTelefono.getText());
        
                        ClientesOp.registrarCliente(cliente, fichero);
        
                        Licencias licencia = new Licencias();
                        licencia.setVisible(true);
                        this.setVisible(false);
                        }
            
            
            
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al conectar " +e.getMessage(),e.getMessage(), JOptionPane.ERROR_MESSAGE);
                    }
        }
        else{
            JOptionPane.showMessageDialog(null,"Es necesario cargar la imagen");
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Favor llenar espacios en blanco");
        }
    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVlverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVlverActionPerformed
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnVlverActionPerformed

    /**
     * @param args the command line arguments
     */
  
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVlver;
    private javax.swing.JFileChooser chooserFoto;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
