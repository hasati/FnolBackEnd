package com.fnol.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fnol.daoImp.HomeDAO;
import com.fnol.dto.HotelDTO;
import com.fnol.service.Searching;

@Service
public class HomeService implements Searching {

	@Autowired
	HomeDAO homeDAO;
	public List<HotelDTO> SearchByName(String str) {
		return homeDAO.SearchByName(str);
	}

	public List<HotelDTO> SearchByCity(String str) {
	return	homeDAO.SearchByCity(str);
		
	}

	public void SearchByLocality(String str) {
		homeDAO.SearchByLocality(str);
		
	}
	

}
