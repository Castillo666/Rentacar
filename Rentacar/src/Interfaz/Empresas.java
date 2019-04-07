/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Entidades.Empresa;
import Operaciones.EmpresaOp;

/**
 *
 * @author marip
 */
public class Empresas extends javax.swing.JFrame {

    /**
     * Creates new form Empresa
     */
    public Empresas() {
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

        lblTitulo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblRazon = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblCanton = new javax.swing.JLabel();
        lblDistrito = new javax.swing.JLabel();
        txtRazon = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblSeñas = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        txtCanton = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        txtSeñas = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Nueva Empresa");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 152, -1));

        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setText("Cédula Jurídica: ");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        lblRazon.setForeground(new java.awt.Color(255, 255, 255));
        lblRazon.setText("Razón Social:");
        getContentPane().add(lblRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Teléfono:");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        lblProvincia.setForeground(new java.awt.Color(255, 255, 255));
        lblProvincia.setText("Id Provincia:");
        getContentPane().add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        lblCanton.setForeground(new java.awt.Color(255, 255, 255));
        lblCanton.setText("Id Canton:");
        getContentPane().add(lblCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        lblDistrito.setForeground(new java.awt.Color(255, 255, 255));
        lblDistrito.setText("Id Distrito:");
        getContentPane().add(lblDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
        getContentPane().add(txtRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 156, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 160, -1));

        lblSeñas.setForeground(new java.awt.Color(255, 255, 255));
        lblSeñas.setText("Señas:");
        getContentPane().add(lblSeñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));
        getContentPane().add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 160, -1));
        getContentPane().add(txtCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 160, -1));
        getContentPane().add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, -1));
        getContentPane().add(txtSeñas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 189, 62));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 102));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setForeground(new java.awt.Color(0, 0, 102));
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        lblFondo.setBackground(new java.awt.Color(0, 0, 102));
        lblFondo.setOpaque(true);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Empresa emp = new Empresa();
          
        emp.setCedulaJuridica(Integer.parseInt(txtCedula.getText()));
        emp.setRazonSocial(txtRazon.getText());
        emp.setTelefono(txtTelefono.getText());
        emp.setIdProvincia(Integer.parseInt(txtProvincia.getText()));
        emp.setIdCanton(Integer.parseInt(txtCanton.getText()));
        emp.setIdDistrito(Integer.parseInt(txtDistrito.getText()));
        emp.setSeñas(txtSeñas.getText());
        
        EmpresaOp.registrarEmpresa(emp);
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblCanton;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDistrito;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblRazon;
    private javax.swing.JLabel lblSeñas;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCanton;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtRazon;
    private javax.swing.JTextField txtSeñas;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
