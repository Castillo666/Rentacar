/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.Conexion;
import Entidades.Servicio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author marip
 */
public class ServMantenimientoOp {
    
    public static String registrarServMantenimiento(Servicio servicio){
        
        
        String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO esquema.servicio VALUES(?,?,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, servicio.getIdServicio());
                pst.setDate(2, (Date) servicio.getFechaInicio());
                pst.setDate(3, (Date) servicio.getFechaFin());
                pst.setInt(4, servicio.getMonto());
                pst.setString(5, servicio.getDetalle());
                pst.setString(6, servicio.getTipoServicio());
                pst.setInt(7, servicio.getIdEmpresa());
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
