/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.Conexion;
import Entidades.Vehiculo;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author marip
 */
public class VehiculoOp {
    
     public static String registrarVehiculo(Vehiculo vehiculo,File file) {
        String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO esquema.vehiculo(placa,añoFabricacion,direccion,correo,telefono,fotoLicencia) VALUES(?,?,?,?,?,?)";
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
    
    
}
