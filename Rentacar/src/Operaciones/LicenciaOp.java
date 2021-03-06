/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import Conexion.Conexion;
import Entidades.Licencia;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marip
 */
public class LicenciaOp {
    
    
    
     public static String registrarLicencia(Licencia licencia) {
        String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO esquema.licencia(cedula,fechaEmision,tipo,fechaExpiracion) VALUES(?,?,?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setInt(1, licencia.getCedula());
                pst.setDate(2, (Date) licencia.getFechaEmision());
                pst.setString(3, licencia.getTipo());
                pst.setDate(4, (Date) licencia.getFechaExpiracion());
                
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
