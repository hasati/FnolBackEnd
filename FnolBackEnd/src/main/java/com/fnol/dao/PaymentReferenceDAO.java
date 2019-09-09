package com.fnol.dao;

import java.util.Map;

public interface PaymentReferenceDAO {

	public Map<String,Object> updateDocumentVerify(String updateFlag,String caseNbr);
}
