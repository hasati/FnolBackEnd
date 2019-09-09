package com.fnol.util;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.stereotype.Service;

@Service
public class AgentMailForVerfiy {

	public void sendHtmlEmail(String name, String emailId, String caseNumber)
			 {

		String host = "smtp.gmail.com";
		String port = "587";

		// sets SMTP server properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.transport.protocol", "smtp");
		Session session = Session.getDefaultInstance(properties,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(
								"himanshuasati249@gmail.com", "himanshu248");
					}
				});

		String messageBody = "<html>"
				+ "<body>"
				+ "<table bgcolor=\"#ffffff\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\" class=\"m_1787861041295368251devicewidth\" style=\"border-collapse:collapse;border-spacing:0\">"
				+ "                                       <tbody>"
				+ "                                          <tr>"
				+ "                                             <td style=\"padding:0px;padding-left:25px;padding-right:25px\">"
				+ "                                                <table width=\"100%\" border=\"0\" style=\"border-collapse:collapse;border-spacing:0\">"
				+ "                                                   <tbody>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"16\"> </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:bold\">Hi Himanshu Asati,</td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"8\"> </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:normal\">First Step is completed by Himanshu Asati</td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"8\"> </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:normal\">"
				+ "                                                           Please <strong>verfiy</strong> all the related document and given data. Case Number is H898948AXDFG"
				+ "                                                         </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"8\"> </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:normal\">Click on the button below to verify the details</td>"
				+ "                                                      </tr>"
				+ "													  "
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"16\"> </td>"
				+ "                                                      </tr>"
				+ "                                                   </tbody>"
				+ "                                                </table>"
				+ "                                             </td>"
				+ "                                          </tr>"
				+ "                                       </tbody>"
				+ "                                    </table>"
				+ "									"
				+ "									<table style=\" margin-left: 19px;\">"
				+ "                                       <tbody>"
				+ "                                          <tr>"
				+ "                                             <td>"
				+ "                                                <table style=\"border-collapse:collapse;border-spacing:0\" width=\"188\" class=\"m_1787861041295368251button-block\">"
				+ "                                                   <tbody>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"background-color:#d7263d;text-align:center;color:#ffffff;border-radius:3px;font-size:18px;text-decoration:none;font-weight:bold\"><a href=\"#\" style=\"margin:0;padding:0px 3px 0px 3px;display:block;color:#ffffff;font-size:14px;line-height:16px;font-family:Arial,Helvetica,sans-serif;text-align:center;font-weight:bold;text-align:center;text-decoration:none;border:12px solid #d7263d;border-radius:3px\" target=\"_blank\" >CliCk here</a></td>"
				+ "                                                      </tr>"
				+ "                                                   </tbody>"
				+ "                                                </table>"
				+ "                                             </td>"
				+ "                                          </tr>"
				+ "                                          <tr>"
				+ "                                             <td>"
				+ "                                                "
				+ "                                             </td>"
				+ "                                          </tr>"
				+ "                                          <tr>"
				+ "                                             <td style=\"padding:0px;padding-left:25px;padding-right:25px\">"
				+ "                                                <table width=\"100%\" border=\"0\" style=\"border-collapse:collapse;border-spacing:0\">"
				+ "                                                   <tbody>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"16\"> </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:normal\">Warm Regards,</td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:normal\">Team Motor Insurance</td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:center\" height=\"15\"> </td>"
				+ "                                                      </tr>"
				+ "                                                   </tbody>"
				+ "                                                </table>"
				+ "                                             </td>"
				+ "                                          </tr>"
				+ "                                       </tbody>"
				+ "                                    </table>" + "									"
				+ "									</body>" + "								</html>";

		MimeMultipart multipart = new MimeMultipart("related");
		BodyPart messageBodyPart = new MimeBodyPart();
		MimeMessage message = new MimeMessage(session);
		try {
			message.setSubject("Motor Insurance");
			message.setFrom(new InternetAddress("himanshuasati249@gmail.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					emailId));

			messageBodyPart.setContent(messageBody, "text/html");

			multipart.addBodyPart(messageBodyPart);
			 message.setContent(multipart);
		        Transport.send(message);  
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
