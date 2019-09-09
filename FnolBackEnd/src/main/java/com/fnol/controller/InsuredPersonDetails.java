package com.fnol.controller;



import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fnol.dto.InsuredPersonDetailsDTO;
import com.fnol.serviceImp.InsuredPersonDetailsServiceImp;
import com.fnol.util.MyException;

@RestController
public class InsuredPersonDetails {

	@Autowired
	InsuredPersonDetailsServiceImp insuredPersonService;

	@PostMapping("/insertInsuredPersonDetails")
	public void insertInseruedPersonDetails(
			@RequestBody InsuredPersonDetailsDTO details) {
		System.out.println(details);
		insuredPersonService.insertInsuredPersonDetails(details);

	}
	@GetMapping("/checkInsuredDetails/{insuredPersonPhoneNumber}/{insuredPeronsdob}/{caseNumber}")
//	@ExceptionHandler(MyException.class)
	public HashMap<String,String>  checkInsuredDetails(
			@PathVariable String insuredPeronsdob,
			@PathVariable String insuredPersonPhoneNumber,
			@PathVariable String caseNumber, HttpServletResponse response) throws MyException  {

		System.out.println(insuredPersonPhoneNumber+" "+insuredPeronsdob);
		HashMap<String,String> resp=new HashMap<String,String>();
		String emailId= insuredPersonService.checkInsuredDetails(insuredPeronsdob,insuredPersonPhoneNumber,caseNumber);
		resp.put("emailId",emailId);
		return resp;
	}


}
