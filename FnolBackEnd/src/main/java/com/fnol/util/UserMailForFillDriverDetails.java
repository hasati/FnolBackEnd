package com.fnol.util;


import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.PasswordAuthentication;

import org.springframework.stereotype.Service;

@Service
public class UserMailForFillDriverDetails {
		
	  public  void sendHtmlEmail(String name,String emailId,String caseNumber) throws AddressException,
	            MessagingException {
	 
		    String host = "smtp.gmail.com";
	        String port = "587";
	        
	        // sets SMTP server properties
	        Properties properties = new Properties();
	        properties.put("mail.smtp.host", host);
	        properties.put("mail.smtp.port", port);
	        properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.starttls.enable", "true");
	        properties.setProperty("mail.transport.protocol", "smtp");
	        

String messageBody = "<html>"+
"  <body align=\"center\" style=\"-webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; background: #e0e0e0; box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; height: 100%; line-height: 1.7; margin: 0; padding: 0; width: 100% !important\" bgcolor=\"#e0e0e0\">"+
"    <style type=\"text/css\">"+
"img {"+
"max-width: 100%; display: block;"+
"}"+
"body {"+
"-webkit-font-smoothing: antialiased; -webkit-text-size-adjust: none; width: 100% !important; height: 100%; line-height: 1.7;"+
"}"+
"body {"+
"background-color: #01191D;"+
"}"+
".ExternalClass {"+
"width: 100%;"+
"}"+
"body {"+
"background-color: #e0e0e0;"+
"}"+
"</style>"+
"    <table align=\"center\" class=\"body-wrap\" style=\"background: #e0e0e0; box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0; width: 100%; word-break: break-word\" bgcolor=\"#e0e0e0\">"+
"      <tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"        <td align=\"center\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0 auto; padding: 0; vertical-align: top\" valign=\"top\">"+
"          <table style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"            <tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"              <td class=\"container\" width=\"600\" style=\"box-sizing: border-box; clear: both !important; display: block !important; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0 auto; max-width: 600px !important; padding: 0; vertical-align: top\" valign=\"top\">"+
"                <div class=\"content\" style=\"box-sizing: border-box; display: block; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0 auto; max-width: 600px; padding: 12px 20px 20px\">"+
"				<table class=\"main\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"background: #FFFFFF; box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\" bgcolor=\"#FFFFFF\">"+
"				<tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<td class=\"content-wrap\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0 auto; padding: 0 20px 20px; vertical-align: top\" valign=\"top\">"+
"				<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<td class=\"content-block aligncenter\" style=\"box-sizing: border-box; color: #2e2e2e; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 16px; line-height: 1.7; margin: 0 auto; padding: 20px 0; text-align: center; vertical-align: top\" align=\"center\" valign=\"top\">"+
"				<div align=\"center\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<img width=\"520\" src=\"cid:image1\" alt=\"\" style=\"box-sizing: border-box; display: inline-block; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; max-width: 100%; padding: 0\" />"+
"				</div></td></tr><tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<td class=\"content-block\" style=\"box-sizing: border-box; color: #2e2e2e; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 16px; line-height: 1.7; margin: 0 auto; padding: 20px 0; vertical-align: top\" valign=\"top\">"+
"				<h1 class=\"wysiwyg-text-align-center\" style=\"box-sizing: border-box; color: rgb(63, 63, 63); font-family: 'Helvetica Neue', Helvetica, Arial, 'Lucida Grande', sans-serif; font-size: 28px; font-weight: bold; line-height: 1.7; margin: 0; padding: 0; text-align: center !important\" align=\"center\">Confidence Behind The Wheel. Car  Insurance Prices From  $175!</h1></td></tr>"+
"				<tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\"><td class=\"content-block\" style=\"box-sizing: border-box; color: #2e2e2e; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 16px; line-height: 1.7; margin: 0 auto; padding: 20px 0; vertical-align: top\" valign=\"top\">"+
"				<div class=\"wysiwyg-text-align-center\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0; text-align: center !important\" align=\"center\">Hi "+ name +"<br>"+
"				<div class=\"wysiwyg-text-align-center\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0; text-align: center !important\" align=\"center\">Every Single Auto Insurance Plan That We Do Have To Offer Is Personalized, As You Provide Us The Basic Details About Yourself & Your Vehicle."+
"				<br style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\" /><b style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">Feel Protected On The Road</b><br style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\" /></div></td></tr>"+
"				<tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\"><td class=\"content-block aligncenter\" style=\"box-sizing: border-box; color: #2e2e2e; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 16px; line-height: 1.7; margin: 0 auto; padding: 20px 0; text-align: center; vertical-align: top\" align=\"center\" valign=\"top\">"+
"				<a href='http://localhost:8089/FnolFrontEnd/#!/driverDetails/"+caseNumber+"' target=\"_blank\" class=\"btn-primary btn-block\" style=\"background: #62A30C; border-radius: 5px; box-sizing: border-box; color: #FFFFFF; cursor: pointer; display: block; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; font-weight: bold; line-height: 2; margin: 0; padding: 10px 35px; text-align: center; text-decoration: none\">Accept Proposal</a></td></tr>"+
"				<tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\"><td width=\"514\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0 auto; padding: 0; vertical-align: top\" valign=\"top\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<td width=\"33.3%\" height=\"104\" class=\"content-block-grid threecolumn-image-left aligncenter\" style=\"box-sizing: border-box; color: #2e2e2e; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 16px; line-height: 1.7; margin: 0 auto; padding: 20px 5px 0px 0; text-align: center; vertical-align: top\" align=\"center\" valign=\"top\"><div align=\"center\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<img width=\"166\" src=\"cid:image2\" alt=\"\" style=\"box-sizing: border-box; display: block; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; max-width: 100%; padding: 0\" /></div></td><td width=\"33.3%\" height=\"104\" class=\"content-block-grid threecolumn-image-middle aligncenter\" style=\"box-sizing: border-box; color: #2e2e2e; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 16px; line-height: 1.7; margin: 0 auto; padding: 20px 0px 0px; text-align: center; vertical-align: top\" align=\"center\" valign=\"top\">"+
"				<div align=\"center\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<img width=\"166\" src=\"cid:image3\" alt=\"\" style=\"box-sizing: border-box; display: block; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; max-width: 100%; padding: 0\" /></div></td><td width=\"33.3%\" height=\"104\" class=\"content-block-grid threecolumn-image-right aligncenter\" style=\"box-sizing: border-box; color: #2e2e2e; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 16px; line-height: 1.7; margin: 0 auto; padding: 20px 0 0px 5px; text-align: center; vertical-align: top\" align=\"center\" valign=\"top\">"+
"				<div align=\"center\" style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\"><img width=\"166\" src=\"cid:image4\" alt=\"\" style=\"box-sizing: border-box; display: block; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; max-width: 100%; padding: 0\" /></div></td></tr><tr style=\"box-sizing: border-box; font-family: 'Helvetica Neue', 'Helvetica', Helvetica, Arial, sans-serif; margin: 0; padding: 0\">"+
"				<td width=\"33.3%\" class=\"content-block-grid threecolumn-text-left\" style=\"box-sizing: border-box; color: #2e2e2e; font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 16px; line-height: 1.7; margin: 0 auto; padding: 15px 5px 20px 0; vertical-align: top\" valign=\"top\"> "+
""+
"              </td>"+
"            </tr>"+
"          </table>"+
"        </td>"+
"      </tr>"+
"    </table>"+
"  </body>"+
"</html>";
	

System.out.println(messageBody);

	        
	        
	        Session session = Session.getDefaultInstance(properties,  
	        	    new javax.mail.Authenticator() {  
	        	      protected PasswordAuthentication getPasswordAuthentication() {  
	        	    return new PasswordAuthentication("himanshuasati249@gmail.com","himanshu248");  
	        	      }  
	        	    });  
	        
	        MimeMultipart multipart = new MimeMultipart("related");
	        BodyPart messageBodyPart = new MimeBodyPart();
	        MimeMessage message = new MimeMessage(session);
	        message.setSubject("Motor Insurance");
	        message.setFrom(new InternetAddress("himanshuasati249@gmail.com"));
	        message.addRecipient(Message.RecipientType.TO,
	             new InternetAddress(emailId));
	    
	        messageBodyPart.setContent(messageBody, "text/html");

	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds1 = new FileDataSource(UserMailForFillDriverDetails.class.getResource("/1.png").getFile());
	         messageBodyPart.setDataHandler(new DataHandler(fds1));
	         messageBodyPart.setHeader("Content-ID", "<image1>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds2 = new FileDataSource(UserMailForFillDriverDetails.class.getResource("/2.jpg").getFile());
	         messageBodyPart.setDataHandler(new DataHandler(fds2));
	         messageBodyPart.setHeader("Content-ID", "<image2>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds3 = new FileDataSource(UserMailForFillDriverDetails.class.getResource("/3.jpg").getFile());
	         messageBodyPart.setDataHandler(new DataHandler(fds3));
	         messageBodyPart.setHeader("Content-ID", "<image3>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds4 = new FileDataSource(UserMailForFillDriverDetails.class.getResource("/4.jpg").getFile());
	         messageBodyPart.setDataHandler(new DataHandler(fds4));
	         messageBodyPart.setHeader("Content-ID", "<image4>");
	         multipart.addBodyPart(messageBodyPart);

	         message.setContent(multipart);
	        Transport.send(message);  
	 
	    }
	 
}
