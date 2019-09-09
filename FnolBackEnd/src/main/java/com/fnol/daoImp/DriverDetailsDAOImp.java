package com.fnol.daoImp;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.fnol.dao.DriverDetailsDAO;
import com.fnol.dto.DriverDetailsDTO;
import com.fnol.util.StringConstant;

@Repository
public class DriverDetailsDAOImp implements DriverDetailsDAO {

	@Autowired
	private JdbcTemplate jdbc;

	@Transactional
	public void checkInsuredDetails(List<DriverDetailsDTO> driverDetails,
			String insuredPersonCaseNumber, String insuredPersonName,
			MultipartFile[] file, MultipartFile[] file2, MultipartFile[] file3) {
			jdbc.update(StringConstant.UPDATE_LOCK,new Object[]{insuredPersonCaseNumber});
		for (int i = 0; i < driverDetails.size(); i++) {
			jdbc.update(StringConstant.INSERT_DRIVER_DETAILS,
					new Object[] { insuredPersonCaseNumber,
							driverDetails.get(i).getPrefix(),
							driverDetails.get(i).getFirstName(),
							driverDetails.get(i).getMiddleName(),
							driverDetails.get(i).getLastName(),
							driverDetails.get(i).getEmailId(),
							driverDetails.get(i).getDob(),
							driverDetails.get(i).getGender(),
							driverDetails.get(i).getMarriageStatus(),
							driverDetails.get(i).getRelation(),
							driverDetails.get(i).getLicenseStatus(),
							driverDetails.get(i).getDriverStatus(),
							driverDetails.get(i).getDrivingexperience(),
							driverDetails.get(i).getLicenseNumber(),
							driverDetails.get(i).getTrafficVoliation(),
							driverDetails.get(i).getTrafficAccident(),
							driverDetails.get(i).getVechileVINNumber(),
							driverDetails.get(i).getVechicleCompany(),
							driverDetails.get(i).getVechicleModel(),
							driverDetails.get(i).getVechicleNumber(),
							driverDetails.get(i).getVechileModelYear(),
							insuredPersonName
					});
			try {
				jdbc.update(StringConstant.INSERT_DRIVER_DOCUMENT,new Object[] {
						 insuredPersonCaseNumber,
						 file[i].getOriginalFilename(),
						 file[i].getContentType(),
						 file[i].getSize(),
						 "Adaar Card or Pan Card",	 
						 file2[i].getOriginalFilename(),
						 file2[i].getContentType(),
						 file2[i].getSize(),
						 "License",
						 file3[i].getOriginalFilename(),
						 file3[i].getContentType(),
						 file3[i].getSize(),
						 "Vechicle Paper",
						 file[i].getBytes(),
					//	 driverDetails.get(i).getFilepreview(),
						 file2[i].getBytes(),
					//	 driverDetails.get(i).getFilepreview2(),
						 file3[i].getBytes()
					//	 driverDetails.get(i).getFilepreview3(),	
				});
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
