package com.fnol.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fnol.daoImp.SearchScreenDAOImpl;
import com.fnol.dto.SearchDTO;
import com.fnol.service.SearchScreenService;

@Service
public class SearchScreenImpl implements SearchScreenService{

	@Autowired
	SearchScreenDAOImpl seachScreenDAO;
	
	public void searchService(SearchDTO serachScreenDTO) {
		seachScreenDAO.searchScreenDAO(serachScreenDTO);
		
	}

}
