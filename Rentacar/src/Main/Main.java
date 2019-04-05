/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Apis.enviarCorreo;
import Interfaz.Login;

/**
 *
 * @author marip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion.Conexion.getConexion();
        System.out.println("La conexión se realizó correctamente");
        
       Login login = new Login();
       login.setVisible(true);
    }
    
}
