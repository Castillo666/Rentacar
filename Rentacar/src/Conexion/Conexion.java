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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marip
 */
public class Conexion {
    
    static Connection contacto = null;
   
    public static Connection getConexion(){
    
        String url = "jdbc:sqlserver://localhost\\\\SQLEXPRESS:1433;databaseName=rentacar";
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
        
        int resultado = 2;
        try {
            Statement ejecutor = conexion.createStatement();
        ResultSet rs = ejecutor.executeQuery("Select 1 from esquema.cliente Where cedula = '"+cedula+"'");
            
        
            if (rs.next()){
                resultado = 0;
            } else {
                resultado = 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar " +e.getMessage(),e.getMessage(), JOptionPane.ERROR_MESSAGE);
        
        }
        return resultado;
    }
      
    public ResultSet vehiculosFiltrados(String estilo,String sede, int desde, int hasta,int pasajero){
        Connection cn;
        PreparedStatement pst;
        ResultSet rs = null;
        boolean existeFiltro = false;
        try{
           cn = getConexion(); 
           String Where = "";
           if (estilo != "sin filtro"){
            existeFiltro = true;
            Where = Where + " WHERE (estilo='" + estilo + "')";
           }
           if (sede != "sin filtro"){
                if (existeFiltro == true){
                   Where = Where + " and (sede = '"+ sede +"')";
                }else{
                   Where = " WHERE (sede = '"+ sede +"')";
                   existeFiltro = true;}
           }
           if ( desde != 0){
                if (existeFiltro == true){
                    Where = Where + " and (CostoDia >= "+ desde +")";
                }else{
                    Where = " WHERE (CostoDia >= "+ desde +")";
                    existeFiltro = true;}
           }
           if (hasta != 500){
                if (existeFiltro == true){
                    Where = Where + " and (CostoDia <= "+ hasta +")";
                }else{
                    Where = " WHERE (costoDia <= "+ hasta +")";
                    existeFiltro = true;}
           }
           if (pasajero != 0){
                if (existeFiltro == true){
                    Where = Where + " and (capacidad = "+ pasajero +")";
                }else{
                    Where = " WHERE (capacidad = "+ pasajero +")";
                    existeFiltro = true;}
           }
           if (existeFiltro == true){
            pst = cn.prepareStatement("SELECT * FROM esquema.vehiculo " + Where + " and (estado = 'activo')");
           }else{
            pst = cn.prepareStatement("SELECT * FROM esquema.vehiculo and (estado = 'activo')");
           }
           
           rs = pst.executeQuery();
        }catch(Exception e){ 
            System.out.println("Hubo error 1" + e);
        }
        return rs;
    }
    public ResultSet vehiculo(String placa) throws SQLException{
        Connection cn;
        PreparedStatement pst;
        ResultSet rs = null;
        cn = getConexion();
        try {
            pst = cn.prepareStatement("SELECT * FROM esquema.vehiculo WHERE placa = '" + placa + "'");
            System.out.println("SELECT * FROM esquema.vehiculo WHERE placa = '" + placa + "'");
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    
     public static ResultSet obtenerCliente(String cedula){
        Connection cn;
        PreparedStatement pst;
        ResultSet rs = null;
        cn = getConexion();
        try {
            pst = cn.prepareStatement("SELECT * FROM esquema.cliente WHERE cedula = '" + cedula + "'");
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
     public static boolean vehiculoReservado (Date fechaInicio, Date fechaFin, String placa){
         Connection conexion = getConexion();
        
        boolean resultado = false;
        try {
            Statement ejecutor = conexion.createStatement();
        ResultSet rs = ejecutor.executeQuery("Select fechaInicio, fechaFin, idVehiculo from esquema.reserva  Where idVehiculo = '"+placa+"' AND ('"+fechaInicio+"' between fechaInicio and fechaFin) AND ('"+fechaFin+"' between fechaInicio and fechaFin)");
        
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Vehiculo reservado");
                resultado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Vehiculo Disponible");
                resultado = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar " +e.getMessage(),e.getMessage(), JOptionPane.ERROR_MESSAGE);
        
        }
        return resultado;
     
     }
     
     public ResultSet reservaFiltrada(String sede,String placa, int idOperador){
        PreparedStatement pst;
        ResultSet rs = null;
        boolean existeFiltro = false;
        try{
           Connection cn = getConexion(); 
           String Where = "";
           if (sede != "cualquiera"){
            existeFiltro = true;
            Where = Where + " WHERE (sede='" + sede + "')";
           }
           if ("0".equals(placa)){int i = 1;
           }else{
                if (existeFiltro == true){
                   Where = Where + " and (idVehiculo = '"+ placa +"')";
                }else{
                   Where = " WHERE (idVehiculo = '"+ placa +"')";
                   existeFiltro = true;}
           }
           if ( idOperador != 0){
                if (existeFiltro == true){
                    Where = Where + " and (idOperador= "+ idOperador +")";
                }else{
                    Where = " WHERE (idOperador= "+ idOperador +")";
                    existeFiltro = true;}
           }
           /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           Date date1 = sdf.parse("0000-00-000");
           if (fechaInicio.compareTo(date1) == 0 ){
               fechaInicio = date1;
           }else{
                if (existeFiltro == true){ 
                    Where = Where + " and (fechaInicio = '"+ fechaInicio+"' )";
                }else{
                    Where = " WHERE (fechaInicio = '"+ fechaInicio+"' )";
                    existeFiltro = true;}
           }*/
           if (existeFiltro == true){
            pst = cn.prepareStatement("SELECT * FROM esquema.reserva " + Where);
            System.out.println("SELECT * FROM esquema.reserva " + Where);
           }else{
            pst = cn.prepareStatement("SELECT * FROM esquema.reserva");
           }
           
           rs = pst.executeQuery();
        }catch(Exception e){System.out.println("1" + e); 
            
        }
        return rs;
    }
     public static boolean existeOperador(int idO){
      Connection conexion = getConexion();
      boolean resultado = false;
        try {
           Statement ejecutor = conexion.createStatement();
           ResultSet rs = ejecutor.executeQuery("Select cedula from esquema.operador  Where idOperador = '" + idO + "'");
            if (rs.next()){
                resultado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Operador no registrado");
                resultado = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar " +e.getMessage(),e.getMessage(), JOptionPane.ERROR_MESSAGE);
        
        }
        return resultado;
      
     }
     
     
    
    
}
