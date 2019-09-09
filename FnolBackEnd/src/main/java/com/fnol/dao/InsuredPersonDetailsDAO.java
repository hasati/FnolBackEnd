package com.fnol.dao;


import com.fnol.dto.InsuredPersonDetailsDTO;
import com.fnol.util.InsuranceException;
import com.fnol.util.MyException;

public interface InsuredPersonDetailsDAO {
	public void insertInsuredPersonDetails(InsuredPersonDetailsDTO details,String caseNumber) throws InsuranceException;
	public String checkInsuredDetails(String dob,String phoneNumner,String caseNumber) throws MyException;
	
}
