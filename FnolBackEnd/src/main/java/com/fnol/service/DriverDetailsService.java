package com.fnol.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.fnol.dto.DriverDetailsDTO;

public interface DriverDetailsService {
	public void checkInsuredDetails(List<DriverDetailsDTO> driverDetails,
			String insuredPersonCaseNumber, String insuredPersonName,
			String insuredPersonEmailId, MultipartFile[] file,
			MultipartFile[] file2, MultipartFile[] file3);
}
