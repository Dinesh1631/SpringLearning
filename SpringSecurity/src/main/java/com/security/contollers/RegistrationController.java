package com.security.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.security.DAO.userDAO;

@Controller()
public class RegistrationController {

	PasswordEncoder encoder;

	InMemoryUserDetailsManager inMemoeryUserDetailManager;

	JdbcUserDetailsManager jdbcDetailManager;

	@Lazy
	public RegistrationController(PasswordEncoder encoder, InMemoryUserDetailsManager inMemoeryUserDetailManager,
			JdbcUserDetailsManager jdbcDetailManager) {
		this.encoder = encoder;
		this.inMemoeryUserDetailManager = inMemoeryUserDetailManager;
		this.jdbcDetailManager = jdbcDetailManager;
	}

	@RequestMapping("/register")
	public String getRegistrationPage(@ModelAttribute("userDAO") userDAO userdao) {
		return "RegistrationPage";
	}

	@RequestMapping("/registerionProcessPage")
	public String getRegistrationProcessPage(@ModelAttribute("userDAO") userDAO userdao) {
		String encodedPassword = encoder.encode(userdao.getPassword());
		UserDetails newUser = User.withUsername(userdao.getUserName()).password(encodedPassword).roles("user","admin").build();
		//inMemoeryUserDetailManager.createUser(newUser);
		jdbcDetailManager.createUser(newUser);
		return "RegistrationProcess";
	}

}
