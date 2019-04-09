/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;


import Conexion.Conexion;
import Entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author marip
 */
public class ReservaOp {
     public static String registrarReserva(Reserva reserva) {
    String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO esquema.reserva VALUES(?,?,?,?,?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, reserva.getIdReserva());
                pst.setDate(2,(Date) reserva.getFechaInicio());
                pst.setDate(3, (Date) reserva.getFechaFinal() );
                pst.setDate(4,(Date) reserva.getFechaRegistro() );
                pst.setInt(5, reserva.getIdOperador());
                pst.setString(6, reserva.getIdVehiculo());
                pst.setInt(7, reserva.getIdCliente());
                pst.setDouble(8, reserva.getPrecioTotal());
                pst.execute();
             
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
