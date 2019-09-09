package com.fnol.controller;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fnol.serviceImp.PaymentReferenceServiceImp;

@RestController
public class PaymentReferenceController {

	@Autowired
	PaymentReferenceServiceImp paymentReference;

	@RequestMapping(value = "/updateUserDocument", method = RequestMethod.POST)
	public void updateUserDocument(
			@RequestParam("updateFlag") String updateFlag,
			@RequestParam("caseNbr") String caseNumber){

		paymentReference.updateDocumentVerify(updateFlag, caseNumber);
		// update query for Document is verify
		// Mail Trigger for User Email id,Name(InsuredPerson)
	}

}
