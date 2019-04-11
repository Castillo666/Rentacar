/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import Entidades.Operador;

/**
 *
 * @author marip
 */
public class OperadorOp {
    
    public static String registrarOperador(Operador operador) {
    String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO esquema.operador VALUES(?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, operador.getCedula());
                pst.setString(2,operador.getNombre());
                pst.setString(3,operador.getCorreo());
                pst.setString(4,operador.getTelefono());
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
