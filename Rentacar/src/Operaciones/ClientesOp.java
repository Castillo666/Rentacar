/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Conexion.Conexion;
import Entidades.Cliente;
import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author marip
 */
public class ClientesOp {
    
     public static String registrarCliente(Cliente cliente,File file) {
        String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO esquema.cliente(cedula,nombreCompleto,direccion,correo,telefono,fotoLicencia) VALUES(?,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, cliente.getCedula());
                pst.setString(2, cliente.getNombreCompleto());
                pst.setString(3, cliente.getDireccion());
                pst.setString(4, cliente.getCorreo());
                pst.setString(5, cliente.getTelefono());
                
                FileInputStream fis = new FileInputStream(file);
                
                pst.setBinaryStream(6, fis, (int) file.length());
                
                pst.executeUpdate();
             
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            }
            } catch (Exception e) {
                result = "Error " + e;
            }
        return result;
    }
     
      public static String actualizarCliente(Cliente cliente) {
        String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "UPDATE esquema.cliente SET nombreCompleto=?,direccion=?,correo=?,telefono=? WHERE cedula=?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, cliente.getNombreCompleto());
            pst.setString(2, cliente.getDireccion());
            pst.setString(3, cliente.getCorreo());
            pst.setString(4, cliente.getTelefono());
            pst.setInt(5, cliente.getCedula());
            pst.execute();

            result = "Cliente actualizado con exito, cedula:" + cliente.getCedula();
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error: " + e;
            }
        }
        return result;
    }

 /*   public static ProveedoresVO buscarProveedores(String clave) {
        ProveedoresVO prov = new ProveedoresVO();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT * FROM proveedores WHERE id_proveedor = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, clave);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                prov.setId_proveedor(Integer.parseInt(rs.getString(1)));
                prov.setNombre(rs.getString(2));
                prov.setTelefono(rs.getString(3));
                prov.setDireccion(rs.getString(4));
                prov.setEmail(rs.getString(5));
            }
            prov.setResultado("Busqueda exitosa");
        } catch (SQLException e) {
            prov.setResultado("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                prov.setResultado("Error: " + e);
            }
        }
        return prov;
    }
      */

    public static String eliminarCliente(String cedula) {
        String result = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "DELETE FROM cliente WHERE cedula = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, cedula);
            pst.executeUpdate();
            result = "Cliente eliminado con exito";
        } catch (SQLException e) {
            result = "Error en la consulta: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                result = "Error: " + e;
            }
        }
        return result;
    }
    
    
}
