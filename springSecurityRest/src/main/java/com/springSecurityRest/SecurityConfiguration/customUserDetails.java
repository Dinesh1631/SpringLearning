package com.springSecurityRest.SecurityConfiguration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springSecurityRest.Modal.user;

public class customUserDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private user usr;

	public customUserDetails(user usr) {
		super();
		this.usr = usr;
	}

	public customUserDetails() {

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authoroties = new ArrayList<>();
		SimpleGrantedAuthority role1 = new SimpleGrantedAuthority("User");
		authoroties.add(role1);
		return authoroties;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return usr.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return usr.getUsername();
	}

}
