package com.fnol.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnol.dto.SearchDTO;
import com.fnol.serviceImp.SearchScreenImpl;

@RestController
public class SearchScreenController {

	@Autowired
	SearchScreenImpl  searchScreenServie;
	
	@RequestMapping(value = "/searchScreenSearch/{searchScreenCrtieria}", method = RequestMethod.GET)
	public void searchScreenCrtieria(@PathVariable String searchScreenCrtieria) throws JsonParseException, JsonMappingException, IOException{
		  ObjectMapper mapper = new ObjectMapper();
		  SearchDTO searchScreenDTO=mapper.readValue(searchScreenCrtieria,SearchDTO.class);
		  searchScreenServie.searchService(searchScreenDTO);
		
	}
	
}
