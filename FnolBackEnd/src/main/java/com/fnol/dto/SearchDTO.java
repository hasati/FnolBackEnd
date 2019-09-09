package com.fnol.dto;

public class SearchDTO {

	private String policyNumber;
	private String policyExpiryDate;
	private String policyEffectiveDate;
	private String vechicleModel;
	private String caseNumber;
	private String agentName;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyExpiryDate() {
		return policyExpiryDate;
	}
	public void setPolicyExpiryDate(String policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}
	public String getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}
	public void setPolicyEffectiveDate(String policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}
	public String getVechicleModel() {
		return vechicleModel;
	}
	public void setVechicleModel(String vechicleModel) {
		this.vechicleModel = vechicleModel;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	@Override
	public String toString() {
		return "SearchDTO [policyNumber=" + policyNumber
				+ ", policyExpiryDate=" + policyExpiryDate
				+ ", policyEffectiveDate=" + policyEffectiveDate
				+ ", vechicleModel=" + vechicleModel + ", caseNumber="
				+ caseNumber + ", agentName=" + agentName + "]";
	}
	
}
