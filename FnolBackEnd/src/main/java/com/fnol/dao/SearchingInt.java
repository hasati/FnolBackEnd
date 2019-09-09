package com.fnol.dao;

import java.util.List;

import com.fnol.dto.HotelDTO;

public interface SearchingInt {


	public List<HotelDTO> SearchByName(String str);
	public List<HotelDTO> SearchByCity(String str);
	public void SearchByLocality(String str);
	
}
