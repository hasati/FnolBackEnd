package com.fnol.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fnol.dao.SearchingInt;
import com.fnol.dto.HotelDTO;
import com.fnol.util.StringConstant;

@Repository
public class HomeDAO implements SearchingInt{

	
	@Autowired  
    private JdbcTemplate jdbc;  
	
	public List<HotelDTO> SearchByName(String name) {
		System.out.println(name);
		List<HotelDTO> details=jdbc.query(StringConstant.SELECT_NAME,new Object[] {name}, new BeanPropertyRowMapper<HotelDTO>(HotelDTO.class));
		System.out.println(details);
		return details;
	}

	public List<HotelDTO> SearchByCity(String cityName) {
		System.out.println(cityName);
		List<HotelDTO> details=jdbc.query(StringConstant.SELECT_CITY,new Object[] {cityName}, new BeanPropertyRowMapper<HotelDTO>(HotelDTO.class));
		System.out.println(details);
		return details;
	}

	public void SearchByLocality(String str) {
		
		
	}

}
