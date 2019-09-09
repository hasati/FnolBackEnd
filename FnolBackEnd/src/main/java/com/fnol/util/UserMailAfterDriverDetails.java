package com.fnol.util;

import java.util.List;
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

import com.fnol.dto.DriverDetailsDTO;

@Service
public class UserMailAfterDriverDetails {

	public void sendHtmlEmail(String name, String emailId, String caseNumber,
			List<DriverDetailsDTO> driverDetails) {

		String host = "smtp.gmail.com";
		String port = "587";
		String tableBody = "";
		for (int i = 0; i < driverDetails.size(); i++) {
			tableBody = tableBody
					+ "<tr  style='background-color: #dddddd;'><td style= ' border: 1px solid #dddddd ; text-align: left;padding: 8px;'>"
					+ driverDetails.get(i).getFirstName()
					+ "</td><td style= ' border: 1px solid #dddddd ; text-align: left;padding: 8px;'>"
					+ driverDetails.get(i).getLastName()
					+ "</td><td style= ' border: 1px solid #dddddd ; text-align: left;padding: 8px;'>"
					+ driverDetails.get(i).getLicenseNumber()
					+ "</td><td style= ' border: 1px solid #dddddd ; text-align: left;padding: 8px;'>"
					+ driverDetails.get(i).getDrivingexperience()
					+ "</td><td style= ' border: 1px solid #dddddd ; text-align: left;padding: 8px;'>"
					+  driverDetails.get(i).getVechileVINNumber()
					+ "</td><td style= ' border: 1px solid #dddddd ; text-align: left;padding: 8px;'>"
					+  driverDetails.get(i).getLicenseNumber();
		}

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
				+ "                                                         <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:normal\">You have taken the first step but it doesn't end here!</td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"8\"> </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                      <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:normal\">"
				+ "                                                           Please allow upto 72 hours to <strong>verfiy</strong> all the related document and given data. Case Number is H898948AXDFG"
				+ "                                                      </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"8\"> </td>"
				+ "                                                      </tr>"
				+ "                                                      <tr>"
				+ "                                                         <td style=\"margin:0;padding:0;font-size:14px;text-align:left;color:#4a4548;line-height:21px;font-family:Arial,Helvetica,sans-serif;font-weight:normal\">You will recevice the mail for futhure process</td>"
				+ "                                                      </tr>"
				+ "													  "
				+ "                                                      <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"16\"> </td>"
				+ "                                                      </tr>"
				+ "													   <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"16\"> </td>"
				+ "                                                      </tr>"
				+ "													  <tr>"
				+ "													   <table  width=\"50%\" border=\"0\" style=\"font-family: arial, sans-serif;border-collapse:collapse;border-spacing:0\">"
				+ "													   <tbody>"
				+ "														<tr>"
				+ "														<th style= \" border: 1px solid #dddddd ; text-align: left;padding: 8px;\">First Name</th>"
				+ "														<th style= \" border: 1px solid #dddddd ;text-align: left;padding: 8px;\">Last Name</th>"
				+ "														<th style= \" border: 1px solid #dddddd ; text-align: left;padding: 8px;\">License Number</th>"
				+ "														<th style= \" border: 1px solid #dddddd ; text-align: left;padding: 8px;\">Driving Experience</th>"
				+ "													  </tr>"
				+ tableBody
				+ "													  </tbody>"
				+ "													   </table>"
				+ "													  </tr>"
				+ "													   "
				+ "                                                   </tbody>"
				+ "                                                </table>"
				+ "                                             </td>"
				+ "                                          </tr>"
				+ "                                       </tbody>"
				+ "                                    </table>"
				+ "									"
				+ "									"
				+ "									<table bgcolor=\"#ffffff\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\" class=\"m_1787861041295368251devicewidth\" style=\"border-collapse:collapse;border-spacing:0\">"
				+ "                                                  <tbody>"
				+ "                                          <tr>"
				+ "                                             <td style=\"padding:0px;padding-left:25px;padding-right:25px\">"
				+ "                                                <table width=\"100%\" border=\"0\" style=\"border-collapse:collapse;border-spacing:0\">"
				+ "                                                   <tbody>"
				+ "                                                     "
				+ "													   <tr>"
				+ "                                                         <td style=\"line-height:0;font-size:0;vertical-align:top;padding:0px;text-align:left\" height=\"16\"> </td>"
				+ "                                                      </tr>"
				+ "													   <tr>"
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
				+ "                                    </table>"
				+ "									"
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
			System.out.println("Mail Trigger");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
