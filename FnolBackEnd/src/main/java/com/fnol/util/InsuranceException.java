package com.fnol.util;

@SuppressWarnings("serial")
public class InsuranceException extends Exception {

	int errorCode;
	String errorName;
	
	public InsuranceException(int i, String errorName) {
		super();
		this.errorCode = i;
		this.errorName = errorName;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorName() {
		return errorName;
	}
	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}
}
