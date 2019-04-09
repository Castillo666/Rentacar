/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Apis.enviarCorreo;
import Conexion.Conexion;
import Interfaz.Login;
import Servicios.Password;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author marip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        int idClienteReserva = 0;
        
        Conexion.getConexion();
        System.out.println("La conexión se realizó correctamente");
        
       Login login = new Login();
       login.setVisible(true);    
    }
    
}
