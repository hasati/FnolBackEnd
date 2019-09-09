package com.fnol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fnol.dto.HotelDTO;
import com.fnol.serviceImp.HomeService;

@RestController 
public class HomeController {

	@Autowired
	HomeService service;
	
	 @GetMapping("/hotelName/{name}")  
	    public List<HotelDTO> SearchByName(@PathVariable String name){  
		 List<HotelDTO> details=service.SearchByName(name);
	        return details;  
	    }  
	 
	 @GetMapping("/cityName/{name}")  
	    public String SearchByCity(@PathVariable String name){ 
		 List<HotelDTO> details=service.SearchByCity(name);
	        return"City Name!"+details;  
	    }
	 
	 @GetMapping("/localityName/{name}")  
	    public String SearchByLocality(@PathVariable String name){  
	        return"Locality Name!"+name;  
	    }  
}
