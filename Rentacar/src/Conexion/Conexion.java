/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 *
 * @author marip
 */
public class Conexion {
    
    static Connection contacto = null;
   
    public static Connection getConexion(){
    
        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=rentacar";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
    
        try {
            contacto = DriverManager.getConnection(url,"sa","sa");
        } catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Erro" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        
        }
        return contacto;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public static int login(String usuario, String password) throws SQLException{
        Connection conexion = getConexion();
        
        Integer resultado = 0;
        try {
            Statement ejecutor = conexion.createStatement();
        ResultSet rs = ejecutor.executeQuery("Select * from esquema.roldeServicio Where usuario = '"+usuario+"' and contraseña = '"+password+"'");
        
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Bienvenido");
                resultado = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                resultado = 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar " +e.getMessage(),e.getMessage(), JOptionPane.ERROR_MESSAGE);
        
        }
        return resultado;
    }
    
      public static int existeCliente(String cedula) throws SQLException{
        Connection conexion = getConexion();
        
        Integer resultado = 2;
        try {
            Statement ejecutor = conexion.createStatement();
        ResultSet rs = ejecutor.executeQuery("Select * from esquema.cliente Where cedula = '"+cedula+"'");
            
        
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "El cliente ya existe");
                resultado = 0;
            } else {
                resultado = 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar " +e.getMessage(),e.getMessage(), JOptionPane.ERROR_MESSAGE);
        
        }
        return resultado;
    }
    
    
}
