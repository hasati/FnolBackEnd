package com.fnol.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fnol.dao.PaymentReferenceDAO;
import com.fnol.util.PaymentReferenceStringConstant;

@Repository
public class PaymentReferenceDAOImp implements PaymentReferenceDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Map<String,Object> updateDocumentVerify(String updateFlag, String caseNbr) {
		jdbcTemplate.update(
				PaymentReferenceStringConstant.UPDATE_DOCUMENT_FLAG,
				new Object[] { updateFlag, caseNbr });

		Map<String, Object> details= jdbcTemplate.queryForMap(
				PaymentReferenceStringConstant.GET_EMAIL_ID,
				new Object[] {caseNbr});

		return details;
	}



}
