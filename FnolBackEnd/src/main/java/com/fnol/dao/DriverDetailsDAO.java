package com.fnol.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.fnol.dto.DriverDetailsDTO;

public interface DriverDetailsDAO {
	public void checkInsuredDetails(List<DriverDetailsDTO> driverDetails,String insuredPersonCaseNumber,String insuredPersonName,
			MultipartFile[] file, MultipartFile[] file2, MultipartFile[] file3);
}
