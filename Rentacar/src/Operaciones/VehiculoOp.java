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
        String sql = "INSERT INTO esquema.vehiculo(placa,añoFabricacion,color,marca,capacidad,kilometraje,numeroPuertas,vin,mpg,costoDia,"
                + "capacidadMaletas,transmision,sede,estilo,estado,idServicio,fotoVehiculo) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, vehiculo.getPlaca());
                pst.setInt(2, vehiculo.getAñoFabricacion());
                pst.setString(3, vehiculo.getColor());
                pst.setString(4, vehiculo.getMarca());
                pst.setInt(5, vehiculo.getCapacidad());
                pst.setInt(6, vehiculo.getKilometraje());
                pst.setInt(7, vehiculo.getNumeroPuertas());
                pst.setString(8, vehiculo.getVin());
                pst.setInt(9, vehiculo.getMpg());
                pst.setInt(10, vehiculo.getCostoDia());
                pst.setInt(11, vehiculo.getCapacidadMaletas());
                pst.setString(12, vehiculo.getTransmision());
                pst.setString(13, vehiculo.getSede());
                pst.setString(14, vehiculo.getEstilo());
                pst.setString(15, vehiculo.getEstado());
                pst.setInt(16, vehiculo.getIdServicio());
                
                FileInputStream fis = new FileInputStream(file);
                
                pst.setBinaryStream(17, fis, (int) file.length());
                
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
