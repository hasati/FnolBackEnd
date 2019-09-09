package com.fnol.dto;

import java.util.Date;

public class InsuredPersonDetailsDTO {

	String prefix;
	String firstName;
	String middleName;
	String lastName;
	String gender;
	Date dob;
	String emailId;
	String ssnNumber;
	String phoneNumber;
	String marriageStatus;
	Integer streetNumber;
	String streetName;
	String city;
	String state;
	String country;
	String zipCode;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMarriageStatus() {
		return marriageStatus;
	}
	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	public Integer getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	@Override
	public String toString() {
		return "InsuredPersonDetailsDTO [prefix=" + prefix + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", gender=" + gender + ", dob=" + dob
				+ ", emailId=" + emailId + ", ssnNumber=" + ssnNumber
				+ ", phoneNumber=" + phoneNumber + ", marriageStatus="
				+ marriageStatus + ", streetNumber=" + streetNumber
				+ ", streetName=" + streetName + ", city=" + city + ", state="
				+ state + ", country=" + country + ", zipCode=" + zipCode + "]";
	}

}
