package com.fnol.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class CORSFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		response.addHeader(HttpHeaders.CONTENT_TYPE,"text/html;chaRSET=UTF-8");
		response.addHeader(HttpHeaders.ACCEPT,"application/json");
		response.addHeader("Access-Control-Allow-Origin","*");
		response.addHeader("Access-Control-Allow-Method","POST,PUT,GET,DELETE");
		response.addHeader("Access-Control-Max-Age","3600");
		response.addHeader("Access-Control-Allow-Headers","x-requestwith,Content-Type");
		filterChain.doFilter(request, response);
		
	}

	
}
