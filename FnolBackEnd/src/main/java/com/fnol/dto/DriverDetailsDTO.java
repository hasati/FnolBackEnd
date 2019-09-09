package com.fnol.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeName;


public class DriverDetailsDTO {

	private String prefix;
	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private Date dob;
	private String gender;
	private String marriageStatus;
	private String relation;
	private String licenseStatus;
	private String driverStatus;
	private int drivingexperience;
	private String licenseNumber;
	private int trafficVoliation;
	private int trafficAccident;
	private String vechileVINNumber;
	private String vechicleCompany;
	private String vechicleModel;
	private Date vechileModelYear;
	private String vechicleNumber;
	private String filepreview;
	private String filepreview2;
	private String filepreview3;
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMarriageStatus() {
		return marriageStatus;
	}
	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getLicenseStatus() {
		return licenseStatus;
	}
	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}
	public String getDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(String driverStatus) {
		this.driverStatus = driverStatus;
	}
	public int getDrivingexperience() {
		return drivingexperience;
	}
	public void setDrivingexperience(int drivingexperience) {
		this.drivingexperience = drivingexperience;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public int getTrafficVoliation() {
		return trafficVoliation;
	}
	public void setTrafficVoliation(int trafficVoliation) {
		this.trafficVoliation = trafficVoliation;
	}
	public int getTrafficAccident() {
		return trafficAccident;
	}
	public void setTrafficAccident(int trafficAccident) {
		this.trafficAccident = trafficAccident;
	}
	public String getVechileVINNumber() {
		return vechileVINNumber;
	}
	public void setVechileVINNumber(String vechileVINNumber) {
		this.vechileVINNumber = vechileVINNumber;
	}
	public String getVechicleCompany() {
		return vechicleCompany;
	}
	public void setVechicleCompany(String vechicleCompany) {
		this.vechicleCompany = vechicleCompany;
	}
	public String getVechicleModel() {
		return vechicleModel;
	}
	public void setVechicleModel(String vechicleModel) {
		this.vechicleModel = vechicleModel;
	}
	public Date getVechileModelYear() {
		return vechileModelYear;
	}
	public void setVechileModelYear(Date vechileModelYear) {
		this.vechileModelYear = vechileModelYear;
	}
	public String getVechicleNumber() {
		return vechicleNumber;
	}
	public void setVechicleNumber(String vechicleNumber) {
		this.vechicleNumber = vechicleNumber;
	}
	public String getFilepreview() {
		return filepreview;
	}
	public void setFilepreview(String filepreview) {
		this.filepreview = filepreview;
	}
	public String getFilepreview2() {
		return filepreview2;
	}
	public void setFilepreview2(String filepreview2) {
		this.filepreview2 = filepreview2;
	}
	public String getFilepreview3() {
		return filepreview3;
	}
	public void setFilepreview3(String filepreview3) {
		this.filepreview3 = filepreview3;
	}
	@Override
	public String toString() {
		return "DriverDetailsDTO [prefix=" + prefix + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", dob=" + dob
				+ ", gender=" + gender + ", marriageStatus=" + marriageStatus
				+ ", relation=" + relation + ", licenseStatus=" + licenseStatus
				+ ", driverStatus=" + driverStatus + ", drivingexperience="
				+ drivingexperience + ", licenseNumber=" + licenseNumber
				+ ", trafficVoliation=" + trafficVoliation
				+ ", trafficAccident=" + trafficAccident
				+ ", vechileVINNumber=" + vechileVINNumber
				+ ", vechicleCompany=" + vechicleCompany + ", vechicleModel="
				+ vechicleModel + ", vechileModelYear=" + vechileModelYear
				+ ", vechicleNumber=" + vechicleNumber + ", filepreview="
				+ filepreview + ", filepreview2=" + filepreview2
				+ ", filepreview3=" + filepreview3 + "]";
	}
	
	
	



}
