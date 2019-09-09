package com.fnol.util;

public class PaymentReferenceStringConstant {

	public static final String UPDATE_DOCUMENT_FLAG="UPDATE INSURED_PERSON SET DOCUMENT_VERIFY =? WHERE CASE_NBR=?";
	public static final String GET_EMAIL_ID="SELECT EMAIL_ID as emailId, concat(concat(first_name,' '),last_name) as name FROM  INSURED_PERSON  WHERE CASE_NBR=? AND DOCUMENT_VERIFY IS NOT NULL ";
}
