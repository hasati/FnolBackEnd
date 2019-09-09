package com.fnol.util;

public class MyException extends Exception {

	String exceptionMsg;
	String errorCode;
	
	public MyException(String exceptionMsg, String errorCode) {
		super();
		this.exceptionMsg = exceptionMsg;
		this.errorCode = errorCode;
	}
	public MyException() {
		super();
	}
	public String getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	@Override
	public String toString() {
		return "MyException [exceptionMsg=" + exceptionMsg + ", errorCode="
				+ errorCode + "]";
	}
	
}
