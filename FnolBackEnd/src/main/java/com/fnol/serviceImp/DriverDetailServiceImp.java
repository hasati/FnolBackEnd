package com.fnol.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fnol.daoImp.DriverDetailsDAOImp;
import com.fnol.dto.DriverDetailsDTO;
import com.fnol.service.DriverDetailsService;
import com.fnol.util.AgentMailForVerfiy;
import com.fnol.util.UserMailAfterDriverDetails;

@Service
public class DriverDetailServiceImp implements DriverDetailsService {

	@Autowired
	DriverDetailsDAOImp driverDetailsImp;
	
	@Autowired
	AgentMailForVerfiy mailTriggerForVerify;

	@Autowired
	UserMailAfterDriverDetails mailForUser;
	

	public void checkInsuredDetails(List<DriverDetailsDTO> driverDetails,
			String insuredPersonCaseNumber, String insuredPersonName,
			String insuredPersonEmailId, MultipartFile[] file,
			MultipartFile[] file2, MultipartFile[] file3) {
		
		driverDetailsImp.checkInsuredDetails(driverDetails,
				insuredPersonCaseNumber,insuredPersonName, file, file2, file3);
		
		mailTriggerForVerify.sendHtmlEmail("Himanshu Asati",
				"himanshuasati249@gmail.com",insuredPersonCaseNumber);
		
		mailForUser.sendHtmlEmail(insuredPersonName,
				insuredPersonEmailId,insuredPersonCaseNumber, driverDetails);

	}

}
