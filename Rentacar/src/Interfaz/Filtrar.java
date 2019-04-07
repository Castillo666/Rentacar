/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Conexion.Conexion;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raquel Rojas
 */
public class Filtrar extends javax.swing.JFrame {

    /**
     * Creates new form Filtrar
     */
    public Filtrar() {
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

        jLabel1 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TipoCB = new javax.swing.JComboBox<>();
        SedeCB = new javax.swing.JComboBox<>();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        filtrar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Filtrados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        numPasajeros = new javax.swing.JTextField();
        imagen = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar Vehiculo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 16, -1, -1));

        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo:");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 64, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sede:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("a");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 64, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("De");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        TipoCB.setEditable(true);
        TipoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sin filtro", "económico", "convertible", "compacto", "pickup", "intermedio", "suv", "mini-van" }));
        TipoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoCBActionPerformed(evt);
            }
        });
        getContentPane().add(TipoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 61, 120, -1));

        SedeCB.setForeground(new java.awt.Color(0, 0, 102));
        SedeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sin filtro", "Aeropuerto Juan Santamaria", "Santa Ana", "Paseo Colon", "Paseo de las flores ", "Curridabat" }));
        getContentPane().add(SedeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 140, -1));

        txtDesde.setText("0");
        txtDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesdeActionPerformed(evt);
            }
        });
        getContentPane().add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 38, -1));

        txtHasta.setText("500");
        getContentPane().add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 61, 48, -1));

        filtrar.setBackground(new java.awt.Color(255, 255, 255));
        filtrar.setForeground(new java.awt.Color(0, 0, 102));
        filtrar.setText("Filtrar");
        filtrar.setBorderPainted(false);
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });
        getContentPane().add(filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 114, -1, -1));

        Filtrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Filtrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiltradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Filtrados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 196, -1, 169));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Capacidad de Pasajeros:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        numPasajeros.setText("0");
        numPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPasajerosActionPerformed(evt);
            }
        });
        getContentPane().add(numPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 70, 20));

        imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMouseClicked(evt);
            }
        });
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 250, 170));

        lblFondo.setBackground(new java.awt.Color(0, 0, 102));
        lblFondo.setForeground(new java.awt.Color(255, 255, 255));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesdeActionPerformed

    private void filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarActionPerformed
        String estilo = TipoCB.getSelectedItem().toString();
        String sede = SedeCB.getSelectedItem().toString();
        int desde = Integer.parseInt(txtDesde.getText());
        int hasta = Integer.parseInt(txtHasta.getText());
        int pasajeros = Integer.parseInt(numPasajeros.getText());
       
        Conexion cn = new Conexion();
        ResultSet rs = null;
        rs = cn.vehiculosFiltrados(estilo,sede,desde,hasta,pasajeros);
        DefaultTableModel table = new DefaultTableModel();
        this.Filtrados.setModel(table);
        table.setColumnIdentifiers(new Object[]{"Placa","Estilo", "Marca", "Precio"});
        
        try{
            while(rs.next()){
            table.addRow(new Object[]{rs.getString("placa"), rs.getString("estilo"), rs.getString("marca"),rs.getInt("CostoDia")});
            }
        }catch(Exception e){System.out.println("Hubo error" + e);}
        
        
           
    }//GEN-LAST:event_filtrarActionPerformed

    private void TipoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoCBActionPerformed

    private void FiltradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltradosMouseClicked
        int selectedRow = Filtrados.getSelectedRow();
        String placaImg = Filtrados.getModel().getValueAt(selectedRow,0).toString();
        
        Conexion cc = new Conexion();
        try {
            ResultSet rs = cc.vehiculo(placaImg);
            rs.next();
            
            Blob foto = rs.getBlob("fotoVehiculo");
            byte []recu = foto.getBytes(1, (int) foto.length());
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(recu));
            
            Image imges = img.getScaledInstance(imagen.getWidth(),imagen.getHeight(), Image.SCALE_SMOOTH);
                
            imagen.setIcon(new ImageIcon(imges));
        } catch (SQLException ex) {
            System.out.println("1.");
            Logger.getLogger(Filtrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("2.");
            Logger.getLogger(Filtrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_FiltradosMouseClicked

    private void imagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMouseClicked
        // TODO add your handling code here:
        int selectedRow = Filtrados.getSelectedRow();
        String placa = Filtrados.getModel().getValueAt(selectedRow,0).toString();
        detallesVehiculo detalles = new detallesVehiculo();
        detalles.setVisible(true);
        try {
            detalles.vehiculo(placa);
        } catch (SQLException ex) {
            Logger.getLogger(Filtrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imagenMouseClicked

    private void numPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPasajerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPasajerosActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Filtrados;
    private javax.swing.JComboBox<String> SedeCB;
    private javax.swing.JComboBox<String> TipoCB;
    private javax.swing.JToggleButton filtrar;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField numPasajeros;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtHasta;
    // End of variables declaration//GEN-END:variables
}
