/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.Conexion;
import Entidades.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marip
 */
public class EmpresaOp {
    
       public static String registrarEmpresa(Empresa empresa) {
        String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO esquema.empresa VALUES(?,?,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, empresa.getCedulaJuridica());
                pst.setString(2, empresa.getRazonSocial());
                pst.setString(3, empresa.getTelefono());
                pst.setInt(4, empresa.getIdProvincia());
                pst.setInt(5, empresa.getIdCanton());
                pst.setInt(6, empresa.getIdDistrito());
                pst.setString(7, empresa.getSeñas());
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
     
     /* public static String actualizarCliente(Cliente cliente) {
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

   public static ProveedoresVO buscarProveedores(String clave) {
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
       */
    
}
