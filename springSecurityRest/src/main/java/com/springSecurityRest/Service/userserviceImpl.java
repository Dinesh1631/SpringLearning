package com.springSecurityRest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.springSecurityRest.Modal.user;

@Service
public class userserviceImpl implements userService {
	@Autowired
	AuthenticationManager authenticationmanager;
	@Autowired
	jwtServices jwtservices;

	@Override
	public String login(user usr) {

		Authentication auth = authenticationmanager
				.authenticate(new UsernamePasswordAuthenticationToken(usr.getUsername(), usr.getPassword()));
		if (auth.isAuthenticated()) {

			return jwtservices.genetateToken(usr.getUsername());
		}
		return "Bad Creditals";

	}

}
