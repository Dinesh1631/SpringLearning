package com.security.contollers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.security.DAO.passwordChangeDTO;
@Controller
public class passwordChangeController {
	@Autowired
	JdbcUserDetailsManager jdbcUserDetailsManager ;
	@Autowired
	@Lazy
	PasswordEncoder encoder;
	@RequestMapping("/changePassword")
	public String chagePassword(@ModelAttribute("password") passwordChangeDTO passwordChange) {
		
		return "changePassword";
	}
	
	@RequestMapping("/changePasswordProcess")
	public String chagePasswordProcess(@ModelAttribute("password") passwordChangeDTO passwordChange,Principal principal,Model model) {
		String enteredOldPassword = passwordChange.getOldPassword();
		UserDetails user = jdbcUserDetailsManager.loadUserByUsername(principal.getName());
		boolean match = encoder.matches(enteredOldPassword, user.getPassword());
		if(match && passwordChange.getNewPassword().equalsIgnoreCase(passwordChange.getConformPassword()))
		{ 
			jdbcUserDetailsManager.changePassword(enteredOldPassword, passwordChange.getNewPassword());
			return "Hello";
		}
		else {
			model.addAttribute("errorMessage", "oldPassord did't matched");
		return "changePassword";
		}
		
	}
	
	
	
}
