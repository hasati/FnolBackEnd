package com.fnol.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fnol.dao.SearchScreenDAO;
import com.fnol.dto.SearchDTO;
import com.fnol.dto.SearchResultDTO;
import com.fnol.util.SearchScreenConstant;

@Repository
public class SearchScreenDAOImpl implements SearchScreenDAO{

	@Autowired
	private JdbcTemplate jdbc;
	
	public void searchScreenDAO(SearchDTO searchScreenDTO) {
		
		System.out.println(searchScreenDTO);
		List<SearchResultDTO> searchResultDTO=jdbc.queryForList(SearchScreenConstant.SEARCH_QUERY,new Object[] {searchScreenDTO}, SearchResultDTO.class);
		
		System.out.println(searchResultDTO);
	}

}
