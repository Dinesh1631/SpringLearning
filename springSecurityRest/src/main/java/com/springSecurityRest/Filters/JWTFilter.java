package com.springSecurityRest.Filters;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.springSecurityRest.SecurityConfiguration.customUserDetailService;
import com.springSecurityRest.Service.jwtServices;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JWTFilter extends OncePerRequestFilter {
	@Autowired
	jwtServices jwt;
	@Autowired
	customUserDetailService userDetailService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String AuthToken = request.getHeader("Authorization");
		String username = "";
		String token = "";
		if (AuthToken != null && AuthToken.startsWith("Bearer ")) {
			token = AuthToken.substring(7);
			username = jwt.extractUserName(token);
		}
		
		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userdetails = userDetailService.loadUserByUsername(username);
			boolean validatedToken = jwt.validateToken(token, userdetails);
			if (validatedToken) {
				UsernamePasswordAuthenticationToken AuthToken1 = new UsernamePasswordAuthenticationToken(userdetails,
						null, userdetails.getAuthorities());
				/*
				 * The below line is ude to store aadditional detail in token from the request
				 * such as: The buildDetails() method extracts relevant information from the
				 * request, such as: Remote IP address, Session ID, Request method ,Request URL
				 * 
				 * The above details are used for better monitoring ,security auditing and session managemnet.
				 * Aso give better control over our security context.
				 */
				AuthToken1.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(AuthToken1);
			}

		}
		filterChain.doFilter(request, response);

	}

}
