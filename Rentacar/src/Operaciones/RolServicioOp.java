package Operaciones;

import Conexion.Conexion;
import Entidades.Empresa;
import Entidades.RoldeServicio;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RolServicioOp {
    public static String registrarRoldeServicio(RoldeServicio rolServicio) {
        String result = null, last = null;
        Conexion cc = new Conexion();
        Connection cn = cc.getConexion();
        PreparedStatement pst = null;
        String sql = "INSERT INTO esquema.roldeServicio VALUES(?,?)";
        try {
            if (cn != null) {
                pst = cn.prepareStatement(sql);
                pst.setString(1, rolServicio.getUsuario());
                pst.setString(2, rolServicio.getContraseña());
                
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
