/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Apis.crearPDF;
import Conexion.Conexion;
import Entidades.Factura;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Entidades.Reserva;
import Operaciones.ReservaOp;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import Interfaz.Reservas;
import static Servicios.Password.getRandom;
import com.google.maps.model.LatLng;
import Conexion.Conexion;

/**
 *
 * @author Raquel Rojas
 */
public class Filtrar extends javax.swing.JFrame {
    
     int idClienteR = Reservas.idClienteR;
     public static int idReserva = 16;
    
    /**
     * Creates new form Filtrar
     */
    public Filtrar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    double precioTotal;

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
        TipoCB = new javax.swing.JComboBox<String>();
        SedeCB = new javax.swing.JComboBox<String>();
        txtDesde = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        filtrar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Filtrados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        numPasajeros = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fechaInicio = new javax.swing.JTextField();
        fechaFin = new javax.swing.JTextField();
        Reservar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        placatxt = new javax.swing.JTextField();
        seguro = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        gps = new javax.swing.JCheckBox();
        asiento = new javax.swing.JCheckBox();
        asistencia = new javax.swing.JCheckBox();
        wifiIlimitado = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        seleccionarVehiculo = new javax.swing.JButton();
        txtFechaR = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblIDOP = new javax.swing.JLabel();
        txtIdOp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccionar Vehiculo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Estilo:");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inicio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("a");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("De");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        TipoCB.setEditable(true);
        TipoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sin filtro", "económico", "convertible", "compacto", "pickup", "intermedio", "suv", "minivan" }));
        TipoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoCBActionPerformed(evt);
            }
        });
        getContentPane().add(TipoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 120, -1));

        SedeCB.setForeground(new java.awt.Color(0, 0, 102));
        SedeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sin filtro", "Aeropuerto Juan Santamaria", "Santa Ana", "Paseo Colon", "Paseo de las flores ", "Curridabat" }));
        getContentPane().add(SedeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, -1));

        txtDesde.setText("0");
        txtDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesdeActionPerformed(evt);
            }
        });
        getContentPane().add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 38, -1));

        txtHasta.setText("500");
        getContentPane().add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 48, -1));

        filtrar.setBackground(new java.awt.Color(255, 255, 255));
        filtrar.setForeground(new java.awt.Color(0, 0, 102));
        filtrar.setText("Filtrar");
        filtrar.setBorderPainted(false);
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });
        getContentPane().add(filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 169));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Capacidad de Pasajeros:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMouseClicked(evt);
            }
        });
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 250, 170));

        numPasajeros.setText("0");
        numPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPasajerosActionPerformed(evt);
            }
        });
        getContentPane().add(numPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 70, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Volver");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 720, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 610, 10));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Servicios Extras");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Reservar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Recoger y dejar en:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fin:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 40, 20));

        fechaInicio.setText("DD/MM/YYYY");
        fechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaInicioActionPerformed(evt);
            }
        });
        getContentPane().add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 110, -1));

        fechaFin.setText("DD/MM/YYYY");
        getContentPane().add(fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 110, -1));

        Reservar.setText("Reservar");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });
        getContentPane().add(Reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 700, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        placatxt.setEditable(false);
        getContentPane().add(placatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, 80, -1));

        seguro.setText("Cobertura por daños a terceros");
        getContentPane().add(seguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Placa Vehiculo Selecionado:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, -1, -1));

        gps.setText("GPS");
        getContentPane().add(gps, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        asiento.setText("Asiento para niño");
        getContentPane().add(asiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        asistencia.setText("Asistencia en carretera");
        getContentPane().add(asistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        wifiIlimitado.setText("WiFi ilimitado");
        wifiIlimitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wifiIlimitadoActionPerformed(evt);
            }
        });
        getContentPane().add(wifiIlimitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sedes y fechas");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        seleccionarVehiculo.setText("Seleccionar vehiculo");
        seleccionarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        txtFechaR.setText("DD/MM/YYYY");
        getContentPane().add(txtFechaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 100, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha registro:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        lblIDOP.setForeground(new java.awt.Color(255, 255, 255));
        lblIDOP.setText("Id Operador");
        getContentPane().add(lblIDOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 90, -1));
        getContentPane().add(txtIdOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 100, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 102));
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 780));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void wifiIlimitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wifiIlimitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wifiIlimitadoActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        // TODO add your handling code here:
        if (!txtIdOp.getText().isEmpty() & !placatxt.getText().isEmpty() & SedeCB.getSelectedIndex() != 0) {
        
        String sede = SedeCB.getSelectedItem().toString();
        
        String placa = placatxt.getText();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date parsed = null;
        try {
            parsed = format.parse(fechaInicio.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ServMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date fechaI = new java.sql.Date(parsed.getTime());
        
        java.util.Date parsed2 = null;
        try {
            parsed2 = format.parse(fechaFin.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ServMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.sql.Date fechaFin = new java.sql.Date(parsed2.getTime());
         
        if (fechaI.compareTo(fechaFin) > 0) {
            JOptionPane.showMessageDialog(null, "No puede continuar por que la fecha de inicio es mayor a la fecha de finalización");
        } else{
             if (Conexion.vehiculoReservado(fechaI, fechaFin, placa) == true){
                 JOptionPane.showMessageDialog(null, "Seleccione otro vehiculo");
             }else{
                 try {
                     long daysBetween = DAYS.between(fechaI.toLocalDate(), fechaFin.toLocalDate());
                     int daysInt = Math.toIntExact(daysBetween + 1);
                     
                     Conexion cn = new Conexion();
                     ResultSet rs = cn.vehiculo(placa);
                     rs.next();
                     int precio = rs.getInt("costoDia");
                     
                     boolean wifi = wifiIlimitado.isSelected();
                     boolean asist = asistencia.isSelected();
                     boolean GPS = gps.isSelected();
                     boolean asien = asiento.isSelected();
                     boolean segur = seguro.isSelected();
                     
                     
                     precioTotal = Reserva.calcularPrecio(precio,daysInt,wifi , asist, GPS, asien, segur);
                     double crcPrecio = precioTotal * Servicios.TipoCambio.TipoCambio();
                     
                     
                     try {
                         parsed = format.parse(txtFechaR.getText());
                     } catch (ParseException ex) {
                         Logger.getLogger(ServMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    java.sql.Date fechaR = new java.sql.Date(parsed.getTime());
                     
                     Reserva reserva = new Reserva();
                    
                     
                      int confirmacion = JOptionPane.showConfirmDialog(null, "Cedula cliente: " + idClienteR + "\n Vehiculo placa: " + placa + "\n fecha Inicio: " +
                fechaI + "\n Fecha Fin: " + fechaFin + "\n Sede: " + sede + "\n Precio Total: " + precioTotal +"USD"+"\n Precio en colones:"+ crcPrecio);
                         if(confirmacion == JOptionPane.YES_OPTION)  {       
                            reserva.setIdReserva(idReserva);
                            reserva.setFechaInicio(fechaI);
                            reserva.setFechaFinal(fechaFin);
                            reserva.setFechaRegistro(fechaR);
                            reserva.setIdVehiculo(placa);
                            reserva.setIdOperador(Integer.parseInt(txtIdOp.getText()));
                            reserva.setPrecioTotal(precioTotal);
                            reserva.setIdCliente(idClienteR);
                            reserva.setSede(sede);
                            
                            String puntoA = new LatLng(getRandom(-99.0, 99.0),getRandom(-99.0, 99.0)).toString();
                            String puntoB = new LatLng(getRandom(-99.0, 99.0),getRandom(-99.0, 99.0)).toString();
                            reserva.setPuntoInicial(puntoA);
                            reserva.setPuntoFinal(puntoB);
                     
                            ReservaOp.registrarReserva(reserva);
                            idReserva ++;
                            crearPDF pdf = new crearPDF();
                            int idFactura = Factura.numeroFactura;
                            pdf.crear(idFactura,placatxt.getText(),SedeCB.getSelectedItem().toString(),txtIdOp.getText(),precioTotal);
                            impresionCorreo imp = new impresionCorreo();
                            imp.setVisible(true);
                         } else if (confirmacion == JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null, "Has seleccionado NO."); }
                        
                 } catch (SQLException ex) {
                     Logger.getLogger(Filtrar.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(Filtrar.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (DocumentException ex) {
                     Logger.getLogger(Filtrar.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
        }
        }  else {
        JOptionPane.showMessageDialog(null, "Por favor llenar todos los campos");
        }

    }//GEN-LAST:event_ReservarActionPerformed

    private void seleccionarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarVehiculoActionPerformed
        // TODO add your handling code here:
        int selectedRow = Filtrados.getSelectedRow();
        String placa = Filtrados.getModel().getValueAt(selectedRow,0).toString();
        placatxt.setText(placa);
        
    }//GEN-LAST:event_seleccionarVehiculoActionPerformed

    private void fechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaInicioActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Filtrados;
    private javax.swing.JButton Reservar;
    private javax.swing.JComboBox<String> SedeCB;
    private javax.swing.JComboBox<String> TipoCB;
    private javax.swing.JCheckBox asiento;
    private javax.swing.JCheckBox asistencia;
    private javax.swing.JTextField fechaFin;
    private javax.swing.JTextField fechaInicio;
    private javax.swing.JToggleButton filtrar;
    private javax.swing.JCheckBox gps;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblIDOP;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField numPasajeros;
    private javax.swing.JTextField placatxt;
    private javax.swing.JCheckBox seguro;
    private javax.swing.JButton seleccionarVehiculo;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtFechaR;
    private javax.swing.JTextField txtHasta;
    private javax.swing.JTextField txtIdOp;
    private javax.swing.JCheckBox wifiIlimitado;
    // End of variables declaration//GEN-END:variables
}
