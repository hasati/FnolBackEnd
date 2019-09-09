package com.fnol.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface PaymentReferenceService {

	public String updateDocumentVerify(String updateFlag,String caseNbr);
	public void UserMailForPayment(String name,String emailId,String caseNbr)  throws AddressException, MessagingException;
}
