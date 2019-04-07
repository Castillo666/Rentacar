/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author Raquel Rojas
 */
public class TipoCambio {
    public static Double TipoCambio() {

        Document docu;
        try {
            docu = Jsoup.connect("http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/cuadros/frmvercatcuadro.aspx?CodCuadro=400").get();
            Elements tipoCambio = docu.select("td.celda400");
            
            return Double.parseDouble(tipoCambio.last().html().replace(",","."));

        }catch(IOException e){
            System.out.println(e);
            
            
        }
        return 0.0;
    }
    
}
