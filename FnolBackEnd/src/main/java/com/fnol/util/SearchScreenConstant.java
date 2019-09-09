package com.fnol.util;

public class SearchScreenConstant {

	public final static  String SEARCH_QUERY=" SELECT FIRST_NAME,LAST_NAME,POLICY_NBR,POLICY_EFFECTIVE_DATE,POLICY_EXPIRY_DATE FROM "+ 
								" INSURED_PERSON ip,POLICY_DETAILS pd WHERE ip.CASE_NBR=pd.CASE_NBR";
}
