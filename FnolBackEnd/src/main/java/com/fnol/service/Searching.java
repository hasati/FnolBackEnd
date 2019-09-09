package com.fnol.service;

import java.util.List;

import com.fnol.dto.HotelDTO;

public interface Searching {

	public List<HotelDTO> SearchByName(String str);
	public List<HotelDTO> SearchByCity(String str);
	public void SearchByLocality(String str);
	
}
