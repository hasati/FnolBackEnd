package com.fnol.serviceImp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fnol.daoImp.InsuredPersonDetailsDAOImp;
import com.fnol.dto.InsuredPersonDetailsDTO;
import com.fnol.service.InsuredPersonDetailsService;
import com.fnol.util.MyException;
import com.fnol.util.UserMailForFillDriverDetails;

@Service
public class InsuredPersonDetailsServiceImp implements InsuredPersonDetailsService{

	@Autowired
	InsuredPersonDetailsDAOImp insuredPersonDAO;
	
	@Autowired
	UserMailForFillDriverDetails mailTrigger;
	
	public void insertInsuredPersonDetails(InsuredPersonDetailsDTO details) {

		String caseNumber=generateCaseNumber(details);
	
			try {
				insuredPersonDAO.insertInsuredPersonDetails(details,caseNumber);
				String name=details.getFirstName()+" "+details.getMiddleName()+" "+details.getLastName();
				mailTrigger.sendHtmlEmail(name,details.getEmailId(),caseNumber);
			} catch (Exception e) {
			System.out.println(e);
			}
		
		 
	}
	

	public String checkInsuredDetails(String dob,String phoneNumbner ,String caseNumber) throws MyException{
		return insuredPersonDAO.checkInsuredDetails(dob,phoneNumbner,caseNumber);
		
	}
	
	
	public  String generateCaseNumber(InsuredPersonDetailsDTO details){
		String fName=details.getFirstName().substring(0,3);
		String pHone=details.getPhoneNumber().substring(details.getPhoneNumber().length()-3);
		String ssn=details.getSsnNumber().substring(1,3);
		return fName+""+pHone+""+ssn;
	}



	

	
}
