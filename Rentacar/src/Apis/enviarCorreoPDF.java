package Apis;

import com.itextpdf.text.Document;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class enviarCorreoPDF {
   
    public static void enviar_correo(String to, String sub,String msg){
        Properties props = new Properties();
        
        final String user = "rentacarkpr@gmail.com";
        final String pass = "prograbases1";
        
        //acá se crea la conexion con el ap de java para correos
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        //CREA UN AUTENTICADOR EN PARA PODER REALIZAAR LA VALIDACIÓN
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            public PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user,pass);
            }
        });

        try 
        {
            Message message = new MimeMessage(session);
            //Aqui
            // Se compone la parte del texto
            BodyPart texto = new MimeBodyPart();
            texto.setText(msg);
            
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(
                new DataHandler(new FileDataSource("Factura.pdf")));
            adjunto.setFileName("Factura:(.pdf");
            
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);
            //cierra


            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
           message.setText(msg);
            message.setContent(multiParte);//


            Transport.send(message);

        } 
        catch (MessagingException e){
            System.out.println(e);
        }

    }
    
}