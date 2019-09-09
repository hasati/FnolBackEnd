package com.fnol.dto;

import java.util.Date;

public class SearchResultDTO {

	private String firstName;
	private String lastName;
	private String policyNumber;
	private Date policyEffectiveDate;
	private Date policyExpiryDate;
	private String vechicleModel;
	private String vechicleYear;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Date getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}

	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}

	public Date getPolicyExpiryDate() {
		return policyExpiryDate;
	}

	public void setPolicyExpiryDate(Date policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}

	public String getVechicleModel() {
		return vechicleModel;
	}

	public void setVechicleModel(String vechicleModel) {
		this.vechicleModel = vechicleModel;
	}

	public String getVechicleYear() {
		return vechicleYear;
	}

	public void setVechicleYear(String vechicleYear) {
		this.vechicleYear = vechicleYear;
	}

	@Override
	public String toString() {
		return "SearchResultDTO [firstName=" + firstName + ", lastName="
				+ lastName + ", policyNumber=" + policyNumber
				+ ", policyEffectiveDate=" + policyEffectiveDate
				+ ", policyExpiryDate=" + policyExpiryDate + ", vechicleModel="
				+ vechicleModel + ", vechicleYear=" + vechicleYear + "]";
	}

}
