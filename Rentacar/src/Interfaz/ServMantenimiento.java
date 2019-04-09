/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Entidades.Servicio;
import Operaciones.ServMantenimientoOp;
import java.text.ParseException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaz.MenuPrincipal;
import javax.swing.JOptionPane;


/**
 *
 * @author marip
 */
public class ServMantenimiento extends javax.swing.JFrame {

    /**
     * Creates new form ServMantenimiento
     */
    public ServMantenimiento() {
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

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        lblTitulo = new javax.swing.JLabel();
        lblIdServicio = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        lblTipoServicio = new javax.swing.JLabel();
        lblFechaFin = new javax.swing.JLabel();
        lblDetalle = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        txtIdServicio = new javax.swing.JTextField();
        txtIdEmpresa = new javax.swing.JTextField();
        txtDetalle = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        lblIdEmpresa = new javax.swing.JLabel();
        txtTipoServicio = new javax.swing.JTextField();
        btbRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registrar Servicio Mantenimiento");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        lblIdServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblIdServicio.setText("idServicio");
        getContentPane().add(lblIdServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        lblFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaInicio.setText("Fecha de inicio:");
        getContentPane().add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        lblTipoServicio.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoServicio.setText("Tipo de Servicio:");
        getContentPane().add(lblTipoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        lblFechaFin.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaFin.setText("Fecha de Finalizacion:");
        getContentPane().add(lblFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lblDetalle.setForeground(new java.awt.Color(255, 255, 255));
        lblDetalle.setText("Detalle:");
        getContentPane().add(lblDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        lblMonto.setForeground(new java.awt.Color(255, 255, 255));
        lblMonto.setText("Monto:");
        getContentPane().add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        txtIdServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdServicioActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 204, -1));
        getContentPane().add(txtIdEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 204, -1));
        getContentPane().add(txtDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 204, -1));
        getContentPane().add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 204, -1));

        txtFechaFin.setText("DD/MM/YY");
        txtFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFinActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 204, -1));

        txtFechaInicio.setText("DD/MM/YY");
        txtFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 204, -1));

        lblIdEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblIdEmpresa.setText("idEmpresa:");
        getContentPane().add(lblIdEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));
        getContentPane().add(txtTipoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 204, -1));

        btbRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btbRegistrar.setForeground(new java.awt.Color(0, 0, 102));
        btbRegistrar.setText("Registrar");
        btbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, -1, -1));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setForeground(new java.awt.Color(0, 0, 102));
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 90, -1));

        lblFondo.setBackground(new java.awt.Color(0, 0, 102));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdServicioActionPerformed

    private void txtFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicioActionPerformed

    private void btbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbRegistrarActionPerformed
      
        if (!txtDetalle.getText().isEmpty() & !txtIdEmpresa.getText().isEmpty() & !txtIdServicio.getText().isEmpty() & txtMonto.getText().isEmpty() & !txtTipoServicio.getText().isEmpty()){
      Servicio servicio = new Servicio();
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date parsed = null;
        try {
            parsed = format.parse(txtFechaInicio.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ServMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date fechaInicio = new java.sql.Date(parsed.getTime());
        
        java.util.Date parsed2 = null;
        try {
            parsed2 = format.parse(txtFechaFin.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ServMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.sql.Date fechaFin = new java.sql.Date(parsed2.getTime());
        
        
        servicio.setDetalle(txtDetalle.getText());
        servicio.setFechaFin(fechaFin);
        servicio.setFechaInicio(fechaInicio);
        servicio.setIdEmpresa(Integer.parseInt(txtIdEmpresa.getText()));
        servicio.setIdServicio(Integer.parseInt(txtIdServicio.getText()));
        servicio.setMonto(Integer.parseInt(txtMonto.getText()));
        servicio.setTipoServicio(txtTipoServicio.getText());
        
        ServMantenimientoOp.registrarServMantenimiento(servicio);
        JOptionPane.showMessageDialog(null, "El servicio se insertó correctamente");
      
      } else {
          JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos");
      }


    }//GEN-LAST:event_btbRegistrarActionPerformed

    private void txtFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFinActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblDetalle;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdEmpresa;
    private javax.swing.JLabel lblIdServicio;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblTipoServicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtIdEmpresa;
    private javax.swing.JTextField txtIdServicio;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtTipoServicio;
    // End of variables declaration//GEN-END:variables
}
