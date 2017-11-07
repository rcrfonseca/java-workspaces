package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import entity.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 

throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 

throws ServletException, IOException {	

	Mensagem m = new Mensagem(
			
			request.getParameter("remetente"),
			request.getParameter("destinatario"),
			request.getParameter("assunto"),
			request.getParameter("mensagem")
			);
	
	
	try{
		Properties p = new Properties();
	    p.put("mail.transport.protocol", "smtp");
	    p.put("mail.smtp.host", "smtp.mail.yahoo.com.br");
	    p.put("mail.smtp.auth", "true");
	    
	    Authenticator auth = new SMTPAuthenticator();
	    Session session = Session.getInstance(p, auth);
	    Transport transport = session.getTransport();
	    
	    MimeMessage msg = new MimeMessage(session);
	    
	    msg.setFrom(new InternetAddress(m.getRemetente()));
	    msg.setRecipient(Message.RecipientType.TO,    
	                                             new 

InternetAddress(m.getDestinatario()));
	   msg.setSentDate(new Date());
	   msg.setSubject(m.getAssunto());
	   msg.setText(m.getMensagem());
	   
	   transport.connect();
	   transport.sendMessage(msg, msg.getRecipients(Message.RecipientType.TO));
	   response.getWriter().print("Email Enviado com sucesso...");
	    
    	    
	    
	}catch(Exception e) {
		response.getWriter().print(e.getLocalizedMessage());
	}
	
	}
	
	
	class SMTPAuthenticator extends javax.mail.Authenticator{
		
		@Override
		protected PasswordAuthentication getPasswordAuthentication(){
			String username="teste.cotiinformatica";
			String senha="@teste";
			return new PasswordAuthentication(username,senha);
		}
	}
}