package Apis;

import Entidades.Factura;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
 
public class crearPDF
{
   public static void crear(int idfactura,String placa,String sede,String idOperador,double precio) throws FileNotFoundException, DocumentException{
         Document document = new Document();
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Factura.pdf"));
         document.open();
         try
        {
	Image foto = Image.getInstance("C:\\Users\\Dell\\Desktop\\Logo.png");
	foto.scaleToFit(150, 150);
	foto.setAlignment(Chunk.ALIGN_MIDDLE);
	document.add(foto);
        }
        catch ( Exception e )
        {
	e.printStackTrace();
        }
        document.add(new Paragraph("\n• Número de factura_________________________"+""+idfactura,
				FontFactory.getFont("times",   // fuente
				20,                                      // tamaño
				Font.BOLD,                             // estilo
				BaseColor.DARK_GRAY)));                       // color
        
        document.add(new Paragraph("\n• Placa del vehículo_________________________"+""+placa,
				FontFactory.getFont("times",   // fuente
				20,                                      // tamaño
				Font.BOLD,                             // estilo
				BaseColor.DARK_GRAY)));                       // color
        document.add(new Paragraph("\n• Sede_________________________"+""+sede,
				FontFactory.getFont("times",   // fuente
				20,                                      // tamaño
				Font.BOLD,                             // estilo
				BaseColor.DARK_GRAY)));                       // color
        document.add(new Paragraph("\n• IdOperador_________________________"+""+idOperador,
				FontFactory.getFont("times",   // fuente
				20,                                      // tamaño
				Font.BOLD,                             // estilo
				BaseColor.DARK_GRAY)));                       // color
        document.add(new Paragraph("\n• Precio_________________________"+" $"+precio,
				FontFactory.getFont("times",   // fuente
				20,                                      // tamaño
				Font.BOLD,                             // estilo
				BaseColor.DARK_GRAY)));                       // color
         document.close();
   }
}