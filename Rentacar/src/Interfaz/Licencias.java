/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Entidades.Licencia;
import Interfaz.MenuPrincipal;
import Operaciones.LicenciaOp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author marip
 */
public class Licencias extends javax.swing.JFrame {

    /**
     * Creates new form Licencia
     */
    public Licencias() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooserFoto = new javax.swing.JFileChooser();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblFechaE = new javax.swing.JLabel();
        txtFechaE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaExp = new javax.swing.JTextField();
        fotoLicencia = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(chooserFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 0, 10));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Licencia Cliente");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 25, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cédula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 88, -1, -1));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 85, 119, -1));

        lblFechaE.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaE.setText("Fecha de Emisión");
        getContentPane().add(lblFechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 143, -1, -1));

        txtFechaE.setText("dd/mm/yyyy");
        getContentPane().add(txtFechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 140, 119, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Expiración");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 187, -1, -1));

        txtFechaExp.setText("dd/mm/yyyy");
        getContentPane().add(txtFechaExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 184, 119, -1));
        getContentPane().add(fotoLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 216, 135));

        lblFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblFoto.setText("Foto:");
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        btnFoto.setBackground(new java.awt.Color(255, 255, 255));
        btnFoto.setForeground(new java.awt.Color(0, 0, 102));
        btnFoto.setText("Elegir Foto");
        btnFoto.setBorderPainted(false);
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 441, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 102));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 488, 109, -1));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setForeground(new java.awt.Color(0, 0, 102));
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 533, -1, -1));

        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 242, -1, -1));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 239, 119, -1));

        lblFondo.setBackground(new java.awt.Color(0, 0, 102));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File fichero;
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        int resultado;

        Licencias ventana = new Licencias();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");
        ventana.chooserFoto.setFileFilter(filtro);
        resultado= ventana.chooserFoto.showOpenDialog(null);


if (JFileChooser.APPROVE_OPTION == resultado){


        fichero = ventana.chooserFoto.getSelectedFile();
        try{
               ImageIcon icon = new ImageIcon(fichero.toString());
               Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblFoto.getWidth(),
                       lblFoto.getHeight(), Image.SCALE_DEFAULT));
               lblFoto.setText(null);
               lblFoto.setIcon( icono );
        }catch(Exception ex){

           JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
         
        }
    
 }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         Licencia licencia = new Licencia();
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date parsed = null;
        try {
            parsed = format.parse(txtFechaE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ServMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date fechaE = new java.sql.Date(parsed.getTime());
        
        java.util.Date parsed2 = null;
        try {
            parsed2 = format.parse(txtFechaExp.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ServMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.sql.Date fechaExp = new java.sql.Date(parsed2.getTime());
        
        
        licencia.setCedula(Integer.parseInt(txtCedula.getText()));
        licencia.setFechaEmision(fechaE);
        licencia.setTipo(txtTipo.getText());
        licencia.setFechaExpiracion(fechaExp);
        
       LicenciaOp.registrarLicencia(licencia,fichero);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JFileChooser chooserFoto;
    private javax.swing.JLabel fotoLicencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFechaE;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFechaE;
    private javax.swing.JTextField txtFechaExp;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables


}