package com.fnol.service;


import com.fnol.dto.InsuredPersonDetailsDTO;
import com.fnol.util.MyException;

public interface InsuredPersonDetailsService {

	public void insertInsuredPersonDetails(InsuredPersonDetailsDTO details);
	public String checkInsuredDetails(String dob,String phoneNumner,String caseNumber) throws MyException;
	
}
