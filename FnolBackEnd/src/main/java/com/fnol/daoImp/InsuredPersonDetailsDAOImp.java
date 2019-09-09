package com.fnol.daoImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fnol.dao.InsuredPersonDetailsDAO;
import com.fnol.dto.InsuredPersonDetailsDTO;
import com.fnol.util.InsuranceException;
import com.fnol.util.MyException;
import com.fnol.util.StringConstant;

@Repository
public class InsuredPersonDetailsDAOImp implements InsuredPersonDetailsDAO {

	@Autowired
	private JdbcTemplate jdbc;

	public void insertInsuredPersonDetails(InsuredPersonDetailsDTO details,
			String caseNumber) throws InsuranceException {

		jdbc.update(
				StringConstant.INSERT_INSURED_DETAILS,
				new Object[] { caseNumber, details.getPrefix(),
						details.getFirstName(), details.getMiddleName(),
						details.getLastName(), details.getGender(),
						details.getEmailId(), details.getMarriageStatus(),
						details.getDob(), details.getPhoneNumber(),
						details.getCity(), details.getState(),
						details.getCountry(), details.getSsnNumber(),
						details.getStreetName(), details.getStreetNumber(),
						details.getZipCode() });
		/*
		 * } catch (NestedRuntimeException e) {
		 * System.out.println(e.getMostSpecificCause().getLocalizedMessage());
		 * throw new InsuranceException(404, e.getMostSpecificCause()
		 * .getLocalizedMessage()); }
		 */

	}

	public String checkInsuredDetails(String dob, String phoneNumner,
			String caseNumber) throws  MyException {
		String emailId =null;
		try{
			 emailId = jdbc.queryForObject(
					StringConstant.VALIDATE_INSURED_PERSON, new Object[] { dob,
							phoneNumner, caseNumber }, String.class);

			if (emailId != null) {
				System.out.println(emailId);
				return emailId;
			}
		}
		catch(Exception e){
			throw new MyException("Data is not present","405");
		}
		return emailId;
	}

	

}
