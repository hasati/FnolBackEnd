package com.fnol.serviceImp;

import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fnol.daoImp.PaymentReferenceDAOImp;
import com.fnol.service.PaymentReferenceService;
import com.fnol.util.*;

@Service
public class PaymentReferenceServiceImp implements PaymentReferenceService {

	@Autowired
	PaymentReferenceDAOImp paymentRefernce;
	
	@Autowired
	UserMailForPayment userMail;
	
	public String updateDocumentVerify(String updateFlag,String caseNbr)  {
		
		Map<String,Object> details=paymentRefernce.updateDocumentVerify(updateFlag,caseNbr);
		System.out.println(details);
		if(details.get("EMAILID")!=null){
			try {
				UserMailForPayment(details.get("name").toString(),details.get("emailId").toString(),caseNbr);
			} catch (AddressException e) {
				System.out.println("AddressException");
				e.printStackTrace();
			} catch (MessagingException e) {
				System.out.println("MessageException");
				e.printStackTrace();
			}
		}
		return null;
	}

	public void UserMailForPayment(String name,String emailId, String caseNbr) throws AddressException, MessagingException {
		System.out.println("Triggher User Mail");
		userMail.triggerMailForPayment(name,emailId, caseNbr);
	}

	
}
