package com.springSecurityRest.SecurityConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springSecurityRest.Modal.user;
import com.springSecurityRest.Repository.userRepository;
@Service
public class customUserDetailService implements UserDetailsService {
    @Autowired
	userRepository userrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		user usr = userrepo.findByusername(username);
		if(usr==null) throw new UsernameNotFoundException("User not found exception");
		else {
		   return new customUserDetails(usr);	
		}
	}

}
